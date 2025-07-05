package Atb13x_Exerscises.ex_19_OOps_Inheritance.single_inheritance;

public class Lab181_real_si {
    public static void main(String[] args) {

        CommonToAll c1 = new CommonToAll();
//        c1.startBrowser();
//        c1.closeBrowser();
//        c1.readDataBaseFile();
//        c1.readExcelFile();


        // test case 1 and ctest case2 running and have common function from commonclass
        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runnunfTC2();


        //
        CommonToAll c = new CommonToAll();
        TestCase1 t3 = new TestCase1();


        // DYNAMIC DISPATCH

        CommonToAll c2 = new TestCase1(); // Dynamic Dispatch (extends)

// Webdriver driver = new ChromeDriver();  --> example


    }
}
