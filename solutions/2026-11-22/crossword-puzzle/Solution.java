import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
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
        // collect slots
        List<Slot> slots = new ArrayList<>();
        // horizontal slots
        for (int r = 0; r < 10; r++) {
            int c = 0;
            while (c < 10) {
                if (board[r][c] == '-') {
                    int start = c;
                    while (c < 10 && board[r][c] == '-') c++;
                    int len = c - start;
                    if (len > 1) slots.add(new Slot(r, start, len, true));
                } else {
                    c++;
                }
            }
        }
        // vertical slots
        for (int c = 0; c < 10; c++) {
            int r = 0;
            while (r < 10) {
                if (board[r][c] == '-') {
                    int start = r;
                    while (r < 10 && board[r][c] == '-') r++;
                    int len = r - start;
                    if (len > 1) slots.add(new Slot(start, c, len, false));
                } else {
                    r++;
                }
            }
        }
        String[] wordArr = words.split(";");
        boolean[] used = new boolean[wordArr.length];
        if (solve(board, slots, 0, wordArr, used)) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                result.add(new String(board[i]));
            }
            return result;
        }
        // Should never happen according to problem statement
        return Collections.emptyList();
    }

    private static boolean solve(char[][] board, List<Slot> slots, int idx, String[] words, boolean[] used) {
        if (idx == slots.size()) return true;
        Slot slot = slots.get(idx);
        for (int w = 0; w < words.length; w++) {
            if (used[w]) continue;
            String word = words[w];
            if (word.length() != slot.len) continue;
            if (!fits(board, slot, word)) continue;
            char[] backup = place(board, slot, word);
            used[w] = true;
            if (solve(board, slots, idx + 1, words, used)) return true;
            // backtrack
            restore(board, slot, backup);
            used[w] = false;
        }
        return false;
    }

    private static boolean fits(char[][] board, Slot slot, String word) {
        int r = slot.r, c = slot.c;
        for (int i = 0; i < slot.len; i++) {
            char ch = slot.horiz ? board[r][c + i] : board[r + i][c];
            if (ch != '-' && ch != word.charAt(i)) return false;
        }
        return true;
    }

    private static char[] place(char[][] board, Slot slot, String word) {
        char[] backup = new char[slot.len];
        int r = slot.r, c = slot.c;
        for (int i = 0; i < slot.len; i++) {
            if (slot.horiz) {
                backup[i] = board[r][c + i];
                board[r][c + i] = word.charAt(i);
            } else {
                backup[i] = board[r + i][c];
                board[r + i][c] = word.charAt(i);
            }
        }
        return backup;
    }

    private static void restore(char[][] board, Slot slot, char[] backup) {
        int r = slot.r, c = slot.c;
        for (int i = 0; i < slot.len; i++) {
            if (slot.horiz) {
                board[r][c + i] = backup[i];
            } else {
                board[r + i][c] = backup[i];
            }
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

        bufferedWriter.write(result.stream().collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}