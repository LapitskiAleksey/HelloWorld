public class zadachka1 {
    public static void main(String[] args) {

        int e = 10;
        int f = 10;
        int a = 8;
        int b = 8;
        int c = 3;
        int d = 3;

        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("На участке можно построить два дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("На участке можно построить два дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("На участке можно построить два дома");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("На участке можно построить два дома");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("На участке можно построить два дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("На участке можно построить два дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("На участке можно построить два дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("На участке можно построить два дома");
        } else
            System.out.println("На участке нельзя построить два дома");
    }
}