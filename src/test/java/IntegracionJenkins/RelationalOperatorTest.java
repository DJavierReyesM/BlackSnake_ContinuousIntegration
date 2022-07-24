package IntegracionJenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class RelationalOperatorTest {

	@Test
	public void isGreaterTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 3));
	}
	
	@Test
	public void isGreaterTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isGreater(2, 1));	
	}
	
	@Test
	public void isGreaterTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isGreater(2, 2));	
	}

	@Test
	public void isLessTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(4, 4));
	}
	
	@Test
	public void isLessTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.isLess(5, 1));
	}
	
	@Test
	public void isLessTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.isLess(1, 5));
	}
	
	@Test
	public void goodHeightTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodHeight(12, 2, 13));
	}
	
	@Test
	public void goodHeightTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodHeight(1, 2, 13));
	}
	
	@Test
	public void goodHeightTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodHeight(14, 2, 13));
	}
	
	@Test
	public void goodWidthTest1() {
		RelationalOperator tester = new RelationalOperator();
		assertTrue(tester.goodWidth(10, 2, 12));
	}
	
	@Test
	public void goodWidthTest2() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodWidth(1, 2, 12));
	}
	
	@Test
	public void goodWidthTest3() {
		RelationalOperator tester = new RelationalOperator();
		assertFalse(tester.goodWidth(14, 2, 12));
	}
}
