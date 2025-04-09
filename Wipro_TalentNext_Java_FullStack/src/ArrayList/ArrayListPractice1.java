package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice1 {
    List<Integer> integerArrayList = new ArrayList<Integer>();




    List<String> stringArrayList = new ArrayList<String>();


    public static void main(String[] args) {
        ArrayListPractice1 obj = new ArrayListPractice1();
        obj.integerArrayList.add(10);
        obj.integerArrayList.add(19);
        obj.integerArrayList.add(28);
        obj.integerArrayList.add(37);
        obj.integerArrayList.add(46);
        obj.integerArrayList.add(55);
        obj.integerArrayList.add(64);
        System.out.println(obj.integerArrayList);


        obj.stringArrayList.add("Smitanshu");
        obj.stringArrayList.add("Devendra");
        obj.stringArrayList.add("Ukey");
        obj.stringArrayList.add("--");
        obj.stringArrayList.add("Himanshu");
        obj.stringArrayList.add("Devendra");
        obj.stringArrayList.add("Ukey");
        System.out.println(obj.stringArrayList);
    }
}
