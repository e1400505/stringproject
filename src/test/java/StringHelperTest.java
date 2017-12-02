import static org.junit.Assert.*;
import help.StringHelper;

import org.junit.Before;
import org.junit.Test;


public class StringHelperTest {
	StringHelper helper;
	
	@Before
	public void before(){
		helper = new StringHelper();
	}
	
	@Test
	public void truncateAInFirst2Positions_test_AAbcd(){
		
		//vanha tapa System.out.println(result);
		assertEquals("bcd", helper.truncateAInFirst2Positions("AAbcd"));
	}
	@Test
	public void truncateAInFirst2Positions_test_AA(){
		
		assertEquals("aa", helper.truncateAInFirst2Positions("AA"));
	}
	@Test
	public void truncateAInFirst2Positions_test_A(){
		
		assertEquals("B", helper.truncateAInFirst2Positions("A"));
	}
	@Test
	public void truncateAInFirst2Positions_test_empty(){
		
		assertEquals("a", helper.truncateAInFirst2Positions(""));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_test_ABcdeAB(){
		
		assertEquals(true, helper.truncateAInFirst2Positions("ABcdeAB"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_test_SaippuakauppiaS(){
		
		assertEquals("false", helper.truncateAInFirst2Positions("Saippuakauppias"));
	}
	@Test
	public void areFirstAndLastTwoCharactersTheSame_test_Saippuakauppisa(){
		
		assertEquals("false", helper.truncateAInFirst2Positions("Saippuakauppisa"));
	}
}
	
	
	
