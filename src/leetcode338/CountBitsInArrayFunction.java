package leetcode338;

public class CountBitsInArrayFunction {
	// Dp
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        
        int offset = 1;
        
        // 0 is 0000
        dp[0] = 0;
        
        for(int i = 1; i <= num; i++){
        	// if its 2,4,8, offset will be multiply 2
            if(offset * 2 == i){
                offset = offset * 2;
            }
            
            // Formula to get the number of bit 1
            // 1-1,2-2,3-2,4-4,5-4,6-4,7-4,8-8
            dp[i] = dp[i - offset] + 1;
        }
        
        return dp;
    }
    
    public int[] countBits1(int num){
    	int[] result = new int[num + 1];
    	
    	if(num >= 0){
    		result[0] = 0;
    	}
    	
    	for(int i = 1; i <= num; i++){
    		// i % 2 will be 0 if its 2,4,8
    		result[i] = result[i / 2] + i % 2;
    	}
    	
    	return result;
    }
}
