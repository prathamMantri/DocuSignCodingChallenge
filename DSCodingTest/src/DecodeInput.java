import Exception.WrongCommand;

//This Class Will Decode the input into 2 parts
//First is Temperature Type Command and Other is Array of Commands of integer type
//Also this class checks the commands entered are valid input or not else throws the exception

public class DecodeInput {
	private String data;
	private Input input;
	String tempType;

	public DecodeInput(String data) {
		this.input = new Input();
		this.data = data;
	}

	// Method to split " " space separated commands into array
	private String[] validateArguments(String input) throws WrongCommand {
		String[] inputArray = data.split(" ");
		tempType = inputArray[0];
		if (inputArray.length != 2) {
			throw new WrongCommand("Wrong no of arguments entered");
		}
		if (!tempType.equals("HOT") && !tempType.equals("COLD")) {
			throw new WrongCommand("Wrong temperature command entered ------> fail");
		}
		return inputArray;
	}

	// Method to split "," comma separated commands into array
	private String[] validateCommand(String input) throws WrongCommand {
		String[] command = input.split(",");
		if (tempType.equals("HOT")) {
			if (command.length > 6) {
				throw new WrongCommand("Wrong no of arguments entered");
			}
		}

		if (tempType.equals("COLD")) {
			if (command.length > 8) {
				throw new WrongCommand("Wrong no of arguments entered");
			}
		}

			for (int i = 0; i < command.length; i++) {
				String temp = command[i];
				int tempInt = Integer.parseInt(temp);
				if (tempInt > 9 || tempInt < 1) {
					throw new WrongCommand("Wrong command entered");
				}
			}
		return command;
	}

	// Method to fill the data transfer object for different commands using
	// switch case.

	private Input fillInDTO(String tempType, String[] commands) {
		this.input.setTempType(tempType);
		for (int i = 0; i < commands.length; i++) {
			int temp = Integer.parseInt(commands[i]);
			this.input.getCommands().add(temp);
			switch (temp) {
			case 1:
				this.input.setType1(new Type("Put on footwear", "sandals",
						"boots"));
				break;
			case 2:
				this.input.setType2(new Type("Put on headwear", "sun visor",
						"hat"));
				break;
			case 3:
				this.input.setType3(new Type("Put on socks", "fail", "socks"));
				break;
			case 4:
				this.input
						.setType4(new Type("Put on shirt", "t-shirt", "shirt"));
				break;
			case 5:
				this.input
						.setType5(new Type("Put on jacket", "fail", "jacket"));
				break;
			case 6:
				this.input
						.setType6(new Type("Put on pants", "shorts", "pants"));
				break;
			case 7:
				this.input.setType7(new Type("Leave house", "leaving house",
						"leaving house"));
				break;
			case 8:
				this.input.setType8(new Type("Take off pajamas",
						"Removing PJs", "Removing PJs"));
				break;
			}
		}
		return null;

	}

	public Input createDTO() throws WrongCommand {

		String[] inputArray = this.validateArguments(data);
		String[] command = this.validateCommand(inputArray[1]);
		this.fillInDTO(inputArray[0], command);

		return input;
	}

}
