package sample;

public class TooMuchStudentsException extends Exception {

	public TooMuchStudentsException () {
		super("There is more then 10 students");
		
	}
	
}
