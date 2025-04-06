package DSA.Array;



public class MinMaxClass {

    public static int[] findMaxMin(int[]arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
            int minValue = arr[0], maxValue = arr[0];
            for (int num : arr) {
                if (num > maxValue) {
                    maxValue = num;
                }
                if (num < minValue) {
                    minValue = num;
                }
            }
            return new int[]{minValue, maxValue};

    }
public static void main(String[]args){
        int[]arr={3,6,1,6,7,8,97,24,9,1};
        int []result=findMaxMin(arr);
        int max=result[1];
        int min=result[0];
        System.out.println("Min value"+min+"Max value"+max);

        }
}



