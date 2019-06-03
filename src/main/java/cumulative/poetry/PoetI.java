package cumulative.poetry;

public interface PoetI {
	String[] poetry = { "the horse and the hound and the horn that belonged to\n\t",
			"the farmer sowing his corn that kept\n\t", "the rooster that crowed in the morn that woke\n\t",
			"the priest all shaven and shorn that married\n\t", "the man all tattered and torn that kissed\n\t",
			"the maiden all forlorn that milked\n\t", "that cow with the crumpled horn that tossed\n\t",
			"the dog that worried\n\t", "the cat that killed\n\t", "the rat that ate\n\t", "the malth that lay in\n\t",
			"the house that Jack built.\n\t" };
	String prefix = "This is ";

	public String recite(int day);

	public default String reciteDayWise() {
		StringBuilder song = new StringBuilder();
		for(int i=1;i<=12;i++) {
			song.append("Day "+i+" -\n");
			song.append(recite(i)+"\n");
		}
		return song.toString();
	}
}
