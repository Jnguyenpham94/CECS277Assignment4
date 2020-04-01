//Assignment 4
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class InvalidDistanceComputationException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDistanceComputationException(String string, String string2) {
		this.mString = string;
		this.mString2 = string2;
	}

	@Override
	public String toString(){
		return "can't Compute Distance Between class " + mString + " and " + mString2;
	}

	private String mString;
	private String mString2;

}
