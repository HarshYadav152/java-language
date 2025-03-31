class SR{
    float sideSquare;
    float sideRectangleLength;
    float sideRectangleBreadth;

    float areaSquare;
    float areaRectangle;
    float perimeterRectangle;
    float perimeterSquare;

    public void setDimensionSquare(float side){
        sideSquare = side;
    }
    public void setDimensionRectangle(float length,float breadth){
        sideRectangleLength = length;
        sideRectangleBreadth = breadth;
    }

    public void calculateAreaAndPerimeterOfSquare(){
        areaSquare = sideSquare*sideSquare;
        perimeterSquare = 4*sideSquare;
    }
    public void calculateAreaAndPerimeterOfRectangle(){
        areaRectangle = sideRectangleLength*sideRectangleBreadth;
        perimeterRectangle = 2*(sideRectangleLength+sideRectangleBreadth);
    }

    public void showDetails(){
        calculateAreaAndPerimeterOfSquare();
        calculateAreaAndPerimeterOfRectangle();
        System.out.println("Area of square of side "+sideSquare+"is "+areaSquare);
        System.out.println("Perimeter of square of side "+sideSquare+"is "+perimeterSquare);
        System.out.println("Area of rectangle of side length = "+sideRectangleLength +" and breadth = "+ sideRectangleBreadth +" is "+areaRectangle);
        System.out.println("Perimeter of rectangle of side length = "+sideRectangleLength +" and breadth = "+ sideRectangleBreadth+" is "+perimeterRectangle);
    }
}

class Circle{
    float radius;
    double area;

    public void setRadius(float r){
        radius = r;
        area = 3.14 * radius * radius;
        System.out.println("Circle area with radius "+r+" is "+area);
    }

}
public class Practice_set_08 {
    public static void main(String[] args) {
        SR object = new SR();

        // setting Dimensions
        object.setDimensionSquare(4);
        object.setDimensionRectangle(4,2);

        // calculatiog and then show
        object.showDetails();

        Circle obj = new Circle();
        obj.setRadius(1);
    }
}
