import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer>initialBoxesLocation = new ArrayList<Integer>();

        int minimumDistance = 1;
        int maximumDistance = 7;

        for(int i = 0; i < 3; i++) {
            int getLocation = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
            initialBoxesLocation.add(getLocation);
        }

        while(initialBoxesLocation.get(0) == initialBoxesLocation.get(1) || initialBoxesLocation.get(0) == initialBoxesLocation.get(2) || initialBoxesLocation.get(1) == initialBoxesLocation.get(2)) {
            for(int i = 0; i < 3; i++) {
                int getLocation = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
                initialBoxesLocation.set(i, getLocation);
            }
        }

    }
}