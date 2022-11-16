package minimarket;

import java.util.Scanner;

public class ListNhanCong {
	private int n;
    Nhancong List[];
    Scanner sc=new Scanner(System.in);

    public int Getn(){
        return n;
    }

    public void Setn(int n){
        this.n=n;
    }

    public Nhancong[] getList(){
        return List;
    }

    public void setList(Nhancong[] List){
        this.List=List;
    }

    public void input_List(){
        System.out.println("Hay nhap so luong nhan cong :");
        n=Integer.parseInt(sc.nextLine());
        List=new Nhancong[n];
        int choice;
        boolean flag=true;
        for(int i=0;i<n;i++){
            System.out.printf("Hay nhap nhan cong thu %d : \n",i+1);
            System.out.println("1.Quan Ly\n"+"2.Nhan Vien\n");
            System.out.print("Hay chon kieu nhan cong muon them :");
            choice=Integer.parseInt(sc.nextLine());
            do
            {
            switch (choice) {
                case 1:
                {
                    List[i]=new QuanLy();
                    List[i].Input();
                    flag=false;
                    break;
                }
                case 2:
                {
                    List[i]=new NhanVien();
                    List[i].Input();
                    flag=false;
                    break;
                }
                default:
                {
                    System.out.println("Lua chon khong phu hop vui long nhap lai ");
                    break;
                }
            }
            }while(flag);
        }
    }

    public void output_ListQL(){
        System.out.println("Danh sach cac quan ly : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s\n","Ma","Ten","SDT","Ngay BD","Luong","Kinh nghiem");
        for(int i=0;i<List.length;i++)
        {
            if(List[i] instanceof QuanLy)
            {
               List[i].toString();
            }
        }
    }

    public void output_ListNV(){
        System.out.println("Danh sach cac nhan vien : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s \n","Ma","Ten","SDT","Ngay BD","Luong","Ca","Vai tro");
        for(int i=0;i<List.length;i++)
        {
            if(List[i] instanceof NhanVien)
            {
               List[i].toString();
            }
        }
    }

    public void output_List(){
        System.out.println("Danh sach toan bo nhan cong : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s \n","Ma","Ten","SDT","Ngay BD","Luong");
        for(int i=0;i<List.length;i++)
        {
            System.out.println(List[i].toString());
        }
    }

    public Nhancong[] AddList1(){
        int choice;
        Nhancong a = new Nhancong() {};
        boolean flag=true;
        System.out.println("1.Quan ly\n"+"2.Nhan vien\n");
        System.out.print("Hay chon kieu nhan cong muon them :");
        choice=Integer.parseInt(sc.nextLine());
        do
        {
        switch (choice) {
        case 1:
            {
                a=new QuanLy();
                a.Input();
                flag=false;
                break;
            }
        case 2:
            {
                a=new NhanVien();
                a.Input();
                flag=false;
                break;
            }
        default:
            {
                System.out.println("Lua chon khong phu hop vui long nhap lai ");
                break;
            }
            }
        }while(flag);
        Nhancong Copied[]=new Nhancong[List.length+1];
        for(int i=0;i<List.length;i++)
        {
            Copied[i]=List[i];
        }
        Copied[List.length]=a;
        n=n+1;
        System.out.println("Them san pham thanh cong !");
        return Copied;
    }

    public Nhancong[] AddListn(){
        int i,k,choice;
        while(true){
            System.out.println("Nhap so nhan cong can them :");
            k=Integer.parseInt(sc.nextLine());
            if(k>0) break;
            System.out.println("Nhap khong hop le vui long nhap lai");
        }
        Nhancong Copied[]=new Nhancong[List.length+k];
        for(i=0;i<List.length;i++)
        {
            Copied[i]=List[i];
        }
        int t=List.length;
        for(i=0;i<k;i++)
        {
            System.out.printf("Nhap thong tin cua nhan cong thu %d can them: \n",i+1);
            Nhancong a=new Nhancong() {};
            boolean flag=true;
            System.out.println("1.Quan ly\n"+"2.Nhan vien\n");
            System.out.print("Hay chon lai nhan cong muon them :");
            choice=Integer.parseInt(sc.nextLine());
            do
            {
            switch (choice) {
            case 1:
                {
                    a=new QuanLy();
                    a.Input();
                    flag=false;
                    break;
                }
            case 2:
                {
                    a=new NhanVien();
                    a.Input();
                    flag=false;
                    break;
                }
            default:
                {
                    System.out.println("Lua chon khong phu hop vui long nhap lai ");
                    break;
                }
                }
            }while(flag);
            Copied[t++]=a;
        }
        n=t;
        System.out.println("Them san pham thanh cong !");
        return Copied;
    }

    public Nhancong[] Delete(){
        int i,temp=-1;
        long k;
        while(true){
            System.out.println("Nhap ma so san pham can xoa :");
            k=Long.parseLong(sc.nextLine());
            for(i=0;i<List.length;i++)
            {
            if(List[i].MaNC==k){
                temp=i;
                break;
                }
            }
            if(temp==-1)
            {
                System.out.println("Khong tim thay vui long nhap lai");
            }
            else
            {
                break;
            }
        }
        Nhancong Copied[]=new Nhancong[List.length-1];
        for(i=0;i<temp;i++)
        {
            Copied[i]=List[i];
        }
        for(i=temp+1;i<List.length;i++)
        {
            Copied[i-1]=List[i];
        }
        n=n-1;
        System.out.println("Xoa san pham thanh cong !");
        return Copied;
    }
}
