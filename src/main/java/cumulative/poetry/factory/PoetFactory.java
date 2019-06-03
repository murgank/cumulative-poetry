package cumulative.poetry.factory;

import cumulative.poetry.PoetI;
import cumulative.poetry.variousPoets.OnlyPoet;
import cumulative.poetry.variousPoets.SingerPoet;

public class PoetFactory {
	public static PoetI createPoet(boolean singer) {
		return singer?new SingerPoet():new OnlyPoet();
	}
}
