package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(double x, double y) {
    return x + y / 2.0;

  }

  public int sum2(int x, int y) {
    int sum = 0;
    for (int i = x; x < y; x++) {
      sum += i;
    }
    return sum;
  }

  public int sum3(int x, int y) {
    int sumo = 0;
    int sume = 0;
    for (int i = x; x < y; x++) {
      if(i%2==1){
        sumo += i;
      }
    }
    return sumo;
  }
}
