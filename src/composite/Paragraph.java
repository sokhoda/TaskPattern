package composite;

public class Paragraph extends TextPart {

	public Paragraph(TextPart... parts) {
		super.append(parts);
	}

	@Override
	public String getValue() {
		return "	" + super.getValue() + "\n\n";
	}
}
