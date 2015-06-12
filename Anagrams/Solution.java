public class Solution {
  public List<String> anagrams(String[] strs) {
   List<String> result = new ArrayList<String>();
   Map<String,List<Integer>> mapping = new HashMap<String,List<Integer>>();
   for(int i = 0; i < strs.length; i++){
	   char[] charArray = strs[i].toCharArray();
	   Arrays.sort(charArray);
	   String key = String.valueOf(charArray);
	   List<Integer> value = mapping.get(key);
	   if(value == null){
		   value = new ArrayList<Integer>();
		   value.add(i);
		   mapping.put(key, value);
		   
	   }else
		   value.add(i);
   }
   for(List<Integer> value : mapping.values()){
	   if(value.size() > 1){
		   for(int i: value)
			   result.add(strs[i]);
	   }
   }
   return result;
}
}