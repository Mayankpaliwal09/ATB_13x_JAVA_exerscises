package Tasks_java_ATX13.Tasks_3rdJuly_polymorphism.MethodOverloading;

public class Find_maximum {
    public static void main(String[] args) {
        Utility find_max = new Utility();
        int max1 = find_max.max(3,4);
        int max2 = find_max.max(4,10,2);
        double max3 = find_max.max(22.1,22);

        System.out.println("max of two integer is :"+max1);
        System.out.println("max of three integer is :"+max2);
        System.out.println("max of two double value is :"+max3);
    }
}

class Utility{
   int max(int a, int b){
        int max=0;
       if (a>b){
           max = a;
       }else {
           max = b;
       }
       return max;
    }


    int max(int a , int b , int c){
        int max=0;
           if (a>b && a>c){
               max = a;
           } else if (b>a && b>c) {
               max = b;
           }else {
               max =c;
           }
        return max;
    }

    double max(double a , double b){
        double max=0;
        if (a>b){
            max = a;
        }else {
            max = b;
        }
        return max;
    }
}
