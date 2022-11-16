package minimarket;

import java.util.Scanner;

class KhachHang{
    private String Hoten;
    private String SDT;
    Scanner sc=new Scanner(System.in);

    public KhachHang(){}

    public KhachHang(String Hoten,String SDT)
    {
        this.Hoten=Hoten;
        this.SDT=SDT;
    }

    public String getHoten(){
        return Hoten;
    }
    
    public void setHoten(String Hoten){
        this.Hoten=Hoten;
    } 

    public String getSDT(){
        return SDT;
    }
    
    public void setSDT(String SDT){
        this.SDT=SDT;
    }

    public void input(){
        System.out.print("Hay nhap ho va ten : ");
        Hoten=sc.nextLine();
        System.out.print("Hay nhap so dien thoai : ");
        SDT=sc.nextLine();
    }

}

class Don{
    String MaSP;
    int SL;
    Scanner sc=new Scanner(System.in);

    public Don(){};

    public Don(String MaSP,int SL){
        this.MaSP=MaSP;
        this.SL=SL;
    }

    public String setMaSP(){
        return MaSP;
    }

    public void getMaSP(String MaSP){
        this.MaSP=MaSP;
    }

    public int setSL(){
        return SL;   
    }

    public void getSL(int SL){
        this.SL=SL;
    }
}

public class GioHang{
    KhachHang Cus;
    int n;
    Don List[];
    Scanner sc=new Scanner(System.in);

    public GioHang(){
        Cus=new KhachHang();
    }

    public GioHang(KhachHang Cus,int n){
        this.Cus=Cus;
        this.n=n;
    }

    public KhachHang getCus(){
        return Cus;
    }

    public void setCus(KhachHang Cus){
        this.Cus=Cus;
    }

    public int setn(){
        return n;
    }

    public void getn(int n){
        this.n=n;
    }

    public Don[] getList(){
        return List;
    }

    public void setList(Don[] List){
        this.List=List;
    }

    public void HoaDon(){

    }
}

class GioHangList{
    int n=0;
    GioHang List[];

    public GioHangList(){
        List=new GioHang[0];
    }

    public GioHang[] input(GioHang a){
        GioHang Copied[]=new GioHang[n+1];
        for(int i=0;i<List.length;i++)
        {
            Copied[i]=List[i];
        }
        Copied[List.length]=a;
        n=n+1;
        return Copied;
    }
}
