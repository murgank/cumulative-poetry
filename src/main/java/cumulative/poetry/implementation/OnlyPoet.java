package cumulative.poetry.implementation;

import cumulative.poetry.PoetI;

public class OnlyPoet implements PoetI {

	public String reciteInside(int line) {
		return poetry[line];
	}
}
