public class Calculator {

    public static int col=0;


    public synchronized int sum(int a, int b){
        return a+b;
    }

    public synchronized int sub(int a, int b){
        return a-b;
    }

    public synchronized int mul(int a, int b){
        return a*b;
    }

    public synchronized double div(int a, int b){
        if (b==0){
            throw new ArithmeticException("Div by zero");
        }
        return a/b;
    }
}
