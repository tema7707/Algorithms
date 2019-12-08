class Solution {
    
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList();
        
        HashMap<Integer, List<Integer>> notFullGroups = new HashMap();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!notFullGroups.containsKey(groupSizes[i])) {
                notFullGroups.put(groupSizes[i], new ArrayList());
            }
            
            notFullGroups.get(groupSizes[i]).add(i);
            if (notFullGroups.get(groupSizes[i]).size() == groupSizes[i]) {
                ans.add(notFullGroups.get(groupSizes[i]));
                notFullGroups.remove(groupSizes[i]);
            }
        }
        
        return ans;
    }
}