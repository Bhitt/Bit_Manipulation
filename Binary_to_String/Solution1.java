/* 
	Solution 1 
	
	0.101(base 2) would look like
		1 * (1/2)    +    0 * (1/2^2)    +    1 * (1/2^3)
	Shift the fractional sum by multiplying by 2, then compare to 1 for every digit.
*/


/* 
	Time Complexity: 
	Space Complexity: 
*/

String printBinary(double num){
	if(num >= 1 || num <= 0){
		return "ERROR";
	}

	StringBuilder binary = new StringBuilder();
	binary.append(".");
	while(num > 0){
		/* setting a limit on length: 32 characters */
		if(binary.length() >= 32){
			return "ERROR";
		}

		double r = num * 2;
		if(r >= 1){
			binary.append(1);
			num = r - 1;
		} else {
			binary.append(0);
			num = r;
		}
	}
	return binary.toString();
}