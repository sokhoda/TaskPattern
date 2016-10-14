package abstractfactory;

public enum Color {
	YELLOW("������"), RED("��������"), BLACK("������"), WHITE("����"), BLUE(
			"����");

	public static final int ENUM_LENGTH = Color.values().length;
	private String colorUkr;

	private Color(String colorUkr) {
		this.colorUkr = colorUkr;
	}

	public String getColorUkr() {
		return colorUkr;
	}
}
