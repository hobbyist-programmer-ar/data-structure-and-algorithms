package org.hobbiesofar.String;

class RabinKarpAlgorithm {
    private final static int d = 26;
    private final static int q = 26;

    private static void search(String pattern, String text) {
        int m = pattern.length();
        int n = text.length;
        int i, j;
        int p = 0;
        int t = 0;
        int h =1;

        for (i = 0; i < m -1; i++) {
            h = (h * d) % q;
        }

        for(i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for(i = 0; i <= n - m; i++) {
            if(p==t) {
                for(j = 0; j < m; j++) {
                    if(txt.charAt(j + i) != pattern.charAt(j))
                        break;
                }
                if(j == m) {
                    System.out.println("Pattern Found at Position : " + i + 1);
                }
            }
            if(i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
                if(t < 0)
                    t = (t + q);
            }
        }
    }
}
