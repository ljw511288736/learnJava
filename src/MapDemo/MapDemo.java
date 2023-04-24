package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        //put方法：一、添加元素；二、覆盖，并把之前的value值输出
        m.put("ljw", "Skyrim1ee");
        
        String value = m.put("ljw", "zwj");//键是唯一的
        m.put("l", "li");
        m.put("j", "jie");
        m.put("w", "wen");

        //String result = m.remove("ljw");
        //System.out.println(result);

        //m.clear();

        boolean key = m.containsKey("ljw");
        System.out.println(key);

        boolean valueResult = m.containsValue("zwj"); 
        System.out.println(valueResult);

        boolean emptyResult = m.isEmpty();
        System.out.println(emptyResult);

        int size = m.size();
        System.out.println(size);

        System.out.println(value);
        System.out.println(m);
    }
}
