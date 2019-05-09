package cumulative.poetry.impl;

import java.util.ArrayList;
import java.util.List;

import cumulative.poetry.Poet;

public class PoetImpl {

	public static void main(String[] args) {
		Poet poet;
		boolean echoFlag = false;
		List<String> argsList = new ArrayList<String>();
		for (String arg : args) {
			argsList.add(arg);
		}
		try {
			if (argsList.contains("--echo")) {
				echoFlag = true;
			}
			if (argsList.contains("--reveal-for-day")) {
				poet = new Poet();
				int index = argsList.indexOf("--reveal-for-day");
				if (echoFlag) {
					System.out.println(poet.echoRecite(Integer.parseInt(args[index + 1])));
				} else {
					System.out.println(poet.recite(Integer.parseInt(args[index + 1])));
				}
			} else if (argsList.contains("--recite")) {
				for (int i = 1; i <= 12; i++) {
					poet = new Poet();
					System.out.println("Day " + i + " -");
					if (echoFlag) {
						System.out.println(poet.echoRecite(i));
					} else {
						System.out.println(poet.recite(i));
					}
					System.out.println("");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide command line args");
		} catch (NumberFormatException e) {
			System.out.println("Number invalid");
		} catch (Exception e) {
			System.out.println("Genral Exception encountered");
		}
	}
}
