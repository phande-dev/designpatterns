package factorydesignpattern;

public class Mainclass {
	public static void main(String[] args) {	
   ShapeFactory shape = new ShapeFactory();
   Shape sh1=shape.getShapeType("Circle");
   sh1.getShape();
     
	}
}
