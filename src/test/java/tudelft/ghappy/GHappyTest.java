package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
	private GHappy gh = new GHappy();
	@BeforeEach
	public void initialize () {
		gh = new GHappy();
	}
	@Test
	public void justHappyG () {
		boolean result = gh.gHappy("gg");
		assertTrue(result);
	}
	@Test
	public void happyGWithOtherLetter () {
		boolean result = gh.gHappy("auieggx�");
		assertTrue(result);
	}
	@Test
	public void happyGWithOneNoHappyG () {
		boolean result = gh.gHappy("auieggx�g");
		assertFalse(result);
	}
	@Test
	public void noHappyG () {
		boolean result = gh.gHappy("auiep�eg");
		assertFalse(result);
	}
}
