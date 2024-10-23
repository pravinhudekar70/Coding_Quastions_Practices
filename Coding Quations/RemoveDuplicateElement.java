import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 5, 3, 4, 5, 3 };

        // String s = Arrays.toString(arr);
        // String s2 = "";
        // System.out.println(s);
        // for (int i = 0; i < s.length(); i++) {
        // if (Character.isDigit(s.charAt(i))) {
        // int idx = s.indexOf(s.charAt(i), i + 1);
        // if (idx == -1) {

        // s2 = s2 + s.charAt(i) + " ";
        // }
        // }
        // }
        // System.out.println(s2);

        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    check = true;
            }
            if (!check) {
                System.out.println(arr[i]);
            }
        }
    }
}
