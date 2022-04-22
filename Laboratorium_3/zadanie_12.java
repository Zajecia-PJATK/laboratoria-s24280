import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t,k;
        String[] p;
        int mod1 = 0, mod2 = 0;
        t = scanner.nextLine();
        p = scanner.nextLine().split(" ");
        k = scanner.nextLine();

        String[] array = t.split(" ");
        String[] words = new String[20];

        for (int i = 0; i < array.length; i++) {
            if(array[i] == p[0]) {
                mod1 = i;
            }
            if(array[i] == p[1]) {
                mod2 = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if(mod1 > mod2) {
                System.out.print(array[j] + " ");
                
                if(mod1 == j) {
                    System.out.print(k + " ");
                }
            } 
            else {
                System.out.print(array[j] + " ");
                if(mod2 == j) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}




