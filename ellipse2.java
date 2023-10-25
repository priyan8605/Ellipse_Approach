package Ellipse_Approach;

class check {
    public void m1(int... x) {
        System.out.println("var-arg method");
    }

    public void m1(int x) {
        System.out.println("int method");
    }
}

public class ellipse2 {
    public static void main(String[] args) {
        check d1 = new check();
        d1.m1();
        d1.m1(new int[] { 10, 20, 30, 40 });
        d1.m1(10);
    }

}
