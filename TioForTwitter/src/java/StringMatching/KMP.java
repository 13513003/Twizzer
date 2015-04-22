package StringMatching;

public class KMP {
    private final int R;       // the radix
    private int[][] dfa;       // the KMP dfa
    private String pat;        // pattern string

    // membuat DFA dari String
    public KMP(String pat) {
        this.R = 256;
        this.pat = pat;

        // membangun DFA dari pattern
        int M = pat.length();
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][X];
            dfa[pat.charAt(j)][j] = j+1;  
            X = dfa[pat.charAt(j)][X];     
        }
    }

    // mengembalikan offset first match; N jika tidak ada yang match
    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if (j == M) return i - M;    // found
        return N;                    // not found
    } 
}
