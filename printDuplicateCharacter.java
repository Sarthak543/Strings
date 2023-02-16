public class printDuplicateCharacter {
    String printDupliChar(String str1) {
        String str2 = "";
        String duplicate = "";
        boolean flag = true; // true means duplicate not present
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    duplicate = duplicate + str1.charAt(i);
                    flag=false;
                }
            }
           if (flag) {
            str2=str2+str1.charAt(i);
           }
        }
        return duplicate;
    }

    public static void main(String[] args) {
      String str="sarthak jaiswal";
      printDuplicateCharacter pdc = new printDuplicateCharacter();
      System.out.println(pdc.printDupliChar(str));
    }
}
