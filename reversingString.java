class StringOperation {
    String reverse(String str1) {
        String str2 = "";
        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        return str2;
    }

    String reverseWord(String str1){
        String str2="";
        String arr[]=str1.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            str2=str2+arr[i]+" ";
        }
        return str2;
    }

    String reverseWordOnPosition(String str1){
        String str2="";
        // first we split the String and then reverse it
        String arr[]=str1.split(" ");
        for (String string : arr) {
            for (int i = string.length()-1; i >=0; i--) {
                str2 = str2+string.charAt(i);
            }
            str2=str2+" ";
        }
        return str2;
    }
}

public class reversingString {

    public static void main(String[] args) {
        StringOperation so = new StringOperation();
        String name = "Sarthak Jaiswal";
        String name1 = "Sarthak Jaiswal";
        String name3 = "Sarthak Jaiswal";
        System.out.println("before reversing : "+name);
        name = so.reverse(name);
        System.out.println("after reversing : "+name);

        System.out.println("before reversing word : "+name1);
        name1 = so.reverseWord(name1);
        System.out.println("after reversing word: "+name1);
      
        System.out.println("before reversing word on its position: "+name3);
        name3 = so.reverseWordOnPosition(name3);
        System.out.println("after reversing word on its position: "+name3);
    }
}