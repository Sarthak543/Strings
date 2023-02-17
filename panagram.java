class pangramImplementation{
    /*
     * remove white space
     * converting into char array
     * lower to Upper
     * creating integer array of size 26
     * incrementing the intarr[charr arr-32] position
     * if int array is non zero then it is panagram
     * else not a panagram
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
     
    boolean compare(int arr[]){
     for (int i : arr) {
        if(i==0){
            return false;
        }
     }   
    return true;
    }

}

public class panagram {

    boolean isPangram(String str){
        pangramImplementation pi=new pangramImplementation();
        str=pi.removeWhiteSpace(str);
        char char_arr[]=pi.toCharArray(str);
        char_arr=pi.lowertoUpper(char_arr);
        
        int int_arr[]=new int [26];
       
          for (char c : char_arr) {
             int_arr[c-65]++;
          }
        
        
        return pi.compare(int_arr);
       }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        panagram pan = new panagram();
        System.out.println(pan.isPangram(str));
    }
}
