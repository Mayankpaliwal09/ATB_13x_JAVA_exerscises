package Atb13x_Exerscises.ex_30_Exceptions;

public class Lab235_Custom_Exception_Example {
    public static void main(String[] args) throws Bank.CurrencyMismatchCustomException {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Bank jp_chase = new Bank("USD", 101);
        try {
            int total = sbi.add(icici);         // ✅ Works
            System.out.println("Total 1: " + total);

            int total_new = sbi.add(jp_chase);  // ❌ Throws exception
            System.out.println("Total 2: " + total_new);
        } catch (Bank.CurrencyMismatchCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}
