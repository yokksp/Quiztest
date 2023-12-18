import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuizOneJunitTest {
public QuizOneJunit obj;	
	@Before
	public void init() {
		obj = new QuizOneJunit();
	}
	@Test
	public void test01() {
		assertEquals(1, obj.countLetterA("ABCD"));
	}	
	
	
	@Test
	public void test02() {
		assertEquals(1, obj.countLetterA("ACBD"));
	}	
	@Test
	public void test03() {
		assertEquals(1, obj.countLetterA("aBCD"));
	}	
	@Test
	public void test04() {
		assertEquals(4, obj.countLetterA("AAAA"));
	}	
	@Test
	public void test05() {
		assertEquals(2, obj.countLetterA("AABC"));
	}	

}
