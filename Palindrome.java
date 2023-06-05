public class Palindrome {
    public static void main(String[] args) {
    String original = "racecar";
    String reversed = "";

    char[] charArray = original.toCharArray();

    int left = 0;
    int right = charArray.length - 1;
    while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;

        left++;
        right--;
    }

     reversed = new String(charArray);
     
     if (original.equals(reversed)) {
        System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
            }
    }
    }