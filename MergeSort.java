import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int mid = arr.length / 2;
       

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergeSort(left);
        System.out.print(Arrays.toString(left));
        right = mergeSort(right);
        System.out.print(Arrays.toString(right));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1,5,6,7,8,9,4,6,2 };
        int[] sortedArray = mergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}
