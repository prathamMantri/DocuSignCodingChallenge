
import java.util.ArrayList;
import java.util.List;

public class Input {
	//Input class which takes type as a class variable of Type class and sets the object with values.
	private String tempType;
	private List<Integer> commands;
	private Type type1;
	private Type type2;
	private Type type3;
	private Type type4;
	private Type type5;
	private Type type6;
	private Type type7;
	private Type type8;
	
	public Input()
	{
		commands=new ArrayList<Integer>();
	}
	
	public String getTempType() {
		return tempType;
	}

	public void setTempType(String tempType) {
		this.tempType = tempType;
	}

	public Type getType1() {
		return type1;
	}

	public void setType1(Type type1) {
		this.type1=type1;
	}

	public Type getType2() {
		return type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}

	public Type getType3() {
		return type3;
	}

	public void setType3(Type type3) {
		this.type3 = type3;
	}

	public Type getType4() {
		return type4;
	}

	public void setType4(Type type4) {
		this.type4 = type4;
	}

	public Type getType5() {
		return type5;
	}

	public void setType5(Type type5) {
		this.type5 = type5;
	}

	public Type getType6() {
		return type6;
	}

	public void setType6(Type type6) {
		this.type6 = type6;
	}

	public Type getType7() {
		return type7;
	}

	public void setType7(Type type7) {
		this.type7 = type7;
	}

	public Type getType8() {
		return type8;
	}

	public void setType8(Type type8) {
		this.type8 = type8;
	}
	
	public List<Integer> getCommands() {
		return commands;
	}

	public void setCommands(List<Integer> commands) {
		this.commands = commands;
	}
	
	public String toString()
	{
		return this.tempType+" "+this.type1+this.type2+this.type3+this.type4+this.type5+this.type6+this.type7+this.type8;
	}

}
