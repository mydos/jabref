package net.sf.jabref.export.layout.format;

import junit.framework.TestCase;
import net.sf.jabref.export.layout.LayoutFormatter;
import net.sf.jabref.export.layout.format.AuthorLastFirst;

public class AuthorLastFirstTest extends TestCase {

	public void testFormat() {
		LayoutFormatter a = new AuthorLastFirst();

		// Empty case
		assertEquals("", a.format(""));

		// Single Names
		assertEquals("Someone, Van Something", a.format("Van Something Someone"));

		// Two names
		assertEquals("von Neumann, John and Black Brown, Peter", a
			.format("John von Neumann and Black Brown, Peter"));

		// Three names
		assertEquals("von Neumann, John and Smith, John and Black Brown, Peter", a
			.format("von Neumann, John and Smith, John and Black Brown, Peter"));

		assertEquals("von Neumann, John and Smith, John and Black Brown, Peter", a
			.format("John von Neumann and John Smith and Black Brown, Peter"));
	}

}
