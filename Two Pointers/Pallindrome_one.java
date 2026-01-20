public class Pallindrome_one {
    public boolean isPalindrome(String s) {
        StringBuilder newchar = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newchar.append(Character.toLowerCase(c));
            }
        }
        return newchar.toString().equals(newchar.reverse().toString());
    }
}