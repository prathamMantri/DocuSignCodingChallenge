package Exception;
public class WrongCommand extends Exception {

	//Wrong input command Exception
	private static final long serialVersionUID = 1L;

	public WrongCommand(String s) {
		super(s);
	}
}
