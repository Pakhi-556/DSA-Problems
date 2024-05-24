class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] letterCount = new int[26];
        for (char l : letters) {
            letterCount[l - 'a']++;
        }
        return dfs(words, score, letterCount, 0);
    }

    private int dfs(String[] words, int[] score, int[] letterCount, int index) {
        if (index == words.length) return 0;
        int skipScore = dfs(words, score, letterCount, index + 1);
        int wordScore = 0;
        int[] newLetterCount = letterCount.clone();
        boolean valid = true;
        for (char c : words[index].toCharArray()) {
            if (newLetterCount[c - 'a'] == 0) {
                valid = false;
                break;
            }
            newLetterCount[c - 'a']--;
            wordScore += score[c - 'a'];
        }
        int takeScore = 0;
        if (valid) {
            takeScore = wordScore + dfs(words, score, newLetterCount, index + 1);
        }
        return Math.max(skipScore, takeScore);
    }
}