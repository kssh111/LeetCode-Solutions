package src.FizzBuzz;

import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n;
    private int current = 1;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public synchronized void fizz(Runnable printFizz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 3 == 0 && current % 5 != 0)) {
                wait();
            }
            if (current > n) break;
            printFizz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void buzz(Runnable printBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 5 == 0 && current % 3 != 0)) {
                wait();
            }
            if (current > n) break;
            printBuzz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (current <= n) {
            while (current <= n && !(current % 15 == 0)) {
                wait();
            }
            if (current > n) break;
            printFizzBuzz.run();
            current++;
            notifyAll();
        }
    }

    public synchronized void number(IntConsumer printNumber) throws InterruptedException {
        while (current <= n) {
            while (current <= n && (current % 3 == 0 || current % 5 == 0)) {
                wait();
            }
            if (current > n) break;
            printNumber.accept(current);
            current++;
            notifyAll();
        }
    }
}

