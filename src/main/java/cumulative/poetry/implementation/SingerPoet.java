package cumulative.poetry.implementation;

import cumulative.poetry.PoetI;

public class SingerPoet implements PoetI {

	public String reciteInside(int line) {
		return poetry[line]+poetry[line];
	}
}
