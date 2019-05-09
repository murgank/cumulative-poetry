package cumulative.poetry.impl;

import cumulative.poetry.Poet;

public class PoetImpl {

	public static void main(String[] args) {
		Poet poet;
		try {
			if (args[0].equals("--reveal-for-day")) {
				poet = new Poet();
				System.out.println(poet.recite(Integer.parseInt(args[1])));
			} else if (args[0].equals("--recite")) {
				for (int i = 1; i <= 12; i++) {
					poet = new Poet();
					System.out.println("Day " + i + " -");
					System.out.println(poet.recite(i));
					System.out.println("");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide command line args");
		} catch (NumberFormatException e) {
			System.out.println("Number invalid");
		} catch (Exception e){
			System.out.println("Genral Exception encountered");
		}
	}
}
