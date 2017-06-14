
public class RotateAnArrayAdvanced {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 321
        // 987654
        // 321987654
        // 456789123
        // length of first part
        int a = arr.length - 3;

        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
