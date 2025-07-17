package Atb13x_Exerscises.ex_30_Exceptions;

public class Resl_life_throw_throws {

    public static void main(String[] args) {

        try {
            withdraw(2500);
        }catch (IllegalArgumentException e){
            System.out.println("Transaction Failed :"+ e.getMessage());
        }
    }

    private static void withdraw(int amount) throws IllegalArgumentException {
    int balance = 2000;

    if(amount > balance){
        throw new IllegalArgumentException("Insufficent balance");
    }
        System.out.println("Withdrawal successful: ₹" + amount);
    }
}
