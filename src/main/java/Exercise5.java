public class Exercise5 {
    public static void main (String[] args){
//        Nhập 4 số nguyên a, b, c và d. Tìm số có giá trị nhỏ
//        nhất (min).
        int a =5;
        int b=15;
        int c=3;
        int d=4;

        if (a<b && a <c && a<d){
            System.out.print(a + " nhỏ nhất");
        } else if (b<a && b <c && b<d){
            System.out.print(b + " nhỏ nhất");
        } else if (c<a && c <b && c<d){
            System.out.print(c + " nhỏ nhất");
        }else {
            System.out.print(d + " nhỏ nhất");
        }

    }
}
