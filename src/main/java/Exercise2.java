public class Exercise2 {
    public static void main (String[] args){
//        Nhập một chữ cái. Nếu là chữ thường thì đổi
//        sang chữ hoa, ngược lại đổi sang chữ thường.

        char ch = 'c';
        if (Character.isUpperCase(ch)){
            ch = Character.toLowerCase(ch);
            System.out.println(ch);
        }
       else {
            ch=Character.toUpperCase(ch);
            System.out.println(ch);
        }

    }
}
