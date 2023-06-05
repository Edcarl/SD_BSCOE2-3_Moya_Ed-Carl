public class Fibonacci {
    public static void main(String[] args) {
    int n = 10;
    int t1 = 0, t2 = 1;

    System.out.print("First " + n + " terms: ");
    for (int i = 0; i < n; i++) {
        System.out.print(t1 + " ");
        int t3 = t1 + t2;
        t1 = t2;
        t2 = t3;
        }
    }
    }