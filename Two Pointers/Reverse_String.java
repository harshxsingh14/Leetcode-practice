
 public class Reverse_String   {
    public void reverseString(char[] a) {
        reverse(a, 0, a.length - 1);
    }

    private void reverse(char[] a, int left, int right) {
        if (left < right) {
            reverse(a, left + 1, right - 1);
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
    }
} 
