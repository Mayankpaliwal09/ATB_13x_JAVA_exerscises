package Atb13x_Exerscises.ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {

    public static void main(String[] args) {

        Square sq = new Square();
        sq.getArea(2,3);

        Rectangle r = new Rectangle();
        r.getArea(10,10);
    }
}

abstract class A {
    abstract void m1();

    void complete() {
        System.out.println("complete!");
    }
}

interface polygon{
    void getArea(int length ,int breadth);

    //    void complete(){
//
//    }

    default void complete() {
        System.out.println("This is possible !");
    }

    default void complete2() {
        System.out.println("This is possible2 !");
    }

    static void staticComplete() {
        System.out.println("Static F1 in interface allowed, complete");
    }
}


class Square implements polygon{
    @Override
  public void getArea(int length, int breadth){
      System.out.println("area of aquare is :"+ 3.14*length*breadth);
    }
}


class Rectangle implements polygon{
    @Override
    public void getArea(int length, int breadth){
        System.out.println("The area of the rectangle is " + (length * breadth));

    }
}