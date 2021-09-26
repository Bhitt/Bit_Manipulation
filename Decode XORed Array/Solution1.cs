/* 
    Solution 1 
    
    A XOR B = C
    C XOR A = B
    C XOR B = A

    Just use the above relationship to get original[i+1] = encoded[i] XOR original[i]
*/


/* 
    Time Complexity: O(N) time, where N is the number of elements in the linked list.
    Space Complexity: O(N)
*/

public class Solution {
    public int[] Decode(int[] encoded, int first) {
        int [] original = new int[encoded.Length + 1];
        original[0] = first;
        for(int i = 0; i < encoded.Length; i++){
            original[i+1] = encoded[i]^original[i];
        }
        return original;
    }
}

/*
    LEET CODE RESULTS

    Everyone had the same solution for the most part
*/