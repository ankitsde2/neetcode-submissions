class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<String, Set<Character>> gridMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String gridKey = i / 3 + "," + j / 3;
                if (board[i][j] == '.')
                    continue;
                if (!rowMap.containsKey(i)) {
                    rowMap.put(i, new HashSet<>());

                } else {
                    if (rowMap.get(i).contains(board[i][j]))
                        return false;
                }
                if (!colMap.containsKey(j)) {
                    colMap.put(j, new HashSet<>());

                } else {
                    if (colMap.get(j).contains(board[i][j]))
                        return false;
                }
                if (!gridMap.containsKey(gridKey)) {
                    gridMap.put(gridKey, new HashSet<>());

                } else {
                    if (gridMap.get(gridKey).contains(board[i][j]))
                        return false;
                }
                rowMap.get(i).add(board[i][j]);
                colMap.get(j).add(board[i][j]);
                gridMap.get(gridKey).add(board[i][j]);
            }
        }
        return true;
    }
}
