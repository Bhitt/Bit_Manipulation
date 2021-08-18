/*
	Clear Bit

	This method operates in almost the reverse of setBit. First, we create a number like 11101111 by
	creating the reverse of it (00010000) and negating it. Then, we perform an AND with num. This will
	clear the ith bit and leave the remainder unchanged.
*/

int clearBit(int num, int i){
	int mask = ~(1 << i);
	return num & mask;
}

/*
	To clear all bits from the most significant bit through i (inclusive), we create a mask with a 1
	at the ith bit (1 << i). Then, we subtract 1 from it, giving us a sequence of 0s followed by i 1s.
	We then AND our number with this mask to leave just the last i bits.
*/

int clearBitsMSBthroughI(int num, int i){
	int mask = (1 << i) - 1;
	return num & mask;
}

/* 	
	To clear all bits from i through 0 (inclusive), we take a sequence of all 1s (which is -1) and
	shift it left by i + 1 bits. This gives us a sequence of 1s (in the most significant bits) followed
	by i 0 bits.
*/

int clearBitsIthrough0(int num, int i){
	int mask = (-1 << (i + 1));
	return num & mask;
}