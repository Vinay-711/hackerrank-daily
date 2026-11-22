import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    private static class Slot {
        int r, c, len;
        boolean horiz;
        Slot(int r, int c, int len, boolean horiz) {
            this.r = r; this.c = c; this.len = len; this.horiz = horiz;
        }
    }

    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
        char[][] board = new char[10][10];
        for (int i = 0; i < 10; i++) {
            board[i] = crossword.get(i).toCharArray();
        }
        String[] wordArr = words.split(";");
        List<Slot> slots = new ArrayList<>();
        // horizontal slots
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 10) {
                if (board[i][j] == '-') {
                    int start = j;
                    while (j < 10 && board[i][j] == '-') j++;
                    int len = j - start;
                    if (len > 1) slots.add(new Slot(i, start, len, true));
                } else {
                    j++;
                }
            }
        }
        // vertical slots
        for (int j = 0; j < 10; j++) {
            int i = 0;
            while (i < 10) {
                if (board[i][j] == '-') {
                    int start = i;
                    while (i < 10 && board[i][j] == '-') i++;
                    int len = i - start;
                    if (len > 1) slots.add(new Slot(start, j, len, false));
                } else {
                    i++;
                }
            }
        }
        boolean[] used = new boolean[wordArr.length];
        solve(0, slots, board, wordArr, used);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }

    private static boolean solve(int idx, List<Slot> slots, char[][] board, String[] words, boolean[] used) {
        if (idx == slots.size()) return true;
        Slot slot = slots.get(idx);
        for (int w = 0; w < words.length; w++) {
            if (!used[w] && words[w].length() == slot.len) {
                if (canPlace(slot, board, words[w])) {
                    List<int[]> changed = place(slot, board, words[w]);
                    used[w] = true;
                    if (solve(idx + 1, slots, board, words, used)) return true;
                    used[w] = false;
                    undo(changed, board);
                }
            }
        }
        return false;
    }

    private static boolean canPlace(Slot slot, char[][] board, String word) {
        for (int k = 0; k < slot.len; k++) {
            int r = slot.r + (slot.horiz ? 0 : k);
            int c = slot.c + (slot.horiz ? k : 0);
            char ch = board[r][c];
            if (ch != '-' && ch != word.charAt(k)) return false;
        }
        return true;
    }

    private static List<int[]> place(Slot slot, char[][] board, String word) {
        List<int[]> changed = new ArrayList<>();
        for (int k = 0; k < slot.len; k++) {
            int r = slot.r + (slot.horiz ? 0 : k);
            int c = slot.c + (slot.horiz ? k : 0);
            if (board[r][c] == '-') {
                board[r][c] = word.charAt(k);
                changed.add(new int[]{r, c});
            }
        }
        return changed;
    }

    private static void undo(List<int[]> changed, char[][] board) {
        for (int[] pos : changed) {
            board[pos[0]][pos[1]] = '-';
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<String> crossword = IntStream.range(0, 10).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        String words = bufferedReader.readLine();

        List<String> result = Result.crosswordPuzzle(crossword, words);

        bufferedWriter.write(result.stream().collect(Collectors.joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}