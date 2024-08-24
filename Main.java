import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;


public class Main {

    public static void main (String[] args) {

        List<String> arrList = new ArrayList<String>();
        Map<String,String> obj = new HashMap<>();

        arrList.add("1");
        arrList.add("1");
        arrList.add("1");
        arrList.add("2");
        arrList.add("3");

        obj.put("key1", "value1");
        obj.put("key2", "value2");

        List<String> filtered = arrList.stream().filter(item -> item.equals("1")).collect(Collectors.toList());

        System.out.println(""+ filtered + obj.values());
    }
}



