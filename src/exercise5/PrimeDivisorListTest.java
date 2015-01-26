package exercise5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeDivisorListTest {
	PrimeDivisorList list;
	
	@Before
	public void build(){
		list = new PrimeDivisorListImpl();
	}
	
	@Test
	public void addNull() {
		list.add(null);
	}
	
	@Test
	public void addNonPrime() {
		list.add(new Integer(8));
	}
	
	@Test
	public void toStringTest() {
		list.add(7);
		list.add(7);
		list.add(11);
		assertEquals("[ 7^2 * 11 = 539 ]", list.toString());
	}

}
