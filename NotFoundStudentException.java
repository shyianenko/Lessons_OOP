package sample;

public class NotFoundStudentException extends Exception{
	public NotFoundStudentException () {
		super("No such student found");
}
	public NotFoundStudentException (String secondName) {
		super("No such student found with " + secondName);
}
}
