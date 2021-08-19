  
/* 
	Solution 1 
	
	Walk through the integer, tracking the current 1s sequence length and the previous 1s sequence
	length. When we see zero, update previousLength:
	- If the next bit is a 1, previousLength should be set to currentLength
	- If the next bit is a 0, then we can't merge these sequences together. So, set previousLength
	to 0.
	Update max length as we go
*/


/* 
	Time Complexity: O(b), where b is the number of bits
	Space Complexity: O(1)
*/

int flipBit(int a){
	/* If all 1s, this is already the longest sequence */
	if(~a == 0) return Integer.BYTES * 8;

	int currentLength = 0;
	int previousLength = 0;
	int maxLength = 1; // We can always have a sequence of at least one 1
	while(a != 0){
		if((a & 1) == 1){ // Current bit is a 1
			currentLength++;
		} else if((a & 1) == 0){ // Current bit is a 0
			/* update to 0 (if next bit is 0) or currentLength (if next bit is 1) */
			previousLength = (a & 2) == 0 ? 0 : currentLength;
			currentLength = 0;
		}
		maxLength = Math.max(previousLength + currentLength + 1, maxLength);
		a >>>1;
	}
	return maxLength;
}