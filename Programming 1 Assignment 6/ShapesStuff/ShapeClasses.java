package ShapesStuff;

interface ShapesRelate {   
   //Any object which implements the interface ShapesRelate is now a valid parameter for compareShapes()
    int compareShapes(ShapesRelate shapeB);
}

abstract class Shapes implements ShapesRelate{
    
    //Can be accessed by subclasses
    protected double area;
    
    //Shapes has a constructor so that it can be used by non-abstract classes extending it
    Shapes() {
        this.area = 0;
    }
    
    //Any shape has this method
    public double getArea(){
        return this.area;
    }
    
    //Calculate area is implemented differently for each different subclass
    abstract public void calculateArea();
    
    //compareShapes() is called by one shape and passed another shape as a parameter
    public int compareShapes(ShapesRelate shapeB){
       
        Shapes shape = ((Shapes) shapeB); 
        shape.calculateArea();

        if(this.area > shape.area){
            return (int) this.area;
        } else if(this.area < shape.area || this.area == shape.area) {
            return (int) shape.area;
        } else{
            return 0;
        }
    
    }

}

class Circle extends Shapes {
    
    private double radius;
    private double pi = Math.PI;
    
    Circle() {
        super();
    }
    
    Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void calculateArea(){
        this.area = this.pi * (radius * radius);
    }
    
    @Override
    public String toString(){
        return "Circle Radius: " + this.radius + " Area: " + this.area;
    }

    public int compareShapes(ShapesRelate shapeB) {
        return super.compareShapes(shapeB);
    }

}



class Rectangle extends Shapes {
    
    protected double length;
    protected double width;
    
    Rectangle(){
        super();
    }
    
    Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    @Override
    public String toString() {
        return "Rectangle Width: " + this.width + "Length " + this.length;
    }
    
    public void calculateArea() {
        this.area = length*width;
    }

    public int compareShapes(ShapesRelate shapeB) {
        return super.compareShapes(shapeB);
    }

}