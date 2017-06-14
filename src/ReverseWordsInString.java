
public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "Hi I am sashank .";
        char[] arr = s.toCharArray();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                reverse(arr, j, i - 1);
                j = i + 1;
            }
        }

        reverse(arr, j, arr.length - 1);

        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
        System.out.println(String.valueOf(arr));

    }

    public static void reverse(char[] s, int start, int end) {

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }

}
