package MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("l", "li");
        m.put("j", "jie");
        m.put("w", "wen");
        m.put("ljw", "Skyrim1ee");

        // Set<String> keys = m.keySet();
        // for (String k : keys) {
        // System.out.println(k);// 获取键
        // System.out.println(m.get(k));// 获取键对应的值
        // }

        // map用BiConsumer，collection用Consumer
        // m.forEach(new BiConsumer<String, String>() {
        // @Override
        // public void accept(String t, String u) {
        // System.out.println(t + "=" + u);
        // }
        // });

        // map用lambda表达式简化遍历map所有键值对对象
        m.forEach((t, u) -> System.out.println(t + "=" + u));

        // 通过一个方法获取所有的键值对对象， 返回一个Set集合中
        Set<Entry<String, String>> entrySet = m.entrySet();
        // 通过foreach方法遍历Set集合中的所有键值对对象
        for (Entry<String, String> entry : entrySet) {
            // 通过get()方法获取元素的键和值
            String key = entry.getKey();
            String value = entry.getValue();
            // System.out.println(entry);
            System.out.println(key + "=" + value);
        }
    }
}
