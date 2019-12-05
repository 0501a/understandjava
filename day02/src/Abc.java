public class Abc {
    static {
        int x = 5;
    }
    static int x, y;
    public static void main(String[] args){
        x--;
        myMethod();
        System.out.println(x + y++ + x);
        System.out.println(y);
    }
    public static void myMethod(){
        y = x++ + ++x;
    }
}
