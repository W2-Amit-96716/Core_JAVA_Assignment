package com.app.geometry;

public class Point2D {
	double x;
	double y;
	
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public String getDetails() {
		return "Point x: " + x +"Point Y: "+y;
	}
	
	public boolean isEqual(Point2D second) {
		if(this.x == second.x && this.y == second.y) {
			return true;
		} 
		return false;
			
	}
	
	public double calculateDistance(Point2D second) {
		double distancex = this.x -second.x;
		double distancey = this.y -second.y;
		
		return Math.sqrt((distancex * distancex)+ (distancey * distancey)); 
	}
}
