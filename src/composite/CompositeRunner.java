package composite;

public class CompositeRunner {
	public static void main(String[] args) {
		//@formatter:off
		Sentence s1 = new Sentence(
				new Symbol('I'),
				new Symbol('\''),
				new Symbol('m'),
				new Symbol(' '),
				new Symbol('f'),
				new Symbol('i'),
				new Symbol('n'),
				new Symbol('e'),
				new Symbol('!')
				);

		System.out.println(s1.getValue());
		Sentence s2 = new Sentence(
				new Symbol('W'),
				new Symbol('e'),
				new Symbol('d'),
				new Symbol('n'),
				new Symbol('e'),
				new Symbol('s'),
				new Symbol('d'),
				new Symbol('a'),
				new Symbol('y'),
				new Symbol(','),
				new Symbol(' ')
				);

		//@formatter:on

		System.out.println("s1:" + s1.getSize() + ", s2:" + s2.getSize());
		Paragraph par = new Paragraph(s2, s1);
		System.out.println(par.getSize());

		Sentence s3 = new Sentence(s1);
		s3.append(par);
		// System.out.println(par.getValue());
		System.out.println(s3.getValue());

	}
}
