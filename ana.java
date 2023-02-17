class anagramImplementation {
    /*
     * removing white spaces through custom method
     * converting to charArray
     * lowerToUpper or viceversa accordingly
     * sorting
     * compare
     */
    String removeWhiteSpace(String str1) {
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != 32) {
                str2 = str2 + str1.charAt(i);
            }
        }
        return str2;
    }

    char[] toCharArray(String str) {
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    char[] lowertoUpper(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 90) {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return arr;
    }

    char[] sort(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    boolean compare(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    boolean isanagram(String str1, String str2) {
        str1 = removeWhiteSpace(str1);
        str2 = removeWhiteSpace(str2);

        char arr1[] = toCharArray(str1);
        char arr2[] = toCharArray(str2);

        arr1 = lowertoUpper(arr1);
        arr2 = lowertoUpper(arr2);

        arr1 = sort(arr1);
        arr2 = sort(arr2);

        return compare(arr1, arr2);
    }
}

public class ana {
    public static void main(String[] args) {
        anagramImplementation ai = new anagramImplementation();
        String str1 = "madam";
        String str2 = "daamm";

        if (ai.isanagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
