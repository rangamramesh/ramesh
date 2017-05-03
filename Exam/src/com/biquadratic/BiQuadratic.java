package com.biquadratic;

import com.quadratic.Pair;
import com.quadratic.Quadratic;

public class BiQuadratic {
	public quad solveBiQuadratic(double a, double b, double c) {

			Quadratic q =new Quadratic();
		    Pair p=q.solveQuadratic(a, b, c);
		    double t1=p.getX();
		    double t2=p.getY();
		    if(t1==Double.NaN & t2==Double.NaN){
		    	
		    }
			return new quad(Math.sqrt(t1), -Math.sqrt(t1),Math.sqrt(t2),-Math.sqrt(t2)) ;

		}
	}
