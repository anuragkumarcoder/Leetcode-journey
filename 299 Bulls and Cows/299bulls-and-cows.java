class Solution {
    public String getHint(String secret, String guess) {
        boolean[] gu = new boolean[secret.length()];
        boolean[] se = new boolean[secret.length()];

        int bull = 0;
        int cow = 0;

        for (int i = 0; i < secret.length(); i++) {
            char sec = secret.charAt(i);
            char gues = guess.charAt(i);
            if (sec == gues) {
                bull++;
                gu[i] = true;
                se[i] = true;
            }
        }

        for (int j = 0; j < secret.length(); j++) {
            if (se[j]) continue;

            char sec = secret.charAt(j);

            for (int k = 0; k < guess.length(); k++) {
                if (gu[k]) continue;

                char gues = guess.charAt(k);

                if (sec == gues) {
                    cow++;
                    gu[k] = true;
                    break;
                }
            }
        }

        return bull + "A" + cow + "B";
    }
}
