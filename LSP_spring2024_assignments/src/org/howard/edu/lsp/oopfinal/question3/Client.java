package org.howard.edu.lsp.oopfinal.question3;

public class Client {
	 public static void main(String[] args) {
	     Shape circle = ShapeFactory.createShape("circle");
	     circle.draw();

	     Shape rectangle = ShapeFactory.createShape("rectangle");
	     rectangle.draw();
	 }
}