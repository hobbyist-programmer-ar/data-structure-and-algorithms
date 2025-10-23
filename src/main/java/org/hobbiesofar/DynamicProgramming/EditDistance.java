package org.hobbiesofar.DynamicProgramming;


class EditDistance {
    public int minDistance(String word1, String word2) {
        int answer = 0;
        int word1Length = word1.length();
        int word2Length = word2.length();
        if(word1.equalsIgnoreCase(word2)) {
            return 0;
        }
        if(word1.isEmpty()) {
            return word2.length();
        }
        if(word2.isEmpty()) {
            return word1.length();
        }
        int[][] dp = new int[word1Length + 1][word2Length + 1];

        for(int j = 1; j <= word2Length; j++) {
            dp[0][j] = j;
        }
        for(int i = 1; i <= word1Length; i++) {
            dp[i][0] = i;

            for(int j = 1; j<= word2Length; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                }
            }
        }

        return dp[word1Length][word2Length];

    }
}
