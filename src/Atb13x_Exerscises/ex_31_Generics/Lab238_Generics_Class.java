package Atb13x_Exerscises.ex_31_Generics;

public class Lab238_Generics_Class {

    public static void main(String[] args) {
        GenericClass g = new GenericClass<>("mayank");
        System.out.println(g.getData());
        g.setData("Mayank Paliwal");
        System.out.println(g.getData());

        GenericClass g1 = new GenericClass<>(2);
        System.out.println(g1.getData());

        GenericClass g2 = new GenericClass<>(3.14);
        System.out.println(g2.getData());

        GenericClass g3 = new GenericClass<>(true);
        System.out.println(g3.getData());
    }

}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data=data;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }


}
