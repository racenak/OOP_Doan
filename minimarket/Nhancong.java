package minimarket;

import java.util.Scanner;

abstract public class Nhancong {
    private long Luong;
    long MaNC;
    private String Ten,SDT;
    private Date NgayBD;
    Scanner sc=new Scanner(System.in);

    public Nhancong(){
        NgayBD=new Date();
    }

    public Nhancong(long MaNC,String Ten,String SDT,Date NgayBD,long Luong)
    {
        this.MaNC=MaNC;
        this.Ten=Ten;
        this.SDT=SDT;
        this.NgayBD=NgayBD;
        this.Luong=Luong;
    }

    public long getMaNC(){
        return MaNC;
    }

    public void setMaNC(long MaNC){
        this.MaNC=MaNC;
    }

    public String getTen(){
        return Ten;
    }

    public void setTen(String Ten){
        this.Ten=Ten;
    }

    public String getSDT(){
        return SDT;
    }

    public void setSDT(String SDT){
        this.SDT=SDT;
    }

    public Date getNgayBD(){
        return NgayBD;
    }

    public void setNgayBD(Date NgayBD){
        this.NgayBD=NgayBD;
    }

    public long getLuong(){
        return Luong;
    }

    public void setLuong(long Luong){
        this.Luong=Luong;
    }

    public void Input()
    {
        System.out.print("Hay nhap ma nhan cong : ");
        MaNC=Long.parseLong(sc.nextLine());
        System.out.print("Hay nhap ten nhan cong : ");
        Ten=sc.nextLine();
        System.out.print("Hay nhap so dien thoai : ");
        SDT=sc.nextLine();
        System.out.print("Hay nhap ngay bat dau lam : ");
        NgayBD.inputDATE();
        System.out.print("Hay nhap muc luong : ");
        Luong=Long.parseLong(sc.nextLine());
    }

    @Override
    public String toString()
    {
        return String.format("%-10d %-20s %-20s %-20s %-15d",MaNC,Ten,SDT,NgayBD.outputDATE(),Luong);
    }
}

class NhanVien extends Nhancong
{
    private int Ca;
    private String VaiTro;

    public int getCa(){
        return Ca;
    }

    public void setCa(int Ca){
        this.Ca=Ca;
    }

    public String getVaiTro(){
        return VaiTro;
    }

    public void setVaiTro(String VaiTro){
        this.VaiTro=VaiTro;
    }

    public void Input(){
        super.Input();
        System.out.print("Hay nhap ca lam :");
        Ca=Integer.parseInt(sc.nextLine());
        System.out.print("Hay nhap vai tro :");
        VaiTro=sc.nextLine();
    }

    @Override
    public String toString(){
        return super.toString()+String.format("%-5d %-20s",Ca,VaiTro);
    }
}

class QuanLy extends Nhancong{
    private int KinhNghiem;

    public int getKinhNghiem(){
        return KinhNghiem;
    }

    public void setKinhNghiem(int KinhNghiem){
        this.KinhNghiem=KinhNghiem;
    }

    public void Input(){
        super.Input();
        System.out.print("Hay nhap so thang da lam :");
        KinhNghiem=Integer.parseInt(sc.nextLine());
    }  
    
    @Override
    public String toString(){
        return super.toString()+String.format("%-20s",KinhNghiem);
    }
}