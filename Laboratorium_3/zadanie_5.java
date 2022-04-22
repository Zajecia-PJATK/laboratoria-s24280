import java.io.IOException;
import java.util.*;

class StringRefactor{
    private String word;

    public void setStr(String str) {
        this.word = str;
    }

    public String allUpper(){
        return this.word.toUpperCase();
    }

    public String allLower(){
        return this.word.toLowerCase();
    }

    public String firstUpper(){
        return this.word.substring(0,1).toUpperCase() + this.word.substring(1).toLowerCase();
    }

    public String allFirstUpper(){
        String[] arr = this.word.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        String string = allUpper() + "\n" + allLower() + "\n" + firstUpper() + "\n" + allFirstUpper();
        return string;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String string;
        string = in.nextLine();
        StringRefactor strToRefactor = new StringRefactor();
        strToRefactor.setStr(string);
        System.out.println(strToRefactor);
    }
}




