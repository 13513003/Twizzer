package StringMatching;

public class BM {
    private final int R;     // the radix
    private int[] right;     // the bad-character skip array
    private String pat;      // pattern string

    // pattern dalam bentuk string
    public BM(String pat) {
        this.R = 256;
        this.pat = pat;

        // posisi paling kanan c dalam pattern
        right = new int[R];
        for (int c = 0; c < R; c++)
            right[c] = -1;
        for (int j = 0; j < pat.length(); j++)
            right[pat.charAt(j)] = j;
    }

    // mengembalikan offset first match; N jika tidak ada yang match
    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M-1; j >= 0; j--) {
                if (pat.charAt(j) != txt.charAt(i+j)) {
                    skip = Math.max(1, j - right[txt.charAt(i+j)]);
                    break;
                }
            }
            if (skip == 0) return i;    // found
        }
        return N;                       // not found
    }    
}
