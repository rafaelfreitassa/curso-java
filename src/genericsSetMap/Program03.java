package genericsSetMap;

import java.util.ArrayList;
import java.util.List;

import entities.Circle1;
import entities.Rectangle3;
import entities.Shape;
import entities.Shape1;

public class Program03 {

	public static void main(String[] args) {
		
		List<Shape1> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle3(3.0, 2.0));
		myShapes.add(new Circle1(2.0));
		
		List<Circle1> myCircles = new ArrayList<>();
		myCircles.add(new Circle1(2.0));
		myCircles.add(new Circle1(3.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		
		System.out.println("Total area: " + totalArea(myCircles));

	}
	
	public static double totalArea(List<? extends Shape1> list) {
		double sum = 0.0;
		for (Shape1 s : list) {
			sum += s.area();
		}
		return sum;
	}

}
