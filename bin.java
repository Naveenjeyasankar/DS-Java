public class bin {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int target = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = binarySearch(array, target);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            System.out.println("iterated values are :"  +mid);
            int value = array[mid];
            if (value < target) {
                first = mid + 1;
            } else if (value > target) {
                last = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
