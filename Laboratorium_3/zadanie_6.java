import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t,k;
        String tL,kL;

        t = scanner.nextLine();
        k = scanner.nextLine();
        tL = t.toLowerCase();
        kL = k.toLowerCase();

        if(tL.contains(kL)==true) {
            System.out.println("Słowo " + k + " znajduje się w ciągu");
        }
        else {
            System.out.println("Słowo " + k + " nie znajduje się w ciągu");
        }
    }
}