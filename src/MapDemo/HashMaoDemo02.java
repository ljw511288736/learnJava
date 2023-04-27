package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class HashMaoDemo02 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            String result = arr[index];
            list.add(result);
            //System.out.println(result);
        }

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("A", 0);
        hm.put("B", 0);
        hm.put("C", 0);
        hm.put("D", 0);
        
        for (int i = 0; i < list.size(); i++) {
            boolean containsKey = hm.containsKey(list.get(i));//存在为false，不存在为true
            if(containsKey){
                //不存在
                //先获取次数
                Integer count = hm.get(list.get(i));
                //次数自增
                count++;
                //重新放回hashmap
                hm.put(list.get(i), count);
            }else{
                //存在
                hm.put(list.get(i), 1);
            }
        }
        System.out.println(hm);
        Set<String> keySet = hm.keySet();
        int max = 0;
        for (String key : keySet) {
            if(max < hm.get(key)){
                max = hm.get(key);
            }
        }
        for (String key : keySet) {
            if(max == hm.get(key)){
                System.out.println(key);
            }
        }
        System.out.println(max);
        //System.out.println(list);
        //System.out.println(list.size());
    }
}
