class StringOperation {
    String reverse(String str1) {
        String str2 = "";
        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        return str2;
    }
}

public class reversingString {

    public static void main(String[] args) {
        StringOperation so = new StringOperation();
        String name = "Sarthak";
        System.out.println("before reversing : "+name);
        name = so.reverse(name);
        System.out.println("after reversing : "+name);
    }
}