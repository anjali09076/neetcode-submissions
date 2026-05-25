

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // HashMap to store grouped anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string to char array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to string
            String sortedStr = new String(chars);

            // If key not present, create new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            // Add original word into its group
            map.get(sortedStr).add(str);
        }

        // Return all grouped values
        return new ArrayList<>(map.values());
    }
}