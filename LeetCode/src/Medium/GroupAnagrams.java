public class GroupAnagrams {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Input: " + String.join(", ", input));
        System.out.println("Grouped Anagrams: " + groupAnagrams(input));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}

/*
Example Output:
Input: eat, tea, tan, ate, nat, bat
Grouped Anagrams: [[bat], [nat, tan], [ate, eat, tea]]
*/ 

/*
Explanation:
1. The main method initializes an array of strings containing words that may be anagrams.
2. The groupAnagrams method takes this array as input and groups the anagrams together.
3. It uses a HashMap to store sorted strings as keys and lists of anagrams as values.
4. The sorted version of each string is used to identify anagrams.
5. Finally, the method returns a list of lists containing grouped anagrams.
*/