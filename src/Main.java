import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static char ch;
    static int a;
    static int b;
    static int time=0;
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(time);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+ " col : "+Calculator.col);
            }
        };

        while (true){
            System.out.println("Choose action: +,-,/,*,e");
            ch = scanner.next().charAt(0);
            Thread thread1 = new Thread(runnable);
            time=10000;
            thread1.start();
            Thread thread2 = new Thread(runnable);
            time=20000;
            thread2.start();
            switch (ch){
                case '+':
                    readValues();
                    System.out.println(calculator.sum(a,b));
                    Calculator.col++;
                    break;
                case '-':
                    readValues();
                    System.out.println(calculator.sub(a,b));
                    Calculator.col++;
                    break;
                case '*':
                    readValues();
                    System.out.println(calculator.mul(a,b));
                    Calculator.col++;
                    break;
                case '/':
                    readValues();
                    System.out.println(calculator.div(a,b));
                    Calculator.col++;
                    break;
            }


        }


    }

    public static void readValues(){
        System.out.println("first number");
        a = scanner.nextInt();
        System.out.println("Second number");
        b = scanner.nextInt();
    }
}
