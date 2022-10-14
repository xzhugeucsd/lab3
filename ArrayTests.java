import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseinThreeElementInPlace(){
    int[] intput1 = {1,2,3};
    ArrayExamples.reverseInPlace(intput1);
    assertArrayEquals(new int[]{3, 2, 1}, intput1);
  }

  @Test
  public void testReverseinThreeElement(){
    int[] intput1 = {1,2,3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(intput1));
  }
}
