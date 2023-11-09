import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] myIntArray = new int[3];

        int minimumDistance = 0;
        int maximumDistance = 7;

        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = random.nextInt(maximumDistance - minimumDistance + 1) - minimumDistance;
        }

        if(myIntArray[0] == myIntArray[1] || myIntArray[0] == myIntArray[2] || myIntArray[1] == myIntArray[2]) {
            for(int i = 0; i < myIntArray.length; i++) {
                myIntArray[i] = random.nextInt(maximumDistance - minimumDistance + 1) - minimumDistance;
            }
        }
        System.out.println("somw");
    }
}