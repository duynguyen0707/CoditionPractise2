import java.util.Scanner;

public class Exercise9 {
    public static void main(String[]args){
//        Nhập độ dài 3 cạnh. Kiểm tra đó có phải là tam giác
//        không và là tam giác gì?
//        tam giác cân có hai cạnh = nhau
//        tam giác vuông bc2 = ab2 + ac2
        int ab;
        int ac;
        int bc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh AB: ");
       ab=sc.nextInt();
       if(ab<=0){
           System.out.println("Invalid Value");
           return;
       }
        System.out.print("Nhập cạnh AC: ");
        ac=sc.nextInt();
        if(ac<=0){
            System.out.println("Invalid Value");
            return;
        }
        System.out.print("Nhập cạnh BC: ");
        bc=sc.nextInt();

        if(bc<=0){
            System.out.println("Invalid Value");
            return;
        }
        int a= (int) Math.pow(ab,2);
        int b= (int) Math.pow(ac,2);
        int c= (int) Math.pow(bc,2);

        if (ac==ab ||ac==bc ||ab==bc){
            if((ab==ac && ac==bc && ab==bc)){
                System.out.println("Đây là tam giác đều");
            }
            else {
                System.out.println("Đây là tam giác cân");
            }
        }
        if (ac!=ab && ab !=bc && ac!=bc) {
            if(((a==b+c)||(b==a+c) || (c==a+b) )){
                System.out.println("Đây là tam giác vuông");

            }
            else {
                System.out.println("Đây là tam giác thường");
            }
        }

    }
}
