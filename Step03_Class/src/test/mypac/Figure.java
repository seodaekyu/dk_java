package test.mypac;

public class Figure {
	
	public int side;
	
	
	////////////////////////////////////
	public boolean isTriangle() {
		if(side == 3) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public boolean isSquare() {
		if(side == 4) {
			return true;
		}else {
			return false;
		}
		
	}
	////////////////////////////////////
	
	public int sumInternalAngle() {
		if(side == 3) {
			return 180;
		}else if(side == 4) {
			return 360;
		}else
			System.out.println("error");
			return 0;	
	}
		
}
