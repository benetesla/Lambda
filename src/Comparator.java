
public class Comparator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        compare(a, b, c);
    }

    private static void compare(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greater than B and C");
        } else if (b > a && b > c) {
            System.out.println("B is greater than A and C");
        } else if (c > a && c > b) {
            System.out.println("C is greater than A and B");
        } else {
            System.out.println("A, B and C are equal");
        }
    }
}