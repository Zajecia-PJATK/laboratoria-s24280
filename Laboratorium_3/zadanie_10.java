
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t, r;
        int top, num=0;
        t = scanner.nextLine();
        r = scanner.nextLine();

        if (t.length() >= r.length()) {
            top = t.length();
        } else {
            top = r.length();
        }

        for (int i = 0; i <= top; i++){
            if(t.charAt(i) == (r.charAt(i))){
                num = i;
            }
            else {
                num += 1;
                break;
            }
        }
        System.out.println(num);
    }
}