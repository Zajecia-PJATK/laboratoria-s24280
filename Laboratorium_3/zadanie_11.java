import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if (letter == 'z') {
        letter = 'a';
        }
        else letter++;
        System.out.println(letter);
    }
}