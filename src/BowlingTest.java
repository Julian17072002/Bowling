

public class BowlingTest {

	private BowlingMain i;
	
	
	void rollMany(int n, int pins, BowlingMain g) {
		for (int i = 0; i < n; i++) g.roll(pins);
	}


	public void setUp() {
		this.i = new BowlingMain();
	}

	
	public void testZero() {
		rollMany(20, 0, i);
		assertEquals(0, i.score());
	}

	public void testAllOnes() {
		rollMany(20, 1, i);
		assertEquals(20, i.score());
	}

	public void testOneSpare() {
		i.roll(5);
		i.roll(5);
		i.roll(3);
		rollMany(17, 0, i);
		assertEquals(16, i.score());
	}

	public void testOneStrike() {
		i.roll(10);
		i.roll(3);
		i.roll(4);
		rollMany(16, 0, i);
		assertEquals(24, i.score());
	}

	public void testPerfectGame() {
		rollMany(12, 10, i);
		assertEquals(300, i.score());
	}


	private void assertEquals(int j, int score) {
		
	}
} 