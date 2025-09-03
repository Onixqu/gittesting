import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ThirdHighest {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 1, 56, 90, 34, 23, 90}; // Example array
        System.out.println("The 3rd highest value is: " + findThirdHighest(numbers));
    }

    public static int findThirdHighest(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Add all numbers to the set to ensure uniqueness
        for (int num : arr) {
            uniqueNumbers.add(num);
        }

        // Use a TreeSet to sort the unique numbers in descending order
        TreeSet<Integer> sortedSet = new TreeSet<>(uniqueNumbers);
        Integer thirdHighest = null;

        // Get the 3rd highest value
        if (sortedSet.size() >= 5) {
            thirdHighest = sortedSet.descendingSet().toArray(new Integer[0])[2];
        }

        return (thirdHighest != null) ? thirdHighest : -1; // Return -1 if there are less than 3 unique values
    }
}