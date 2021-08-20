/* 
	Solution 1 
	
	Each 1 in the XOR represents a bit that is different between A and B. Therefore, to check the
	number of bits that are different between A and B, we simply need to count the number of bits
	in A^B that are 1.
*/


/* 
	Time Complexity: 
	Space Complexity: 
*/

int bitSwapRequired(int a, int b){
	int count = 0;
	for(int c = a ^ b; c != 0; c = c >>> 1){
		count += c & 1;
	}
	return count;
}
