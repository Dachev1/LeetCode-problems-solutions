import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoatsToSavePeople {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 4;

        System.out.println(numRescueBoats(arr, 9));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;

        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            if ((people[j] + people[i]) <= limit) {
                i++;
            }

            j--;
            boats++;
        }

        return boats;
    }
}