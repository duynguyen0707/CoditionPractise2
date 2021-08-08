
import java.util.Scanner;
public class Exercise1 {
    public static void main (String[] args){
//        Nhập một số bất kỳ. Hãy đọc giá trị của số
//        nguyên đó nếu nó có giá trị từ 1 đến 9, ngược
//        lại thông báo không đọc được.
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Nhập 1 số nguyên:");
        n = sc.nextInt();
        if (n>=1 && n<=9){
            System.out.println(n);
        }
        else {
            System.out.println("Không đọc được");
        }
    }
}
