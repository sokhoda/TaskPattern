package composite;

public class Sentence extends TextPart {
	public Sentence(TextPart... parts) {
		append(parts);
	}

}
