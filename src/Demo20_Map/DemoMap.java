package Demo20_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        // 创建map对象
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        // 添加元素到集合
        map.put("Jack",20);
        map.put("Tom",18);
        map.put("Marry",19);
        map.remove("Jack"); // 删除对象
        System.out.println(map.get("Tom")); // 根据键获取值

        Set<String> s1 =  map.keySet(); // 将所有键转化为集合

        Set<Map.Entry<String, Integer>> s2 = map.entrySet();
        System.out.println(s1);

    }
}
