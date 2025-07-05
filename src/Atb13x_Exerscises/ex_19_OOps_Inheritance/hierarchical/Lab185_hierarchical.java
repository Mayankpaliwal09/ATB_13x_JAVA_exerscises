package Atb13x_Exerscises.ex_19_OOps_Inheritance.hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        System.out.println("--------");
        Kiran k = new Kiran();
        k.home();
        k.khome();

        System.out.println("--------");
        Devant d = new Devant();
        d.home();
        d.dhome();

        System.out.println("--------");
        Mayank m = new Mayank();
        m.home();
        m.mhome();


    }
}


class Father {
    void home(){
        System.out.println("3BHK - this is Father Property");
    }
}

class Kiran extends Father{
    void khome(){
        System.out.println("1bhk - this is kiran house");
    }
}

class Devant extends Father{
    void dhome(){
        System.out.println("1bhk - this is Devant house");
    }
}

class Mayank extends Father{
    void mhome(){
        System.out.println("1bhk - this is Mayank house");
    }
}
