package tudelft.caesarshift;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
	private CaesarShiftCipher csc;
	@BeforeEach
	public void initialize () {
		csc = new CaesarShiftCipher();
	}
	@Test
	public void uneLettre () {
		String result = csc.caesarShiftCipher("a", 3);
		assertEquals("d", result);
	}
	@Test
	public void unMot () {
		String result = csc.caesarShiftCipher("abc", 2);
		assertEquals("cde", result);
	}
	@Test
	public void mauvaisCaractere () {
		String result = csc.caesarShiftCipher("bépo", 2);
		assertEquals("invalid", result);
	}
	@Test
	public void retourPremierCaractere () {
		String result = csc.caesarShiftCipher("z", 1);
		assertEquals("a", result);
	}
	@Test
	public void space() {
		String result = csc.caesarShiftCipher("a b", 26);
		assertEquals("a b", result);
	}
}
