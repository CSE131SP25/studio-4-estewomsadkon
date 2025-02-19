package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(227, 89, 25); //orange
		StdDraw.filledRectangle(0, 0, 1, 0.25);
		
		StdDraw.setPenColor(235, 169, 208); //pink
		StdDraw.filledRectangle(0.25, 0.5, 1, 0.25);
		
		StdDraw.setPenColor(90, 232, 192); //teal
		StdDraw.filledRectangle(0.5, 0.75, 1, 0.25);
		
		StdDraw.setPenColor(23, 13, 166); //blue
		StdDraw.filledRectangle(1, 1, 1, 0.25);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.line(0.5, 0.4, 0.5, 0.55); //body
		
		StdDraw.circle(0.5, 0.6, 0.05); //head
		StdDraw.line(0.5, 0.5, 0.6, 0.55);
		StdDraw.line(0.5, 0.5, 0.4, 0.55);
		StdDraw.line(0.5, 0.4, 0.6, 0.35);
		StdDraw.line(0.5, 0.4, 0.4, 0.35);
		
		
	}
}