package src.main.java.org.func.http;

public interface InterFunction {
    void abstractFun(int x);

    //TODO default
    default void Fun() {
        //function the capital form of a Chinese numeral
        System.out.println("Hello");

    }

    class Test {
        public static void main(String[] args) {
            //TODO lambda
            InterFunction interFunction = (int x) -> System.out.println(2 * x);
            interFunction.Fun();
        }
    }
}
