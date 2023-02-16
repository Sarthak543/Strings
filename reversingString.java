import java.util.Arrays;

class StringOperation {
    String reverse(String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        return str2;
    }

    String reverseWord(String str1) {
        String str2 = "";
        String arr[] = str1.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            str2 = str2 + arr[i] + " ";
        }
        return str2;
    }

    String reverseWordOnPosition(String str1) {
        String str2 = "";
        // first we split the String and then reverse it
        String arr[] = str1.split(" ");
        for (String string : arr) {
            for (int i = string.length() - 1; i >= 0; i--) {
                str2 = str2 + string.charAt(i);
            }
            str2 = str2 + " ";
        }
        return str2;
    }

    Boolean isPalindrome(String str1) {
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    Boolean isAnagram(String str1, String str2) {
    /*
     * steps to check whether strings are anagram or not
     * 1. remove whitespaces
     * 2. convert to lower or upper accordingly
     * 3. convert to char array
     * 4. sort the arrays
     * 5. compare if equal then anagram else not an anagram
    */

    str1=str1.replace(" ", "");
    str2=str2.replace(" ", "");

    str1.toLowerCase();
    str2.toLowerCase();

    char s1[]=str1.toCharArray();
    char s2[]=str1.toCharArray();

    Arrays.sort(s1);
    Arrays.sort(s2);

    if (Arrays.equals(s1, s2)) {
        return true;
    } else {
        return false;
    }
    }
}

public class reversingString {

    public static void main(String[] args) {
        StringOperation so = new StringOperation();
        String name = "Sarthak Jaiswal";
        String name1 = "Sarthak Jaiswal";
        String name3 = "Sarthak Jaiswal";
        String name4 = "MADAM";
        String name5 = "DAAMM";
        System.out.println("before reversing : " + name);
        name = so.reverse(name);
        System.out.println("after reversing : " + name);

        System.out.println("before reversing word : " + name1);
        name1 = so.reverseWord(name1);
        System.out.println("after reversing word: " + name1);

        System.out.println("before reversing word on its position: " + name3);
        name3 = so.reverseWordOnPosition(name3);
        System.out.println("after reversing word on its position: " + name3);

        System.out.println("isPalindrome : "+so.isPalindrome(name4));
        System.out.println("isAnagram : "+so.isAnagram(name4,name5));
    }
}