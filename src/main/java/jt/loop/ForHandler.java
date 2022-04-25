package jt.loop;

public class ForHandler {
    public static void main(String[] args) {
        {
            System.out.print("This is first for loop" + "\n");
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ",");
        }

        {
            System.out.print("\n"+"This is second for loop" + "\n");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
