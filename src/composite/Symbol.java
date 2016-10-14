package composite;

public class Symbol extends TextPart {
	private char value;

	public Symbol(char value) {
		this.value = value;
	}

	@Override
	public void append(TextPart... parts) {
		throw new UnsupportedOperationException();
	};

	@Override
	public String getValue() {
		return String.valueOf(value);
	}
}
