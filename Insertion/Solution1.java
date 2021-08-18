/* 
	Solution 1 
	
	1. Clear the bits j through i in N.
	2. Shift M so that it lines up with bits j through i.
	3. Merge M and N
*/


/* 
	Time Complexity: 
	Space Complexity: 
*/

int updateBits(int n, int m, int i, int j){
	/* create a mask to clear bits i through j in n. Example: i = 2, j = 4. Result should be 11100011.
	For simplicity, we'll use just 8 bits for the example */
	int allOnes = ~0; // will equal a sequence of all 1s

	// 1s before position j, then 0s. left = 11100000
	int left = allOnes << (j + 1);

	// 1s after position i. right = 00000011
	int right = ((1 << i) - 1);

	// All 1s, except for 0s in between i and j. Mask = 11100011
	int mask = left | right;

	/* clear bits j through i then put m in there */
	int n_cleared = n & mask; // clear bits j through i
	int m_shifted = m << i; // move m into correct position

	return n_cleared | m_shifted; // OR them, and we're done
}