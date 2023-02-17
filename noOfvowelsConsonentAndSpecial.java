/**
 * noOfvowelsConsonentAndSpecial
 */
public class noOfvowelsConsonentAndSpecial {

    public static void main(String[] args) {
        String str = "Hii, my name is Sarthak Jaiswal in this program we are going to count number of vowel, consonents and special character";
        int vowel = 0, consonent = 0, specialChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 32 && str.charAt(i) <= 47) || (str.charAt(i) >= 58 && str.charAt(i) <= 64)
                    || (str.charAt(i) >= 91 && str.charAt(i) <= 96) || (str.charAt(i) >= 123 && str.charAt(i) <= 126)) {
                        System.out.println(str.charAt(i));
                specialChar++;
            } else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                        vowel++;

            } else {
                consonent++;
            }
        }
        System.out.println("Special characters : "+specialChar);
        System.out.println("Vowels : "+vowel);
        System.out.println("consonents : "+consonent);
    }
}