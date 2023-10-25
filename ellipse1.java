package Ellipse_Approach;

class Demo {
    public void add(int... x)// ellipse approch
    {
        // System.out.println("var-agr approach");
        for (int ele : x) {
            System.out.println(ele);
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println();
    }
}

public class ellipse1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.add();
        d.add(1, 2);
        d.add(1, 2, 3);
    }
}
