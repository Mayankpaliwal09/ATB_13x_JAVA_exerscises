package Tasks_java_ATX13.Tasks_8th_July_Wrapper_auto_unbox;

public class Task5 {
    public static void main(String[] args) {

//        Great topic! In Java, == and .equals() are both used for comparison, but they behave very differently depending on the data type (primitive or object). Here's a clear breakdown:
//
//🔸 == — Reference or Value Comparison
//        For primitives (int, double, char, etc.):
//➤ Compares actual values.
//
//                For objects (like String, Integer, etc.):
//➤ Compares memory addresses (i.e., whether both references point to the same object).
//
//🔸 .equals() — Content Comparison
//        Defined in the Object class and often overridden to compare the contents of objects.
//
        // Cached values (within -128 to 127)

        Integer a = 100;
        Integer b = 100;

        // Non-cached values (outside -128 to 127)
        Integer c = 200;
        Integer d = 200;

        System.out.println("a == b :"+(a==b));
        System.out.println("c == d :"+(c==d));
        System.out.println("a.equals(b) :"+(a.equals(b)));
        System.out.println("c.equals(d) :"+(c.equals(d)));
    }
}
