import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        String t, k, t_fst, k_fst;
        t_fst = scanner.nextLine();
        k_fst = scanner.nextLine();
        t = t_fst.toLowerCase();
        k = k_fst.toLowerCase();
        
        String[] array = t.split(" ");
        String[] words = new String[30];

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < words.length; j++){
                if(array[i].equals(words[j])){
                    check = true;
                }
            }
            if((array[i].contains(k)) && (check == false)){
                if(array[i].charAt(0) == k.charAt(0)){
                    System.out.println(k + " jest przedrostkiem słowa " + array[i]);
                    words[i] = array[i];
                } else {
                    System.out.println(k + " jest przyrostkiem słowa " + array[i]);
                }
            }
        }
    }
}