package cumulative.poetry.impl;

import java.util.ArrayList;
import java.util.List;

import cumulative.poetry.PoetI;
import cumulative.poetry.implementation.OnlyPoet;
import cumulative.poetry.implementation.SingerPoet;

public class Poetry {

	public static void main(String[] args) {
		PoetI poet;
		List<String> argsList = new ArrayList<String>();
		for (String arg : args) {
			argsList.add(arg);
		}
		try {
			if (argsList.contains("--echo")) {
				poet = new SingerPoet();
			} else {
				poet = new OnlyPoet();
			}
			if (argsList.contains("--reveal-for-day")) {
				int index = argsList.indexOf("--reveal-for-day");
				System.out.println(poet.recite(Integer.parseInt(args[index + 1])));
			} else if (argsList.contains("--recite")) {
				System.out.println(poet.reciteDayWise());
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
