package ShapesStuff;

import java.util.ArrayList;

class Tester {

    public static void main(String[] args){

        ArrayList<Shapes> shapes = new ArrayList<Shapes>();

        Circle bigCircle = new Circle(100);
        Circle mediumCircle = new Circle(10);
        Circle smallCircle = new Circle(1);
        
        Rectangle bigRectangle = new Rectangle(100, 100);
        Rectangle mediumRectangle = new Rectangle(10, 10);
        Rectangle smallRectangle = new Rectangle(1, 1);

        shapes.add(bigCircle);
        shapes.add(mediumCircle);
        shapes.add(smallCircle);
        shapes.add(bigRectangle);
        shapes.add(mediumRectangle);
        shapes.add(smallRectangle);

        System.out.println(largestShape(shapes));

    }


    public static Shapes largestShape(ArrayList<Shapes> List){
        
        int largestArea = 0;
        Shapes largestShape = new Circle(0d);        
        
        for(int i = 0; i < List.size(); i++) {
            
            int currentArea = List.get(0).compareShapes(List.get(i));

            if(currentArea > largestArea){
                largestArea = currentArea;
                largestShape = List.get(i);
            };                           
        
        }

        return largestShape;

    }

}