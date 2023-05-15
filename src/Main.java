public class Main {
    public static void main(String[] args)
    {
        int number = 32675;
        int a = number%100;
        int b = number - a;
        int c = b/100;
        int result = c%10;

        System.out.println(result);

    }
}