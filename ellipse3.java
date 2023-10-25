package Ellipse_Approach;

public class ellipse3 {
    public void methodOne(int[]... x) {
        System.out.println(x);
        for (int[] a : x) {
            System.out.println(a);
            for (int ele : a) {
                System.out.println("elemets are :- " + ele);
            }

        }

    }

    public static void main(String... args) {
        int[] a = { 10, 20, 30 };
        int[] b = { 10, 20, 30, 40 };
        ellipse3 t = new ellipse3();
        t.methodOne(a, b);
    }
}
