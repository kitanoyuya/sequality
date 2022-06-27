package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2,3 ), 0.01);
  }

  @Test
  public void testSum2() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sum2(1, 10));
  }
}
