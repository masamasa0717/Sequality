package org.example;

public class Calculate {
  public int sum(int x, int y){
    return (x + y);
  }

  public int ToSum(int x, int y){
    return (x + y) * y / 2;
  }

  public double average(int x, int y){
    int count = y - x + 1;
    return (double)(x + y) / count;
  }

  public double ToSumAverage(int x, int y){
    int count = y - x + 1;
    return (double)(x + y) * (y / 2) / count;
  }

  public int odd(int x, int y){
    int odd = 0;
    for(int a = x; a <= y; a ++){
      if(a % 2 == 1){
        odd += a;
      }
    }
    return odd;
  }

  public int even(int x, int y){
    int even = 0;
    for(int a = x; a <= y; a ++){
      if(a % 2 == 0){
        even += a;
      }
    }
    return even;
  }
}
