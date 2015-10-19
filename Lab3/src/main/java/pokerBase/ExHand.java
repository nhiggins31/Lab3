package pokerBase;

public class ExHand extends Exception {
	public ExHand(Hand h1) {
		super("Top two hands are tied");
	}
}
