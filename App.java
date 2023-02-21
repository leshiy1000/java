import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        Scanner in = new Scanner(System.in);
        Integer a = Integer.valueOf(in.nextLine());
        Integer b = Integer.valueOf(in.nextLine());
        String op = in.nextLine();

        if (op.equals("+")) {
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);
        }
    }
}