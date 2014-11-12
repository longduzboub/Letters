package letters.letters;

import letters.Inhabitant;

public class UrgentLetter<T extends Letter<?>> extends DecoratorLetter<T> {
	
	public UrgentLetter(Inhabitant sender, Inhabitant receiver, T content) {
		super(sender, receiver, content);
	}

	@Override
	public void action() {
		this.content.action();
	}

	@Override
	public double cout() {
		return 2 * this.content.cout();
	}

	@Override
	public String toString() {
		return "an urgent letter whose content is "+this.content;
	}

}
