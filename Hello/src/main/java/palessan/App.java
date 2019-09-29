package palessan;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("\nHello World!");
        System.out.println("\n**********************");
        final List<String> stringList =new ArrayList<String>();
        final String one = "1";
        stringList.add(one);
        stringList.add("2");
        stringList.add("3");

        for (String s : stringList) {
            System.out.println(s);
            s="test";//This works since even though one is final, s is assigned to another object here.
        }

//        for (final String s : stringList) {
//            System.out.println(s);
////            s="test";//this would failed since the string is final. Please notice it doesn't fail above.
//        }

        System.out.println("\n**********************");

        MySecondClass mySecondClass = new MySecondClass(2,"3");

        System.out.println("\nmySecondClass= "+mySecondClass.i+" , "+mySecondClass.s);

    }
}

class MySecondClass {

    int i = 0;
    String s = "";

    MySecondClass(int i) {
        this.i = i;
    }

    MySecondClass(int i, String s) { //if we put public, it will ask to be placed in a file with same name.
        //also it doesn’t allow private or protected.
        this(i);
        this.s = s;
    }
}

