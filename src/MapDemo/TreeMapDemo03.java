package MapDemo;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo03 {
    public static void main(String[] args) {
        String a = "aababcabcdabcde";
        
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(tm.containsKey(c)){
                int count = tm.get(c);
                count++;
                tm.put(c, count);
            }else{
                tm.put(c, 1);
            }
        }
        Set<Entry<Character, Integer>> entrySet = tm.entrySet();
        for (Entry<Character,Integer> es : entrySet) {
            System.out.print(es.getKey()+"("+es.getValue()+")");
        }
    }
}
