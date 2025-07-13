package Atb13x_Exerscises.ex_29_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {

        Mobile iphone = new Mobile(1,"iphone",12000.00);
        iphone.display();
        iphone.setPrice(20000.00);
        System.out.println("Price after change is " +iphone.getPrice());
        iphone.setName("iphone 16 pro");
        System.out.println(Mobile.mobile_Carrier);
        Mobile.switchOnAirplaneMode();
        Mobile.switchOnAirplaneMode();
        System.out.println(Covers.red.getColor());

        System.out.println("------------- Price changed -----------");
        iphone.display();
        System.out.println("------------------------");

        Mobile samsung = new Mobile(2,"samsung ultra",13000.00);
        samsung.display();
        System.out.println(Mobile.mobile_Carrier);
        Mobile.switchOnAirplaneMode();
        Mobile.switchOnAirplaneMode();

        System.out.println(Covers.blue.getColor());


        System.out.println("-------------------------");


        Mobile pixel = new Mobile(3,"pixel 5",60000.00);
        pixel.display();
        System.out.println(Mobile.mobile_Carrier);
        Mobile.switchOnAirplaneMode();
        Mobile.switchOnAirplaneMode();
    }
}


interface SimCard{
    void enterCard();
}

class OldPhone implements SimCard{
    void calling(){
        System.out.println("dialpad");
    }

    @Override
    public void enterCard(){
        System.out.println("card entered");
    }
}


class Mobile extends OldPhone{

    private Integer phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        priceChange(price);
    }

    private String name;
    private Double price;
    static String mobile_Carrier = "airtel";

    // constructor
    Mobile(){
        System.out.println("DC");
    }

    public Mobile( Integer phone, String name ,Double price){

        this.phone = phone;
        this.name = name;
        this.price=price;
    }

    void display(){
//        getName();
//        getPhone();
//        getPrice();

        System.out.println("Phone :"+this.phone);
        System.out.println("name :"+this.name);
        System.out.println("pricw :"+this.price);
    }

   static boolean airplaneMode = false;
    static void switchOnAirplaneMode(){
        if(!airplaneMode){
            System.out.println("airplane mode on");
            airplaneMode = true;
        } else {
            System.out.println("airplane mode off");
            airplaneMode = false;
        }

    }

    void priceChange(Integer price){
        System.out.println("Change price in Integers"+this.price);
    }
    void priceChange(Double price){
        System.out.println("Change price in decimals :"+this.price);
    }

    @Override
    void calling(){
        System.out.println("dialpad ->touch dialpad now!!");
    }

}


enum Covers{
    red("red_pokeman"),
    blue("blue_pokemon");

   private String colors;

   Covers(String colors){
       this.colors=colors;
   }

   String getColor(){
      return this.colors;
   }
}