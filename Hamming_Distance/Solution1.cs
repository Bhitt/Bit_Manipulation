/* 
	Solution 1 
	
	While either input integer is greater than 0
		Add one to the total distance if the first bit is different for both integers
		Then remove the first bit for both integers

	Return the total distance
*/


/* 
	Time Complexity: O(n), where n is the number of bits in the larger of two integers 
	Space Complexity: O(1)
*/

public class Solution {
    public int HammingDistance(int x, int y) {
        int hDist = 0;
        while(x > 0 || y > 0){
            hDist += ((x & 1) ^ (y & 1));
            x >>= 1;
            y >>= 1;
        }
        
        return hDist;
    }
}

/*
	LEET CODE RESULTS

	Runtime: 32 ms, faster than 99.50% of C# online submissions for Hamming Distance.
	Memory Usage: 15.2 MB, less than 39.70% of C# online submissions for Hamming Distance.
*/