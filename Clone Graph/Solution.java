/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
   public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	        Map<Integer,UndirectedGraphNode> map = new HashMap<Integer,UndirectedGraphNode>();
	        return cloneGraphHelper(node,map);
	    }
	 private UndirectedGraphNode cloneGraphHelper(UndirectedGraphNode source,Map<Integer,UndirectedGraphNode> map){
		 if(source  == null)
			 return null;
		 if(map.containsKey(source.label))
			 return map.get(source.label);
		 UndirectedGraphNode node = new UndirectedGraphNode(source.label);
		 map.put(node.label,node);
		 for( UndirectedGraphNode temp : source.neighbors){
		     UndirectedGraphNode clone= cloneGraphHelper(temp,map);
		    node.neighbors.add(clone);
		 }
		 return node;
	 }
}