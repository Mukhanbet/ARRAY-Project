import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer>initialFirstBoxeLocation = new ArrayList<>();
        ArrayList<Integer>initialSecondBoxeLocation = new ArrayList<>();
        ArrayList<Integer>initialThirdBoxeLocation = new ArrayList<>();
        int[] incomingLocationVariants = new int[3];

        int minimumDistance = 1;
        int maximumDistance = 7;

        int randomLocationOfFirstBoxe = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
        initialFirstBoxeLocation.add(randomLocationOfFirstBoxe);
        int randomLocationOfSecondBoxe = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
        initialSecondBoxeLocation.add(randomLocationOfSecondBoxe);
        int randomLocationOfThirdBoxe = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
        initialThirdBoxeLocation.add(randomLocationOfThirdBoxe);
        System.out.println(randomLocationOfFirstBoxe + " " + randomLocationOfSecondBoxe + " " + randomLocationOfThirdBoxe);

        for(int i = 1; i < 6; i++) {
            while(true) {
                for(int t = 0; t < 3; t++) {
                    incomingLocationVariants[t] = scanner.nextInt();
                }

                if(initialFirstBoxeLocation.contains(incomingLocationVariants[0])) {
                    System.out.println("The first location option was correct!");
                    initialFirstBoxeLocation.add(generateNotRepeatingLocation(minimumDistance, maximumDistance, initialFirstBoxeLocation));
                }

                if(initialSecondBoxeLocation.contains(incomingLocationVariants[1])) {
                    System.out.println("The second location option was correct!");
                    initialSecondBoxeLocation.add(generateNotRepeatingLocation(minimumDistance, maximumDistance, initialSecondBoxeLocation));
                }

                if(initialThirdBoxeLocation.contains(incomingLocationVariants[2])) {
                    System.out.println("The third location option was correct!");
                    initialSecondBoxeLocation.add(generateNotRepeatingLocation(minimumDistance, maximumDistance, initialSecondBoxeLocation));
                }
                else {
                    break;
                }
            }
        }
    }

    public static int generateNotRepeatingLocation(int minimumDistance, int maximumDistance, ArrayList<Integer>initialBoxesLocation) {
        Random random = new Random();
        while(true) {
            int getNotRepeatingLocation = random.nextInt(maximumDistance - minimumDistance + 1) + minimumDistance;
            if(initialBoxesLocation.contains(getNotRepeatingLocation)) {

            }
            else {
                return getNotRepeatingLocation;
            }
        }
    }
}