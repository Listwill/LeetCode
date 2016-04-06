//49. Group Anagrams

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String string : strs) {
            char[] ch = string.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            List<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<String>();
            }
            list.add(string);
            map.put(key, list);
            }
        List<List<String>> result = new ArrayList<List<String>>();

        for(String key : map.keySet()){
            List<String> list = map.get(key);
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
}