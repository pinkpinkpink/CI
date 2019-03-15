package src.main.java.org.func.http;

public interface InterFunction {
    void abstractFun(int x);
    default void Fun(){
        System.out.println("Hello");

    }
    class Test{
        public static void main(String[] args) {
            InterFunction interFunction = (int x)->System.out.println(2*x);
            interFunction.Fun();
        }
    }
}
