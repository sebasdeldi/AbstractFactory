package implementation;

import colors.Color;
import shapes.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shape);
	public abstract Color getColor(String color);
}
