import java.util.ArrayList;
import java.util.List;

//This class is for processing the data and filling the List with proper responses

public class Process {
	private List<String> output;
	
	Process()
	{
		output = new ArrayList<String>();
	}
	public List<String> processInput(Input input)
	{	
		String tempType = input.getTempType();
		
		 for (int i : input.getCommands()) {
			 if(tempType.equals("HOT"))//Filling the List with Hot Responses if Hot command is issued
			 {
			 switch (i) {
				case 1:
					output.add(input.getType1().getHotResponse());
					break;
				case 2:
					output.add(input.getType2().getHotResponse());
					break;
				case 3:
					output.add(input.getType3().getHotResponse());
					break;
				case 4:
					output.add(input.getType4().getHotResponse());
					break;
				case 5:
					output.add(input.getType5().getHotResponse());
					break;
				case 6:
					output.add(input.getType6().getHotResponse());
					break;
				case 7:
					output.add(input.getType7().getHotResponse());
					break;
				case 8:
					output.add(input.getType8().getHotResponse());
					break;
			 }
			}
			 else{//Filling the List with Cold Responses if cold command is issued
				 switch (i) {
					case 1:
						output.add(input.getType1().getColdResponse());
						break;
					case 2:
						output.add(input.getType2().getColdResponse());
						break;
					case 3:
						output.add(input.getType3().getColdResponse());
						break;
					case 4:
						output.add(input.getType4().getColdResponse());
						break;
					case 5:
						output.add(input.getType5().getColdResponse());
						break;
					case 6:
						output.add(input.getType6().getColdResponse());
						break;
					case 7:
						output.add(input.getType7().getColdResponse());
						break;
					case 8:
						output.add(input.getType8().getColdResponse());
						break;
				 }
			 }
	      }
		return output;
	}
	
}
