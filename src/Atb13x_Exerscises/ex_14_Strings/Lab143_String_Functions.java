package Atb13x_Exerscises.ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Sonal";// 0,1,2,3,4
        System.out.println(name.length());  // 5
        System.out.println(name.charAt(3)); //a
        System.out.println(name.charAt(0)); // S
        System.out.println(name.charAt(4));  //l
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Patel"));  //sonal patel

        // 3. contains()
        System.out.println(name.contains("om")); // false

        // 4. equals()
        System.out.println(name.equals("Sonal")); //true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); // true


        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o')); //1

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); //0

        System.out.println(s1.lastIndexOf("m")); //4


        // 7. length()
        System.out.println(name.length()); //5

        // 8. replace( , ) // sonal
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);



        // 10. substring( , )  , sonal
        System.out.println(name.substring(1, 3));  // on

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());  //sonal

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase()); //SONAL

        // 14. startsWith()
        System.out.println(name.startsWith("S")); // true

        // 15. endsWith()
        System.out.println(name.endsWith("a"));


        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());  //22

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);  //roar

        //        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));  // 5
        System.out.println(n.lastIndexOf("d")); // 6
        System.out.println(n.lastIndexOf("s")); // -1


    }
}
