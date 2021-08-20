/* 
	Solution 1 
	
	Mask all odd bits with 10101010 in binary (which is 0xAA), then shift them right by 1 to put them
	in the even spots. For the even bits, we do an equivalent operation. Finally, we merge the two
	values.

	Note: We use the logical right shift, instead of the arithmetic right shift so that the sign bit
	is filled with a zero.

	This code works for 32-bit integers in Java. 64-bit integers would need a different mask.
*/


/* 
	Time Complexity: O(1)
	Space Complexity: O(1)
*/

int swapOddEvenBits(int x){
	return (((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1));
}