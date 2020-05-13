import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiorentinoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCognomeMet1() {
		FiorentinoClass f=new FiorentinoClass();
		assertEquals(2187, f.cognomeMet(3, 7));
	}
	@Test
	void testCognomeMet2() {
		FiorentinoClass f=new FiorentinoClass();
		assertEquals(0, f.cognomeMet(0, 1));
	}
	@Test
	void testCognomeMet3() {
		FiorentinoClass f=new FiorentinoClass();
		assertEquals(1, f.cognomeMet(0, 0));
	}

}
