//import java.util.ArrayList;
//import java.util.List;
//public class Main {
    //public static int[] filterEvenIndexOddValue(int[] array) {
        //List<Integer> resultList = new ArrayList<>();
        //for (int i = 0; i < array.length; i += 2) {
            //if (array[i] % 2 != 0) {
               // resultList.add(array[i]);
            //}
       // }
        //int[] resultArray = new int[resultList.size()];
       // for (int i = 0; i < resultList.size(); i++) {
            //resultArray[i] = resultList.get(i);
        //}
        //return resultArray;
   //}
    //public static void main(String[] args) {
        //int[] arr1 = {1, 2, 3, 4, 5, 6};
        //int[] arr2 = {2, 3, 4, 5, 6, 7};
        //int[] arr3 = {7, 8, 9, 10, 11};
        //System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(arr1)));
        //System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(arr2)));
        //System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(arr3)));
    //}
//}

//Task2

//import java.util.HashMap;

//public class Main {

    //public static int findDominant(int[] array) {

        //int n = array.length;

        //HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        //for (int num : array) {

            //frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
            //if (frequencyMap.get(num) > n / 2) {
                //return num;
            //}

       // }
       // return -1;
   // }
   // public static void main(String[] args) {

        //int[] arr1 = {3, 3, 3, 2, 2};

        //int[] arr2 = {1, 2, 3, 4};

       // int[] arr3 = {5, 5, 5, 5, 1};
        //System.out.println(findDominant(arr1));

        //System.out.println(findDominant(arr2));

        //System.out.println(findDominant(arr3));

    //}

//}

//Task 3

import java.util.Arrays;
public class Main {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;
        positions = positions % n;
        int[] rotatedArray = new int[n];
        System.arraycopy(array, n - positions, rotatedArray, 0, positions);
        System.arraycopy(array, 0, rotatedArray, positions, n - positions);
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(rotateArray(arr1, 2)));
        System.out.println(Arrays.toString(rotateArray(arr2, 3)));
    }
}