public class Circle{
  private static double PI = 3.14;
  private double radius;
  
  
  public void setRadius(double radius){
    if (radius < 0) {
      System.out.println("Wrong input");
    } else {
      this.radius = radius;
    }
  }
  
  public void getRadius(){
    System.out.println(this.radius);
  }
  
  public void getPI(){
    System.out.println(this.PI);
  }
}