public class main2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b) {
            if (a > c) {
                System.out.println("максимальное число:" + a);
            } else {
                System.out.println("максимальное число:" + c);
            }
        } else {
            if (b > c) {
                System.out.println("максимальное число:" + b);
            } else {
                System.out.println("максимальное число:" + c);
            }
        }
    }
}

