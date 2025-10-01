import java.util.*;

class Solution {
    public String rankTeams(String[] votes) {
        if (votes == null || votes.length == 0) return "";
        
        int n = votes[0].length(); // number of teams
        Map<Character, int[]> map = new HashMap<>();
        
        // initialize each team with a count array
        for (char c : votes[0].toCharArray()) {
            map.put(c, new int[n]);
        }
        
        // fill counts
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char c = vote.charAt(i);
                map.get(c)[i]++;   // increment position count
            }
        }
        
        // create list of teams
        List<Character> teams = new ArrayList<>(map.keySet());
        
        // custom sort
        Collections.sort(teams, (a, b) -> {
            int[] countA = map.get(a);
            int[] countB = map.get(b);
            
            for (int i = 0; i < n; i++) {
                if (countA[i] != countB[i]) {
                    return countB[i] - countA[i]; // higher votes first
                }
            }
            return a - b; // alphabetical
        });
        
        // build result
        StringBuilder sb = new StringBuilder();
        for (char c : teams) sb.append(c);
        return sb.toString();
    }
}
