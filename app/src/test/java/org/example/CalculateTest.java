package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @test
  public void testaverage(){
    Calculate calculate2 = new Calculate();
    double expected = 10;
    assertEquals(expected, calculate.average(10, 30));
  }
  @test
  public void testToSum(){
    Calculate calculate2 = new Calculate();
    double expected = 6;
    assertEquals(expected, calculate.ToSum(1, 3));
  }
  @test
  public void test ToSumAverage(){
    Calculate calculate2 = new Calculate();
    double expected = 3;
    assertEquals(expected, calculate.ToSumAverage(1, 3));
  }

}
