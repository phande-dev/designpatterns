package factorydesignpattern;

public class ShapeFactory {
    public Shape getShapeType(String Shapetype) {
    	if(Shapetype == null) {
		return null;}
    	else if (Shapetype.equalsIgnoreCase("Rectangle"))
    		return new Rectangle();
    	else if (Shapetype.equalsIgnoreCase("Square"))
    		return new Square();
    	else if (Shapetype.equalsIgnoreCase("Circle"))
    		return new Circle();
    	return null;
    }
}
