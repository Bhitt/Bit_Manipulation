/* 
	Solution 1 
	
	A & B == 0 :
		This means that A and B never have a 1 bit in the same place.

	(n - 1) compared to n :
		When you subtract 1 from a number, you look at the least significant bit. If it's a 1 you
		change it to 0, and you are done. If it's a zero, you must "borrow" from a larger bit. So,
		you go to increasingly larger bits, changing each bit from a 0 to a 1, until you find a 1.
		You flip that 1 to a 0 and you are done. Thus, n-1 will look like n, except that n's initial
		0s will be 1s in n-1, and n's least significant 1 will be a 0 in n-1. That is:
			if     n   = abcde1000
			then   n-1 = abcde0111

	n & (n-1) == 0 :
		n and n-1 must have no 1s in common. So abcde must be all 0s, which meants that it looks like
		this: 00001000. The value of n is a power of 2. 
*/


/* 
	Time Complexity: 
	Space Complexity: 
*/


/* this function simply returns if n is a power of 2 (or if n is 0) */
boolean checkPowerOf2(int n){
	return ((n & (n-1)) == 0);
}