package ch06_varargs;

public class VarArg {
	
	static String concatenate(String delim, String...args) {
		String result ="";
		
		for(String str : args) {
			result += str + delim;
		}
		return result;
	}
	
	/*
	 static String concatenate(String...args) {
	 
	  	return concatenate( "", args );
	  }
	 */
}
