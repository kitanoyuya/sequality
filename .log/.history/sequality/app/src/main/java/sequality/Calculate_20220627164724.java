package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(double x) {

    return x / 2.0;

  }

  public int sum2(int x, int y) {
    int sum = 0;
    for (int i = x; x <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sum3(int x, int y) {
    int sumo = 0;
    for (int i = x; x <= y; i++) {
      if (i % 2 == 1) {
        sumo += i;
      }
    }
    return sumo;
  }

  public int sum4(int x, int y) {
    int sumo = 0;
    for (int i = x; x <= y; x++) {
      if (i % 2 == 0) {
        sumo += i;
      }
    }
    return sumo;
  }

}
