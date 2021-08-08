import java.util.Scanner;

public class Exercise3 {
    public static void main (String[] args){
//        Giải phương trình bậc nhất ax + b = 0.
        int a;
        int b;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }

            }
        else {
            nghiem=(double)(-b)/a;
            System.out.println("Phương trình có nghiệm x =" +nghiem);
        }
        }
    }

