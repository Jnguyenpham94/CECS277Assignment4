//Assignment 4
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class InvalidComparisonException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	public InvalidComparisonException(String string, String string2) {
		mString = string;
		mString2 = string2;
	}

	@Override
	public String toString(){
		return "Can't Compare class " + mString + " with " + mString2;
	}

	private String mString;
	private String mString2;
}
