public class Exercise6 {
    public static void main(String[] args) {
//        Nhập 4 số nguyên a, b, c và d. Hãy sắp xếp giá trị
//        của 4 số nguyên này theo thứ tự tăng dần.
        int a = 1;
        int b = 90;
        int c = 8;
        int d = 3;
        int max =a;
        int mid1 =b;
        int mid2=c;
        int min =d;

        if (a>b && a >c && a>d){
            max = a;
            if (b>c && b >d){
                mid1=b;
                if (c>d){
                    mid2=c;
                    min=d;
                }
                else {
                    mid2=d;
                    min=c;
                }
            }
        }
        if (a<b && a>c && a>d){
            max=b;
            mid1=a;
            if(c>d)
                {
                    mid2=c;
                    min=d;
                }
            else {
                    mid2=d;
                    min=c;
                }


        }

        if (a<c && a>b && a>d){
            max=c;
            mid1=a;

                if(b>d)
                {
                    mid2=b;
                    min=d;
                }
                else {
                    mid2=d;
                    min=b;
                }
            }

        if (a<d && a>c && a>b){
            max=d;
            mid1=a;

                if(b>c){
                    mid2=b;
                    min=c;
                }
                else {
                    mid2=c;
                    min=d;
                }
        }

        if (b>a && b>c && b>d) {
            max = b;
            if (a > c && a > d) {
                mid1 = a;
                if (c > d) {
                    mid2 = c;
                    min = d;
                } else {
                    mid2 = d;
                    min = c;
                }
            }
        }

        if (b<a && b>c && b>d){
            max=a;
            mid1=b;

            if (c>d){
                mid2 = c;
                min = d;
            }
            else {
                mid2 = d;
                min = c;
            }
        }

        if (b<c && b>a && b>d){
            max=c;
            mid1=b;
            if (a>d){
                mid2 = a;
                min = d;
            }
            else {
                mid2 = d;
                min = a;
            }
        }

        if (b<d && b>a && b>c)  {
            max=d;
            mid1=b;
            if(a>c){
                mid2 = a;
                min = c;
            }
            else {
                mid2 = c;
                min = a;
            }
        }

        if (c>a && c>b && c>d){
            max=c;
            if(a>b && a>d){
                mid1=a;
                if(b>d){
                    mid2 = b;
                    min = d;
                }
                else {
                    mid2 = d;
                    min = b;
                }
            }
        }
        if (c<a && c>b && c>d)  {
            max=a;
            mid1=c;
            if(c>d){
                mid2 = c;
                min = d;
            }
            else {
                mid2 = d;
                min = c;
            }

        }

        if (c<b && c>a && c>d){
            max=b;
            mid1=c;
            if(a>d){
                mid2 = a;
                min = d;
            }
            else {
                mid2 = d;
                min = a;
            }
        }
        if (c<d && c>a && c>d){
            max=d;
            mid1=c;
            if(a>b){
                mid2 = a;
                min = b;
            }
            else {
                mid2 = b;
                min = a;
            }
        }

        if (d>a && d>b && d>c){
            max=d;
            if(a>b && a>c){
                mid1=a;
                if(b>c){
                    mid2 = b;
                    min = c;
                }
                else {
                    mid2 = c;
                    min = b;
                }
            }
        }
        if (d<a && d>b && d>c){
            max=a;
            mid1=d;
            if(b>c){
                mid2 = b;
                min = c;
            }
            else {
                mid2 = c;
                min = d;
            }
        }
        if (d<b && d>a && d>c){
            max=b;
            mid1=d;
            if(a>c){
                mid2 = a;
                min = c;
            }
            else {
                mid2 = c;
                min = a;
            }
        }
        if (d<c && d>a && d>b){
            max=c;
            mid1=d;
            if(a>c){
                mid2 = a;
                min = c;
            }
            else {
                mid2 = c;
                min = a;
            }
        }
        System.out.print("hiện" + min + "" + mid2 + "" + mid1 + "" +max);
        }
    }
