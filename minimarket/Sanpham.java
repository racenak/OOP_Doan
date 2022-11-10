package minimarket;

import java.util.Scanner;

class Date{
    private int d,m,y;
    Scanner sc=new Scanner(System.in);

    public Date(){}

    public Date(int d,int m,int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }

    public int getd(){
        return d;
    }

    public void setd(int d){
        this.d=d;
    }

    public int getm(){
        return m;
    }

    public void setm(int m){
        this.m=m;
    }

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y=y;
    }

    public void inputDATE(){
        while(true)
        {
        System.out.print("Hay nhap ngay : ");
        d=Integer.parseInt(sc.nextLine());
        if(d>0 && d<32) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
        while(true)
        {
        System.out.print("Hay nhap thang : ");
        m=Integer.parseInt(sc.nextLine());
        if(m>0 && m<13) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
        while(true)
        {
        System.out.print("Hay nhap nam : ");
        y=Integer.parseInt(sc.nextLine());
        if(y>1000) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public String outputDATE(){
        return String.format("%d/%d/%d",d,m,y);
    }
}

public class Sanpham {
    long Gia;
    int Sl;
    String MaSP;
    String Ten,Hang;
    Date HSD,NSX;
    Scanner sc=new Scanner(System.in);

    public Sanpham(){
        this.HSD = new Date();
        this.NSX = new Date();
    }

    public Sanpham(String MaSP,String Ten,Date HSD,Date NSX,long Gia,String Hang,int Sl)
    {
        this.MaSP=MaSP;
        this.Ten=Ten;
        this.HSD=HSD;
        this.NSX=NSX;
        this.Hang=Hang;
        this.Gia=Gia;
        this.Sl=Sl;
    }

    public String getMaSP(){
        return MaSP;
    }

    public void setMaSP(String MaSP){
        this.MaSP=MaSP;
    }

    public String getTen(){
        return Ten;
    }

    public void setTen(String Ten){
        this.Ten=Ten;
    }

    public Date getHSD(){
        return HSD;
    }

    public void setHSD(Date HSD){
        this.HSD=HSD;
    }

    public Date getNSX(){
        return NSX;
    }

    public void setNSX(Date NSX){
        this.NSX=NSX;
    }

    public String getHang(){
        return Hang;
    }

    public void setHang(String Hang){
        this.Hang=Hang;
    }

    public long getGia(){
        return Gia;
    }

    public void setGia(long Gia){
        this.Gia=Gia;
    }
    
    public int getSl(){
        return Sl;
    }

    public void setSl(int Sl){
        this.Sl=Sl;
    }

    public void inputMaSP(){
        
    }

    public void Input()
    {
        inputMaSP();
        System.out.print("Hay nhap ten san pham : ");
        Ten=sc.nextLine();
        System.out.println("Hay nhap ngay san xuat : ");
        NSX.inputDATE();
        System.out.println("Hay nhap ngay het han : ");
        HSD.inputDATE();
        System.out.print("Hay nhap ten hang : ");
        Hang=sc.nextLine();
        System.out.print("Hay nhap gia tien : ");
        Gia=Long.parseLong(sc.nextLine());
        System.out.print("Hay nhap so luong : ");
        Sl=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString()
    {
        return String.format("%-10s %-20s %-20s %-20s %-20s %-10d %-15d",MaSP,Ten,NSX.outputDATE(),HSD.outputDATE(),Hang,Sl,Gia);
    }

    public void toStringL(){

    }

}

class MyPham extends Sanpham{
    private String Loai;

    public String getLoai(){
        return Loai;
    }

    public void setLoai(String Loai){
        this.Loai=Loai;
    }  

    @Override
    public void inputMaSP(){
        System.out.println("Ma san pham co 2 ky tu dau la 'MP' va thu tu sau co 3 so (VD:MP001).");
        while(true)
        {
        System.out.print("Hay nhap ma san pham : ");
        MaSP=sc.nextLine();
        if(MaSP.substring(0,2).equals("MP") && MaSP.substring(2).length()==3) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public void Input(){
       super.Input();
       System.out.print("Nhap loai my pham : ");
       Loai=sc.nextLine();
    }

    @Override
    public void toStringL(){
        System.out.println(super.toString()+String.format(" %-20s",Loai));
    }

}

class ThoiTrang extends Sanpham{
    public Boolean GioiTinh;

    public Boolean getGioiTinh()
    {
        return GioiTinh;
    }

    public void getGioiTinh(boolean GioiTinh)
    {
        this.GioiTinh=GioiTinh;
    }

    @Override
    public void inputMaSP(){
        System.out.println("Ma san pham co 2 ky tu dau la 'TT' va thu tu sau co 3 so (VD:TT001).");
        while(true)
        {
        System.out.print("Hay nhap ma san pham : ");
        MaSP=sc.nextLine();
        if(MaSP.substring(0,2).equals("TT") && MaSP.substring(2).length()==3) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public void Input(){
        super.Input();
        boolean flag=true;
        do{
        System.out.println("Hay nhap gioi tinh ( 1:Nam || 0:Nu )");
        if(sc.nextLine().equals("1"))
        {
            GioiTinh=true;
            flag=false;
        }
        else if(sc.nextLine().equals("0"))
        {
            GioiTinh=false;
            flag=false;
        }
        else{
            System.out.println("Nhap sai vui long nhap lai ");
        }
        }while(flag);
    }

    @Override
    public void toStringL(){
        if(GioiTinh)
        {
            System.out.println(super.toString()+String.format(" %-15s","Nam"));
        }
        else
        {
            System.out.println(super.toString()+String.format(" %-15s","Nu"));
        }
    }
}

class VPPham extends Sanpham{
    private String ChatLieu;
    private String DoiTuong;

    public String getChatLieu(){
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu){
        this.ChatLieu=ChatLieu;
    }  

    public String getDoiTuong(){
        return DoiTuong;
    }

    public void setDoiTuong(String DoiTuong){
        this.DoiTuong=DoiTuong;
    }

    @Override
    public void inputMaSP(){
        System.out.println("Ma san pham co 2 ky tu dau la 'PP' va thu tu sau co 3 so (VD:PP001).");
        while(true)
        {
        System.out.print("Hay nhap ma san pham : ");
        MaSP=sc.nextLine();
        if(MaSP.substring(0,2).equals("PP") && MaSP.substring(2).length()==3) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public void Input(){
        super.Input();
        System.out.print("Hay nhap loai chat lieu : ");
        ChatLieu=sc.nextLine();
        System.out.print("Hay nhap doi tuong su dung : ");
        DoiTuong=sc.nextLine();
    }

    @Override
    public void toStringL(){
        System.out.println(super.toString()+String.format(" %-20s %-20s",ChatLieu,DoiTuong));
    }

}

class ThucPham extends Sanpham{
    private String CheBien;
    
    public String getCheBien(){
        return CheBien;
    }

    public void setCheBien(String CheBien){
        this.CheBien=CheBien;
    } 
    
    @Override
    public void inputMaSP(){
        System.out.println("Ma san pham co 2 ky tu dau la 'TP' va thu tu sau co 3 so (VD:PP001).");
        while(true)
        {
        System.out.print("Hay nhap ma san pham : ");
        MaSP=sc.nextLine();
        if(MaSP.substring(0,2).equals("TP") && MaSP.substring(2).length()==3) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public void Input(){
        super.Input();
        System.out.print("Hay nhap cach che bien : ");
        CheBien=sc.nextLine();
    }

    @Override
    public void toStringL(){
        System.out.println(super.toString()+String.format(" %-20s",CheBien));
    }   
}

class ThucUong extends Sanpham{
    private String Loai;
    private String DongGoi;

    public String getLoai(){
        return Loai;
    }

    public void setLoai(String Loai){
        this.Loai=Loai;
    }  

    public String getDongGoi(){
        return DongGoi;
    }

    public void setDongGoi(String DongGoi){
        this.DongGoi=DongGoi;
    }
    
    @Override
    public void inputMaSP(){
        System.out.println("Ma san pham co 2 ky tu dau la 'TU' va thu tu sau co 3 so (VD:PP001).");
        while(true)
        {
        System.out.print("Hay nhap ma san pham : ");
        MaSP=sc.nextLine();
        if(MaSP.substring(0,2).equals("TU") && MaSP.substring(2).length()==3) {break;}
        else {System.out.println("Vui long nhap lai");}
        }
    }

    public void Input(){
        super.Input();
        System.out.print("Hay nhap loai thuc uong : ");
        Loai=sc.nextLine();
        System.out.print("Hay nhap cach dong goi : ");
        DongGoi=sc.nextLine();
    }

    @Override
    public void toStringL(){
        System.out.println(super.toString()+String.format(" %-20s -%20s",Loai,DongGoi));
    }
}
