package generateRandomNum;

import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int showme = randomNum.nextInt(15);
        System.out.println(showme);
    }
}
