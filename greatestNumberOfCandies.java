// leetcode Q 1431
 // 1st way to solve this  question by using array
// import java.util.*;

// public class greatestNumberOfCandies {
//     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         List<Boolean> result = new ArrayList<>();

//         // Step 1: Find maximum
//         int max = candies[0];
//         for(int candy : candies) {
//             if(candy > max) {
//                 max = candy;
//             }
//         }

//         // Step 2: Compare after adding extraCandies
//         for(int candy : candies) {
//             if(candy + extraCandies >= max) {
//                 result.add(true);
//             } else {
//                 result.add(false);
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] candies = {2, 3, 5, 1, 3};
//         int extraCandies = 3;

//         System.out.println(kidsWithCandies(candies, extraCandies));
//     }
// }

// 2nd way to solve this question by using arraylist
import java.util.ArrayList;

public class greatestNumberOfCandies {

    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> result = new ArrayList<>();

        // Step 1: Find maximum candies
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Step 2: Check each kid
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        ArrayList<Boolean> answer = kidsWithCandies(candies, extraCandies);

        System.out.println(answer);
    }
}
