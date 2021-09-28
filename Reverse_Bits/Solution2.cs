/* 
	Solution 2
	
	This solution is slightly faster than solution 1, as it is more optimized.
*/


/* 
	Time Complexity: O(1), since we always iterate through 32 bits 
	Space Complexity: O(1)
*/

public class Solution {
    public uint reverseBits(uint n) {
        uint ans = 0;
        for(int i = 0; i < 32; i++)
        {
            ans <<= 1;              // Move answer bits left
            ans |= (n & (uint)1);   // Or answer bits with the last bit of n (this adds the bit to ans)
            n >>= 1;                // Remove the last bit from n
        }
        return ans;
    }
}

/*
	LEET CODE RESULTS

	Runtime: 36 ms, faster than 98.51% of C# online submissions for Reverse Bits.
	Memory Usage: 15.7 MB, less than 53.96% of C# online submissions for Reverse Bits.
*/