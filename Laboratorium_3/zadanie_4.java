import java.util.Random;
class RandomNumbers {

    static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    int randomElement() {
        int rndm = new Random().nextInt(numbers.length);
        return numbers[rndm];
    }

    public String getNumbers() {
        return "Numer to: " + randomElement();
    }
}
class Main {
    public static void main(String[] args) {
        RandomNumbers losoweNumery = new RandomNumbers();
        System.out.println(losoweNumery.getNumbers());
    }
}