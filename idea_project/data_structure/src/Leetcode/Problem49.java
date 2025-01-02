package Leetcode;

import java.util.*;

public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 同一组字母异位词中的字符串具备相同点，可以使用相同点作为一组字母异位词的标志
        Map<String,List<String>> map = new HashMap<>();
        // 使用哈希表存储每一组字母异位词，哈希表的键为一组字母异位词的标志，哈希表的值为一组字母异位词列表
        for(String str:strs){
            // 遍历每个字符串，对于每个字符串，得到该字符串所在的一组字母异位词的标志
            char[] array=str.toCharArray();
            Arrays.sort(array);
            // 将当前字符串加入该组字母异位词的列表中
            String key = new String(array);
            // 遍历全部字符串之后，哈希表中的每个键值对即为一组字母异位词
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
