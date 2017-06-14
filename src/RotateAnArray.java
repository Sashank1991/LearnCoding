//this is rotating an array by k steps using bubble rotating
public class RotateAnArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 912345678
        // 891234567
        // 789123456

        // for total reverse
        // for (int i = 0; i < arr.length; i++) {

        // for (int j = arr.length - 1; j > i; j--) {

        for (int i = 0; i < 3; i++) {

            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);
        }

    }

}
