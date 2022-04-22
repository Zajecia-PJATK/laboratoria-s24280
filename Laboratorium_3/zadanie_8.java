import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string;
        string = in.nextLine();
        String[] array = string.split("@");
        System.out.println(array[0]);
    }
}