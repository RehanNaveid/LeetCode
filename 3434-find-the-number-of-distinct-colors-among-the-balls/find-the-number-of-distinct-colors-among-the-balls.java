class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> color = new HashMap<>();  // Stores ball -> color mapping
        Map<Integer, Integer> freq = new HashMap<>();   // Stores color -> count mapping
        int n = queries.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int newColor = queries[i][1];

            if (color.containsKey(ball)) {
                int oldColor = color.get(ball);
                freq.put(oldColor, freq.get(oldColor) - 1);
                if (freq.get(oldColor) == 0) {
                    freq.remove(oldColor);
                }
            }

            color.put(ball, newColor);
            freq.put(newColor, freq.getOrDefault(newColor, 0) + 1);

            res[i] = freq.size();
        }

        return res;
    }
}
