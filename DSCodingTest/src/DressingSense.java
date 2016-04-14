import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




public class DressingSense {
	
	private Input input;
	private Validation valid;
	private Process process;
	private boolean isValid;

	
	DressingSense()
	{
		process = new Process();
		valid= new Validation();
	}

	//Main method to take input through scanner and call necessary functions
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in;
		in = sc.nextLine();
		DecodeInput decodeInput;
		DressingSense ds = new DressingSense();
		List<String> out = new ArrayList<String>();
		
		try {
			decodeInput = new DecodeInput(in);
			ds.input=decodeInput.createDTO();
			//System.out.println(ds.input);
			
			ds.isValid=ds.valid.validateInput(ds.input); // Validate the input for give criteria
			if(ds.isValid)
			{
				out = ds.process.processInput(ds.input);
				 for (String s : out) {
			         System.out.print(s+ ","); // Showing result of commands if they are valid 
			      }
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
}
