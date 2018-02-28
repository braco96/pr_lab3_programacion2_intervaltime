package IntervalTime;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;





/**
 * @author Julio García
 *
 */

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		      String[] ids = ManagementFactory.getRuntimeMXBean().getName()
			  .split("@");
		      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
		      bw.write(ids[0]);
		      bw.close();
		} catch (Exception e) {
		    System.out.println("Avisa al profesor de fallo sacando el PID");
		}

		
	    try {	
	    	
		{
			Time t1 = new TimeSec(10);
			Time t2 = new TimeSec(20);
			Time t3 = new TimeSec(30);
			Time t4 = new TimeSec(40);
			Time t5 = new TimeSec(50);
			Time t6 = new TimeSec(60);
			Time t7 = new TimeSec(70);
			Time t8 = new TimeSec(80);
			Time t9 = new TimeSec(90);
			Time t10 = new TimeSec(100);
			
			IntervalTime i12 = new IntervalTime (t1,t2);
			IntervalTime i23 = new IntervalTime (t2,t3);
			IntervalTime i25 = new IntervalTime (t2,t5);
			IntervalTime i34 = new IntervalTime (t3,t4);
			IntervalTime i45 = new IntervalTime (t4,t5);
			IntervalTime i57 = new IntervalTime (t5,t7);			
			IntervalTime i59 = new IntervalTime (t5,t9);	
			IntervalTime i67 = new IntervalTime (t5,t9);	
			IntervalTime i9 = new IntervalTime (t9,t9);	
			IntervalTime i13 = new IntervalTime (t1,t3);
			IntervalTime i15 = new IntervalTime (t1,t5);
			IntervalTime i17 = new IntervalTime (t1,t7);
			
						
			IntervalTime [] arr1 = {i12,i23,i34};
			IntervalTime [] arr2 = {};
			IntervalTime [] arr3 = {i12,i34};
			IntervalTime [] arr4 = {i12,i23};
			IntervalTime [] arr5 = {i12,i34,i57};
			IntervalTime [] arr6 = {i12,i25,i57,i9};
			IntervalTime [] arr7 = {i12,i13,i15,i17};
			IntervalTime [] arr8 = {i57,i59};
			IntervalTime [] arr9 = {i45,i59};
			
			
			

			
			
			
			do_check("posInArray()",i12,arr1,new Integer(i12.posInArray(arr1)),new Integer(0));			
			do_check("posInArray()",i12,arr2,new Integer(i12.posInArray(arr2)),new Integer(-1));			
                        //			do_check("posInArray()",i17,arr7,new Integer(i17.posInArray(arr7)),new Integer(3));			
			do_check("posInArray()",i9,arr6,new Integer(i9.posInArray(arr6)),new Integer(3));			
			do_check("posInArray()",i12,arr2,new Integer(i12.posInArray(arr2)),new Integer(-1));			
			do_check("posInArray()",i45,arr9,new Integer(i45.posInArray(arr9)),new Integer(0));			

			do_check("isInArray()",i12,arr1,new Boolean (i12.isInArray(arr1)), new Boolean(true));
			do_check("isInArray()",i12,arr1,new Boolean (i12.isInArray(arr2)), new Boolean(false));
                        //			do_check("isInArray()",i17,arr7,new Boolean (i17.isInArray(arr7)), new Boolean(true));
			do_check("isInArray()",i9,arr6,new Boolean(i9.isInArray(arr6)),new Boolean(true));			
			do_check("isInArray()",i12,arr2,new Boolean(i12.isInArray(arr2)),new Boolean(false));			
			do_check("isInArray()",i45,arr9,new Boolean(i45.isInArray(arr9)),new Boolean(true));			
	
			do_check("before()",i12,i23,new Boolean(i12.before(i23)),new Boolean (true));			
			do_check("before()",i23,i12,new Boolean(i23.before(i12)),new Boolean (false));			
			do_check("before()",i9,i9,new Boolean(i9.before(i9)),new Boolean (false));			
			do_check("before()",i12,i17,new Boolean(i12.before(i17)),new Boolean (false));			
			do_check("before()",i34,i12,new Boolean(i34.before(i12)),new Boolean (false));			
			do_check("before()",i12,i34,new Boolean(i12.before(i34)),new Boolean (true));			

			
	
			do_check("isIncluded()",i12,i23,new Boolean(i12.isIncluded(i23)),new Boolean (false));				
			do_check("isIncluded()",i12,i15,new Boolean(i12.isIncluded(i15)),new Boolean (true));				
			do_check("isIncluded()",i23,i13,new Boolean(i23.isIncluded(i13)),new Boolean (true));				
			do_check("isIncluded()",i15,i15,new Boolean(i15.isIncluded(i15)),new Boolean (true));				
			do_check("isIncluded()",i17,i9,new Boolean(i17.isIncluded(i9)),new Boolean (false));				
			do_check("isIncluded()",i9,i59,new Boolean(i9.isIncluded(i59)),new Boolean (true));				

	
			do_check("allIncluded()",null,arr1,IntervalTime.allIncluded(arr1),new Boolean(false));
			do_check("allIncluded()",null,arr2,IntervalTime.allIncluded(arr2),new Boolean(true));
			do_check("allIncluded()",null,arr3,IntervalTime.allIncluded(arr3),new Boolean(false));
			do_check("allIncluded()",null,arr4,IntervalTime.allIncluded(arr4),new Boolean(false));
			do_check("allIncluded()",null,arr5,IntervalTime.allIncluded(arr5),new Boolean(false));
			do_check("allIncluded()",null,arr7,IntervalTime.allIncluded(arr7),new Boolean(true));
			do_check("allIncluded()",null,arr8,IntervalTime.allIncluded(arr8),new Boolean(true));
		}		


		////////////////////////////// END AUTO-GENERATED TEST CASES //////////////////////////////		
		
	    } catch (Exception exc) {
			System.out.println("\n*** Tester Error: returns exception\n"+exc.toString());
			throw new Error("Error en test: resultado incorrecto");		
	    }		
		
		System.out.println("\n Tester: Test finalizado correctamente.");
	}
	
	static void do_check(String op,IntervalTime i1, IntervalTime[] arr, Object result, Object expected) {	    

	    boolean correct = false;
	    if(result instanceof Integer || result instanceof Boolean)
	    	correct = result.equals(expected);		    	    	
	    else{
	    
	    }
	    
	    if (!correct) {
	    	String ErrMsg = "\n*** Tester Error: "+ op +" method\n"+
	    			" returns "+ result.toString() + "\n" + 
					" instead of " + expected.toString() + " for operands: \n";

			if(i1!=null)
				ErrMsg += " " + i1.toString();
			if(i1!=null && arr!=null)
				ErrMsg += " and \n";
			if(arr!=null)			
				ErrMsg += " " + arr.toString()+".\n";
	    	
	    	System.out.println(ErrMsg);
						
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}	
	static void do_check(String op,IntervalTime i1, IntervalTime i2, Object result, Object expected) {	    

	    boolean correct = false;
	    if(result instanceof Integer || result instanceof Boolean)
	    	correct = result.equals(expected);		    	    	
	    else{
	    
	    }
	    
	    if (!correct) {
	    	String ErrMsg = "\n*** Tester Error: "+ op +" method\n"+
	    			" returns "+ result.toString() + "\n" + 
					" instead of " + expected.toString() + " for operands: \n";

			if(i1!=null)
				ErrMsg += " " + i1.toString();
			if(i1!=null && i2!=null)
				ErrMsg += " and \n";
			if(i2!=null)			
				ErrMsg += " " + i2.toString()+".\n";
	    	
	    	System.out.println(ErrMsg);
						
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}	
	
	
	static void do_check(String op,Time t1, Time t2, Object result, Object expected) {	    

	    boolean correct = false;
	    if(result instanceof Integer || result instanceof Boolean)
	    	correct = result.equals(expected);		    	    	
	    else{
	    	Time t = (Time) result;
	    	correct = ((Integer)expected).intValue() == t.timeInSeconds();
	    }
	    
	    if (!correct) {
	    	String ErrMsg = "\n*** Tester Error: "+ op +" method\n"+
	    			" returns "+ result.toString() + "\n" + 
					" instead of " + expected.toString() + " for operands: \n";

			if(t1!=null)
				ErrMsg += " " + t1.toString();
			if(t1!=null && t2!=null)
				ErrMsg += " and \n";
			if(t2!=null)			
				ErrMsg += " " + t2.toString()+".\n";
	    	
	    	System.out.println(ErrMsg);
						
			throw new Error("Error en test: resultado incorrecto");		    
	    }
	}	

}
