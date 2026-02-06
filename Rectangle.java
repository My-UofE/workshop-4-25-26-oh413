// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }
  public Rectangle(double width, double height){
    this(width, height, 0, 0);
  }
  public Rectangle(){
    this(1, 1);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  public void scale(double scaleX, double scaleY){
    this.width = width * scaleX;
    this.height = height * scaleY;
  }
  public void scale(double scale){
    this.scale(scale, scale);
  }

  public boolean isOverlappedWith(Rectangle r){
    if ((this.originX > r.originX + r.width) || (r.originX > this.originX + this.width)){
      return false;
    }
    return !((this.originY > r.originY + r.height) || (r.originY > this.originY + this.height));
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith((r2));
  }

  public double calcRatio(){
    return (this.width/this.height);
  }

  public boolean isSquare(){
    return (this.width - 0.000001 <= this.height && this.height <= this.width + 0.000001);
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
}
