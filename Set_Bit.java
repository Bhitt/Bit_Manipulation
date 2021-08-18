/*
	Set Bit
	
	This method shifts 1 over by i bits, creating a value like 00010000. By performing an OR with
	num, only the value at bit i will change. All other bits of the mask are zero and will not affect
	num.
*/

int setBit(int num, int i){
	return num | (1 << i);
}