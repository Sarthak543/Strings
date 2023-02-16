public class removeDuplicates {
    String rmDuplicate(String str1) {
        String str2 = "";
        boolean flag=true;
        for (int i = 0; i < str1.length(); i++) { // to iterate str1
            flag=true;
            for (int j = 0; j < str2.length(); j++) { // to iterate str2
                if(str1.charAt(i)==str2.charAt(j)){
                    flag=false;
                }
            }
            if (flag) {
                str2=str2+str1.charAt(i); 
            }
        }
        return str2;
    }

    public static void main(String[] args) {
         String str="aaaaaabbbccddefghiiijklmnopqqrsstuvwwxyyyyz";
         removeDuplicates rd= new removeDuplicates();
         System.out.println(rd.rmDuplicate(str)); 
    }
}
