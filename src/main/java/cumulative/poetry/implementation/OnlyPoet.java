package cumulative.poetry.implementation;

import cumulative.poetry.PoetI;

public class OnlyPoet implements PoetI {

	public String recite(int day) {
		StringBuilder poemStory = new StringBuilder();
		poemStory.append(prefix);
		for (int i = (poetry.length - day); i < poetry.length; i++) {
			poemStory.append(poetry[i]);
		}
		return poemStory.toString();
	}
}
