package minimarket;

import java.util.Scanner;

public class Kho {
    private int n;
    Sanpham List[];
    Scanner sc=new Scanner(System.in);

    public int Getn(){
        return n;
    }

    public void Setn(int n){
        this.n=n;
    }

    public Sanpham[] getList(){
        return List;
    }

    public void setList(Sanpham[] List){
        this.List=List;
    }

    public void input_List(){
        System.out.println("Hay nhap so luong san pham :");
        n=Integer.parseInt(sc.nextLine());
        List=new Sanpham[n];
        int choice;
        boolean flag=true;
        for(int i=0;i<n;i++){
            System.out.printf("Hay nhap san pham thu %d : \n",i+1);
            System.out.println("1.My pham\n"+"2.Thoi trang\n"+"3.Van phong pham\n"+"4.Thuc pham\n"+"5.Thuc uong\n");
            System.out.print("Hay chon loai san pham muon them :");
            choice=Integer.parseInt(sc.nextLine());
            do
            {
            switch (choice) {
                case 1:
                {
                    List[i]=new MyPham();
                    List[i].Input();
                    flag=false;
                    break;
                }
                case 2:
                {
                    List[i]=new ThoiTrang();
                    List[i].Input();
                    flag=false;
                    break;
                }
                case 3:
                {
                    List[i]=new VPPham();
                    List[i].Input();
                    flag=false;
                    break;
                }
                case 4:
                {
                    List[i]=new ThucPham();
                    List[i].Input();
                    flag=false;
                    break;
                }
                case 5:
                {
                    List[i]=new ThucUong();
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

    public void output_ListMP(){
        System.out.println("Danh sach cac mat hang my pham : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s %-20s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia","Loai");
        for(int i=0;i<List.length;i++)
        {
            if(List[i].MaSP.substring(0,2).equals("MP"))
            {
               List[i].toStringL();
            }
        }
    }

    public void output_ListTT(){
        System.out.println("Danh sach cac mat hang trang phuc : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s %-15s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia","Gioi tinh");
        for(int i=0;i<List.length;i++)
        {
            if(List[i].MaSP.substring(0,2).equals("TT"))
            {
               List[i].toStringL();
            }
        }
    }

    public void output_ListPP(){
        System.out.println("Danh sach cac mat hang van phong pham : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s %-20s %-20s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia","Chat lieu","Doi tuong");
        for(int i=0;i<List.length;i++)
        {
            if(List[i].MaSP.substring(0,2).equals("PP"))
            {
               List[i].toStringL();
            }
        }
    }

    public void output_ListTP(){
        System.out.println("Danh sach cac mat hang thuc pham : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s %-20s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia","Che bien");
        for(int i=0;i<List.length;i++)
        {
            if(List[i].MaSP.substring(0,2).equals("TP"))
            {
               List[i].toStringL();
            }
        }
    }

    public void output_ListTU(){
        System.out.println("Danh sach cac mat hang thuc pham : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s %-20s %-20s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia","Loai","Dong goi");
        for(int i=0;i<List.length;i++)
        {
            if(List[i].MaSP.substring(0,2).equals("TU"))
            {
               List[i].toStringL();
            }
        }
    }

    public void output_List(){
        System.out.println("Danh sach cac mat hang trong kho : ");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-10s %-15s\n","Ma","Ten","NSX","HSD","Hang","SL","Gia");
        for(int i=0;i<List.length;i++)
        {
            System.out.println(List[i].toString());
        }
    }

    public Sanpham[] AddList1(){
        int choice;
        Sanpham a=new Sanpham();
        boolean flag=true;
        System.out.println("1.My pham\n"+"2.Thoi trang\n"+"3.Van phong pham\n"+"4.Thuc pham\n"+"5.Thuc uong\n");
        System.out.print("Hay chon lai san pham muon them :");
        choice=Integer.parseInt(sc.nextLine());
        do
        {
        switch (choice) {
        case 1:
            {
                a=new MyPham();
                a.Input();
                flag=false;
                break;
            }
        case 2:
            {
                a=new ThoiTrang();
                a.Input();
                flag=false;
                break;
            }
        case 3:
            {
                a=new VPPham();
                a.Input();
                flag=false;
                break;
            }
        case 4:
            {
                a=new ThucPham();
                a.Input();
                flag=false;
                break;
            }
        case 5:
            {
                a=new ThucUong();
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
        Sanpham Copied[]=new Sanpham[List.length+1];
        for(int i=0;i<List.length;i++)
        {
            Copied[i]=List[i];
        }
        Copied[List.length]=a;
        n=n+1;
        System.out.println("Them san pham thanh cong !");
        return Copied;
    }

    public Sanpham[] AddListn(){
        int i,k,choice;
        while(true){
            System.out.println("Nhap so san pham can them :");
            k=Integer.parseInt(sc.nextLine());
            if(k>0) break;
            System.out.println("Nhap khong hop le vui long nhap lai");
        }
        Sanpham Copied[]=new Sanpham[List.length+k];
        for(i=0;i<List.length;i++)
        {
            Copied[i]=List[i];
        }
        int t=List.length;
        for(i=0;i<k;i++)
        {
            System.out.printf("Nhap thong tin cua san pham thu %d can them: \n",i+1);
            Sanpham a=new Sanpham();
            boolean flag=true;
            System.out.println("1.My pham\n"+"2.Thoi trang\n"+"3.Van phong pham\n"+"4.Thuc pham\n"+"5.Thuc uong\n");
            System.out.print("Hay chon lai san pham muon them :");
            choice=Integer.parseInt(sc.nextLine());
            do
            {
            switch (choice) {
            case 1:
                {
                    a=new MyPham();
                    a.Input();
                    flag=false;
                    break;
                }
            case 2:
                {
                    a=new ThoiTrang();
                    a.Input();
                    flag=false;
                    break;
                }
            case 3:
                {
                    a=new VPPham();
                    a.Input();
                    flag=false;
                    break;
                }
            case 4:
                {
                    a=new ThucPham();
                    a.Input();
                    flag=false;
                    break;
                }
            case 5:
                {
                    a=new ThucUong();
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

    public Sanpham[] Delete(){
        int i,temp=-1;
        String k;
        while(true){
            System.out.println("Nhap ma so san pham can xoa :");
            k=sc.nextLine();
            for(i=0;i<List.length;i++)
            {
            if(List[i].MaSP.equals(k)){
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
        Sanpham Copied[]=new Sanpham[List.length-1];
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
