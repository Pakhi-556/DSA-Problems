class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> rootSet = new HashSet<>(dictionary);

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (rootSet.contains(prefix)) {
                    break;
                }
            }
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(prefix);
        }

        return result.toString();
    }
}