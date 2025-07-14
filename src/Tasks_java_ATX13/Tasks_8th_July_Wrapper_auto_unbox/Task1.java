package Tasks_java_ATX13.Tasks_8th_July_Wrapper_auto_unbox;

public class Task1 {
    public static void main(String[] args) {
        //        Task 1: Autoboxing and Unboxing?

        int primitive = 50;  // primitive

        Integer wrapper = primitive; // Autoboxing  primitive to wrapper

        int unboxing = wrapper;  // unboxing  Integer/wrapper -> Primitive


        System.out.println("Primitive :"+primitive);
        System.out.println("Wrapper :"+wrapper);
        System.out.println("Unboxed again :"+unboxing);
    }
}
