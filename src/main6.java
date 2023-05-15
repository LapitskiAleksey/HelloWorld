public class main6 {
    public static void main(String[] args) {
        int number = 77;
        int c = number % 10;
        if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (c == 7) {
                System.out.println("Последнее число семерка");
            } else {
                System.out.println("Последнее число не семерка");
            }
        }
    }
}