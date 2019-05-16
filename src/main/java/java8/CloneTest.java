package java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CloneTest extends Object{

    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<String>();
        list.add("Ram");
        List<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println(clonedList.size());*/

        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);
        list.set(0,120);

        //list.removeIf(i -> i == 110);
        list.remove(new Integer(450));
        System.out.println(list);

        Object c = new CloneTest();
        System.out.println(""+c.getClass());
        System.out.println(""+Object.class);
    }
}

interface Animal {

}
