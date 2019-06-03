package cumulative.poetry.factory;

import cumulative.poetry.PoetI;
import cumulative.poetry.implementation.OnlyPoet;
import cumulative.poetry.implementation.SingerPoet;

public class PoetFactory {
	public static PoetI createPoet(boolean singer) {
		return singer?new SingerPoet():new OnlyPoet();
	}
}
