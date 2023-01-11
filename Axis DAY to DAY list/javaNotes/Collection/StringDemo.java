package Collection;

public class StringDemo {

    public static void main(String args[]) {
        String str = new String("java");// mention ex
        String str1 = "java";
        String str2 = "java";
        String str3 = "";
        System.out.println(str1);
        System.out.println(str3);
        str2 = "java2";
        str1 = "java3 ";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // string is immutable

        // "java" string pool 06811 => non reference address => garbage value
        // =>garbage handle
        // str2=> java2 new memory location 06812
        // str1=> "java3" 06813
    }
}