package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {



        List<String> provinceList = new ArrayList<>();
        // add
        provinceList.add("Test1");
        provinceList.add("Test2");
        provinceList.add("Test3");
        provinceList.add("Test4");
        provinceList.add("Test5");
        // alignment
        Collections.sort(provinceList);
        // get
        String province = provinceList.get(1);
        // binary search
        int index = Collections.binarySearch(provinceList,"Test1");
        // reverse
        Collections.reverse(provinceList);
        //Mix up
        Collections.shuffle(provinceList);
        // remove
        provinceList.remove("Test1");
        // size
        System.out.println(provinceList.size());
        System.out.println(province);

        for (String i : provinceList){
            System.out.println(i);
        }
        // cleare
        provinceList.clear();


    }
}
