package jt.conditional;

public class IfThenElseHandler {
    public static void main(String[] args) {
        int i = 2;
        if (i == 0) {
            System.out.println("success");
        } else if (i == -1) {
            System.out.println("failed");
        } else {
            System.out.println("unknown status code");
        }
    }
}
