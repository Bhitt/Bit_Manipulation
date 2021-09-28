/* 
	Solution 1 
	
	Swap pairs of bits from the both sides of the string of bits, increnting inwards towards the 
	center of the number.
*/


/* 
	Time Complexity: O(N) time, where N is the number of elements in the linked list.
	Space Complexity: O(N)
*/

public class Solution {
    public uint reverseBits(uint n) {
        for(int i = 0; i < 16; i++){
            bool temp = getBit(n, i);               // temp = A
            n = updateBit(n, i, getBit(n,31-i));    // A = B
            n = updateBit(n, 31 - i, temp);         // B = temp
        }
        return n;
    }
    
    bool getBit(uint num, int i){
        return ((num & (1 << i)) != 0);
    }
    
    uint updateBit(uint num, int i, bool bitIs1){
        uint value = bitIs1 ? (uint) 1 : (uint) 0;
        uint mask = ~((uint)1 << i);
        return (num & mask) | (value << i);
    }
}

/*
	LEET CODE RESULTS

	Runtime: 44 ms, faster than 70.79% of C# online submissions for Reverse Bits.
	Memory Usage: 15.6 MB, less than 53.96% of C# online submissions for Reverse Bits.
*/