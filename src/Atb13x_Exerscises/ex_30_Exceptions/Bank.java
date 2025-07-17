package Atb13x_Exerscises.ex_30_Exceptions;

public class Bank {
   private String currency;
   private Integer amount;

   public Bank(String currency, Integer amount){
       this.currency=currency;
       this.amount=amount;

   }
   public void setCurrency(String currency){
       this.currency = currency;
   }

   public String getCurrency(){
       return currency;
   }

   public void setAmount(Integer amount){
       this.amount = amount;
   }

   public Integer getAmount(){
       return amount;
   }

   // function to add cuurency or amount

    public Integer add(Bank bankName) throws CurrencyMismatchCustomException{

       if(bankName.currency.equals("INR")){
           return bankName.amount + this.amount;
       } else {
           throw new CurrencyMismatchCustomException("Currency Mismatch!");
       }
    }

    class CurrencyMismatchCustomException extends Exception{
       CurrencyMismatchCustomException(String msg){
           super(msg);
       }
    }

    class NotValidAgeException extends Exception {
        NotValidAgeException(String e) {
            super(e);
        }
    }
}


