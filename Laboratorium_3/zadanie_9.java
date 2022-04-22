import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t,r,k;
        t = scanner.nextLine();
        r = scanner.nextLine();
        k = scanner.nextLine();
        String str = t.replace(r,k);
        System.out.println(str);
    }
}