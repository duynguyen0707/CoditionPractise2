import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args){
//        Nhập vào tháng và năm. Cho biết tháng đó có bao
//        nhiêu ngày.
        int month;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month: ");
        month=sc.nextInt();
        if (month==0 ||month>12){
            System.out.println("Invalid Month");
            return;
        }
        System.out.print("Enter a year: ");
        year=sc.nextInt();

//        if(year<1900){
//            System.out.println("Year must be >1900");
//        }

            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println("Tháng có 31 ngày");
            }
            if (month==4 || month==6 || month==9||month==11){
                System.out.println("Tháng có 30 ngày");
            }
            if (month==2){
                if(year%400==0 ||(year%100!=0 && year%4==0)){
                    System.out.println("Tháng có 29 ngày");
                }
                else {
                    System.out.println("Tháng có 28 ngày");
                }
            }

    }
}
