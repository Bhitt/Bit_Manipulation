/*
	Update Bit

	To set the ith bith to a value v, we first clear the bit at position i by using a mask that looks
	like 11101111. Then, we shift the intended value v, left by i bits. This will create a number with
	bit i equal to v and all other bits equal to 0. Finally, we OR these two numbers, updating the ith
	bit if v is 1 and leaving it as 0 otherwise.

*/

int updateBit(int num, int i, boolean bitIs1){
	int value = bitIs1 ? 1 : 0;
	int mask = ~(1 << i);
	return (num & mask) | (value << i);
}