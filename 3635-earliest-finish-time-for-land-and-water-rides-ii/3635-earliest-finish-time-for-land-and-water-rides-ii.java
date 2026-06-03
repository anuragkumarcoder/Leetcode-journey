public class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinish = Integer.MAX_VALUE;

        int minLandFinish = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            minLandFinish = Math.min(minLandFinish, landStartTime[i] + landDuration[i]);
        }
        
        for (int j = 0; j < waterStartTime.length; j++) {
            int finish = Math.max(minLandFinish, waterStartTime[j]) + waterDuration[j];
            minFinish = Math.min(minFinish, finish);
        }

        int minWaterFinish = Integer.MAX_VALUE;
        for (int j = 0; j < waterStartTime.length; j++) {
            minWaterFinish = Math.min(minWaterFinish, waterStartTime[j] + waterDuration[j]);
        }
        
        for (int i = 0; i < landStartTime.length; i++) {
            int finish = Math.max(minWaterFinish, landStartTime[i]) + landDuration[i];
            minFinish = Math.min(minFinish, finish);
        }

        return minFinish;
    }
}