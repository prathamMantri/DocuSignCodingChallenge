import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Exception.LeavingHouseNoProperCloths;
import Exception.NoJacketWhenHot;
import Exception.NoPajamaOff;
import Exception.NoShooesBeforePants;
import Exception.NoShooesBeforeSocks;
import Exception.NoSocksWhenHot;
import Exception.RepeatCommands;
import Exception.ShirtBeforeHeadwearOrJacket;

//This is validation class which will validate the input according to given criteria

public class Validation {

	public void tempTypeCommandValidation(List<Integer> inputList,
			String tempType) throws NoSocksWhenHot, NoJacketWhenHot,
			LeavingHouseNoProperCloths, ShirtBeforeHeadwearOrJacket,
			NoShooesBeforeSocks {
		
		if (tempType.equals("HOT")) { // Validation if Hot command is issued
			
			if (inputList.size() < 6) {
				throw new LeavingHouseNoProperCloths("No Proper Cloths ---->fail"); //All clothes must be put on before leaving
			}
			if (inputList.contains(3)) {
				throw new NoSocksWhenHot("No Socks When Hot ---->fail"); //Can not wear socks in Hot Temperature
			}
			if (inputList.contains(5)) {
				throw new NoJacketWhenHot("No Jacket When Hot ---->fail"); //Can not wear Jacket in Hot Temperature
			}
			
		} else if (tempType.equals("COLD")) {
			if (inputList.size() < 8) {
				throw new LeavingHouseNoProperCloths("No Proper Cloths ---->fail");//All clothes must be put on before leaving
			}
			if (inputList.indexOf(4) > inputList.indexOf(5)) {
				throw new ShirtBeforeHeadwearOrJacket("No Jacket Before Shirt ---->fail"); // Shirt must be wore before putting jacket on
			}
			if (inputList.indexOf(3) > inputList.indexOf(1)) {
				throw new NoShooesBeforeSocks("No Footwear Before Socks ---->fail"); //Socks must be wore before putting footwear
			}
		}
	}

	public void pajamaNotRemoved(List<Integer> inputList) throws NoPajamaOff {
		if (inputList.indexOf(8) != 0) {
			throw new NoPajamaOff("Pajamas Not Removed ---->fail"); //Before putting anything on Pajama must be removed
		}
	}

	public void noShooesBeforePants(List<Integer> inputList)
			throws NoShooesBeforePants {
		if (inputList.indexOf(6) > inputList.indexOf(1)) {
			throw new NoShooesBeforePants("No Footwear Before Pants ---->fail"); //Pants must be wore before putting footwear
		}
	}

	public void noShirtBeforeHeadwear(List<Integer> inputList)
			throws ShirtBeforeHeadwearOrJacket {
		if (inputList.indexOf(4) > inputList.indexOf(2)) {
			throw new ShirtBeforeHeadwearOrJacket("Shirt Before Headwear ---->fail"); // Shirt must be wore before Headwear
		}
	}

	public void leaveWithoutProperCloaths(List<Integer> inputList)
			throws LeavingHouseNoProperCloths {
		if (inputList.indexOf(7) != inputList.size() - 1) {
			throw new LeavingHouseNoProperCloths("Leaving House with No Proper Cloths ---->fail"); //Can not leave house without wearing proper cloths. Leaving house should be last command
		}
	}

	public void repeatCommands(List<Integer> inputList) throws RepeatCommands {
		Set inputSet = new HashSet(inputList);
		if (inputSet.size() < inputList.size()) {
			throw new RepeatCommands("One of the command is repeated ---->fail"); // Can not wear/put same cloth again
		}
	}
	
	
//Calling all these functions for validating the input
	public boolean validateInput(Input input) throws NoSocksWhenHot,
			NoJacketWhenHot, NoShooesBeforeSocks, NoShooesBeforePants,
			ShirtBeforeHeadwearOrJacket, LeavingHouseNoProperCloths,
			NoPajamaOff, RepeatCommands {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList = input.getCommands();
		String tempType = input.getTempType();
		this.pajamaNotRemoved(inputList);
		this.repeatCommands(inputList);
		this.tempTypeCommandValidation(inputList, tempType);
		this.repeatCommands(inputList);
		this.noShooesBeforePants(inputList);
		this.noShirtBeforeHeadwear(inputList);
		this.leaveWithoutProperCloaths(inputList);
		return true;
	}

}
