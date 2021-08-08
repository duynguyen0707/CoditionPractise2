import java.util.Scanner;

public class Exercise7 {
    public static void main(String[]args){
//        Tính tiền đi taxi từ số km nhập vào. Biết:
//        a. 1 km đầu giá 15000đ
//        b. Từ km thứ 2 đến km thứ 5 giá 13500đ
//        c. Từ km thứ 6 trở đi giá 11000đ
//        d. Nếu trên 120km được giảm 10% tổng tiền.
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số km:" );
        double total = 0;

        double km;

        final int price1=15000;
        final int price2=13500;
        final int price3=11000;
        km= sc.nextDouble();

        if(km==0){
        total=0;
        }

        if (km>= 0 && km<=1){
        int value;
            value=(int) Math.round(km);
            total= value*price1;

        }

        if (km>1 && km<2){

          int valueP=(int)km;
          double valueN= km-valueP;

          if(valueN==0.5){
              total=valueP*price1+ (price2*0.5);

          }
          if (valueN<0.5) {
              int total1 = valueP * price1;

          }
          if(valueN>0.5){

              total = price2+ price1;
          }

        }


        if(km>=2 && km<=5){
                     int valueP=(int)km;
            double valueN= km-valueP;
            if(valueN==0.5){
                total=price1+ (valueP-1)*price2+ (price2*0.5);
            }
            if(valueN<0.5){
                total=price1+(valueP-1)*price2;
            }
            if (valueN>0.5){

          total=price1+(valueP*price2);
            }

        }

        if(km>5 && km<6){
            int valueP=(int)km;
            double valueN= km-valueP;
            if(valueN==0.5){

                total=price1+(price2)*(valueP-1) + (price2*0.5);

            }
            if (valueN<0.5){
                total=price1+price2*(valueP-1);

            }
            if(valueN>0.5){

                total=price1+(valueP*price2);

            }

        }

        if (km>=6 && km<120){

            int valueP=(int)km;
            double valueN= km-valueP;
            if(valueN==0.5){

                total=price1+(price2*4)+ (valueP-5)* price3 +(price3*0.5);

            }
            if (valueN<0.5){
                total=price1+(price2*4)+ (valueP-5)* price3;

            }
            if(valueN>0.5){

                total=price1+(price2*4)+ (valueP-4)* price3;
          
            }


        }
        if(km>=120){
            double totalBefore;
            double discount;
            int valueP=(int)km;
            double valueN= km-valueP;
            if(valueN==0.5){
                totalBefore=price1+(valueP-1) +(price2*4) +(valueP-5)*price3 + (price3*0.5);
                discount=totalBefore*0.1;
                total=totalBefore-discount;
            }
            if (valueN<0.5){
                totalBefore=price1+(valueP-1) +(price2*4) +(valueP-5)*price3;
                discount=totalBefore*0.1;
                total=totalBefore-discount;
            }
            if(valueN>0.5){

                totalBefore=price1+(valueP-1) +(price2*4) +(valueP-4)*price3;
                discount=totalBefore*0.1;
                total=totalBefore-discount;
            }

        }
    int finalResult = (int) total;
        System.out.println("Tổng Tiền:" +finalResult);
    }
 
}
