package cumulative.poetry.implementation;

import cumulative.poetry.PoetI;

public class SingerPoet implements PoetI {

	public String recite(int day) {
		StringBuilder poemStory = new StringBuilder();
		poemStory.append(prefix);
		for (int i = (12 - day); i < poetry.length; i++) {
			poemStory.append(poetry[i]);
			poemStory.append(poetry[i]);
		}
		return poemStory.toString();
	}
}
