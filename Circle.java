public class Circle {
    private double radius;
    private double originX;
    private double originY;
    
    public Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }
    public Circle(double radius){
        this(radius, 0, 0);
    }
    public Circle(){
        this(1);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getOriginX(){
        return this.originX;
    }
    public void setOriginX(double originX){
        this.originX = originX;
    }
    public double getOriginY(){
        return this.originY;
    }
    public void setOriginY(double originY){
        this.originY = originY;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }
    public void move(double dx, double dy){
        this.originX += dx;
        this.originY += dy;
    }
    @Override
    public String toString(){
        return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
    }
    public void scale(double scale){
        this.radius *= scale;
    }
    public boolean isOverlappedWith(Circle c){
        double distX = this.originX - c.originX;
        double distY = this.originY - c.originY;
        double dist = distX*distX + distY*distY;
        return this.radius*this.radius + c.radius*c.radius <= dist;
    }
    public boolean isEnclosedBy(Circle c){
        double distX = this.originX - c.originX;
        double distY = this.originY - c.originY;
        double dist = distX*distX + distY*distY;
        return Math.sqrt(dist) < c.radius-this.radius;
    }
}
