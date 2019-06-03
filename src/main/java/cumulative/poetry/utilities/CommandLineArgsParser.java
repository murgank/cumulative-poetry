package cumulative.poetry.utilities;

import java.util.ArrayList;

public class CommandLineArgsParser {
	private ArrayList<String> inputArgs;

	public CommandLineArgsParser(ArrayList<String> inputArgs) {
		this.inputArgs = inputArgs;
	}

	public boolean toEcho() {
		if (inputArgs.contains("--echo"))
			return true;
		return false;
	}
	
	public int dayToRecite() throws NumberFormatException{
		return inputArgs.contains("--reveal-for-day")?Integer.parseInt(inputArgs.get(inputArgs.indexOf("--reveal-for-day")+1)):-1;
	}
	
	public boolean recite() {
		return inputArgs.contains("--recite");
	}
}
