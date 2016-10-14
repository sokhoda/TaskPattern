package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class TextPart {
	protected List<TextPart> value = new ArrayList<>();

	public String getValue() {
		StringBuffer sb = new StringBuffer();
		for (TextPart element : value) {
			sb.append(element.getValue());
		}
		return sb.toString();
	}

	public void append(TextPart... elements) {
		for (TextPart elem : elements) {
			value.add(elem);
		}
	}

	public int getSize() {
		return value.size();
	}
}
