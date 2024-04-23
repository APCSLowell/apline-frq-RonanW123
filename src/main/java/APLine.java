public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int x, int y, int z){
    a = x;
    b = y;
    c = z;
  }
  public double getSlope(){
    return (double) (-1 * a)/b;
  }
  public boolean isOnLine(int i, int j){
    if((a * i) + (b * j) + c == 0)
      return true;
    return false;
  }
}
