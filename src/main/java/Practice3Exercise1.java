import java.util.Scanner;

public class Practice3Exercise1 {
    public static void main (String[]args){

//        Về bài kiểm tra ngày tháng hợp lệ thì đầu vào là int day, int month, int year;
//
//        Giả sử ngày tháng năm người ta nhập vào là:
//        + 12/13/2015 => không hợp lệ, vì làm gì có tháng 13.
//                + 29/2/2020 => hợp lệ, tại vì năm 2020 là năm nhuận nên tháng 2 có 29 ngày.
//                + 31/4/2020 => không hợp lệ vì tháng 4 tối đa có 30 ngày.

        int date;
        int month;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date: ");
        date = sc.nextInt();
        if(date==0 || date>=32){
            System.out.println("Invalid Date");
            return;
        }
        System.out.print("Enter a month: ");
        month=sc.nextInt();
        if (month==0 ||month>12){
            System.out.println("Invalid Month");
            return;
        }
        System.out.print("Enter a year: ");
        year=sc.nextInt();

//        if(year<1970){
//            System.out.println("Year must be >1970");
//             }
//       else {
            if ( year%400==0 ||(year%100!=0 && year%4==0)) { // năm nhuần
                if (month == 2) {
                    if (date >= 1 && date <= 29) {
                        System.out.println("Valid date:" + date + "/" + month + "/" + year);
                        System.out.println("This month have 29 days");
                    } else {
                        System.out.println("Do not have this day");
                                    }

                }
            }
            if( year%100!=0 || year%400!=0) { // năm ko nhuần
                if (month == 2) {
                    if (date >= 1 && date <= 28) {
                        System.out.println("This is a valid day:" + date + "/" + month + "/" + year);
                        System.out.println("This month have 28 days");
                    }
                    if (date>=29){
                        System.out.println("Không phải năm nhuần - Ko có ngày này");
                        return;
                    }

                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && date<=31) {

                    System.out.println("Ngày tháng hợp lệ:" + date + "/" + month + "/" + year);
                    System.out.println("Tháng co 31 ngày");
                }
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && date>31) {
                    System.out.println("Ngày tháng ko hợp lệ:" + date + "/" + month + "/" + year);

                }

                if (month==4 || month==6 || month==9||month==11){
                    if(date<=30){
                        System.out.println("Ngày tháng hợp lệ check 2:" + date + "/" + month + "/" + year);
                        System.out.println("Tháng co 30 ngày");
                    }
                    else {
                        System.out.println("Ngày tháng không hợp lệ: " + date + "/" + month + "/" + year);
                    }
                }
            }
       //  }
    }
}
