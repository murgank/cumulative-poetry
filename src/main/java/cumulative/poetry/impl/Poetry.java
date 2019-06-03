package cumulative.poetry.impl;

import java.util.ArrayList;
import java.util.Arrays;

import cumulative.poetry.PoetI;
import cumulative.poetry.factory.PoetFactory;
import cumulative.poetry.utilities.CommandLineArgsParser;

public class Poetry {

	public static void main(String[] args) {
		PoetI poet;
		CommandLineArgsParser parser = new CommandLineArgsParser(new ArrayList<String>(Arrays.asList(args)));
		try {
			poet = PoetFactory.createPoet(parser.toEcho());
			if (parser.dayToRecite() != -1) {
				System.out.println(poet.recite(parser.dayToRecite()));
			} else if (parser.recite()) {
				System.out.println(poet.reciteDayWise());
			}
		} catch (NumberFormatException e) {
			System.out.println("Number invalid");
		} catch (Exception e) {
			System.out.println("Genral Exception encountered");
		}
	}
}
