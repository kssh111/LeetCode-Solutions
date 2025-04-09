package src.FizzBuzz;

public class Test {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(15);

        Thread t1 = new Thread(() -> {
            try {
                fb.fizz(() -> System.out.print("fizz "));
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                fb.buzz(() -> System.out.print("buzz "));
            } catch (InterruptedException e) {}
        });

        Thread t3 = new Thread(() -> {
            try {
                fb.fizzbuzz(() -> System.out.print("fizzbuzz "));
            } catch (InterruptedException e) {}
        });

        Thread t4 = new Thread(() -> {
            try {
                fb.number(number -> System.out.print(number + " "));
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
