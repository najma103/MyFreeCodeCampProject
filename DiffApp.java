import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class DiffApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	                 throws java.io.IOException {
	     String fileName1 = "InputFile1.txt";
	     String fileName2 = "InputFile2.txt";
	     String inLine1 = "it's a blank line";
	     String inLine2 = "The second blank line";
	     
	     // set up input stream1
   		FileReader fr1 = new
   				       FileReader(fileName1);
     // buffer the input stream
   		BufferedReader br1 =
   				         new BufferedReader(fr1);
   		
      // set up input stream1
  		FileReader fr2 = new
  				FileReader(fileName2);
      // buffer the input stream
  		BufferedReader br2 =
  				new BufferedReader(fr2);
  		
      // read and display1
    String buffer1 = "";
    String buffer2 = "";
   // ArrayList<String> firstFile1 = new ArrayList<String>();
    while ((buffer1 = br1.readLine()) !=null) { //  && (buffer2 = br2.readLine()) != null ) {
      //  firstFile1.add(buffer1);
        inLine1 = buffer1;
        //inLine2 = buffer2;
        buffer2 = br2.readLine();
        inLine2 = buffer2;
        if(inLine1.equals(null)) {
        	System.out.println("file 1 is empty ");
        	br1.close();
        } else {
        	 System.out.println("file 1 " + inLine1);
        }
        if(inLine2.equals(null)) {
        	System.out.println("file 2 is empty ");
        	br2.close();
        } else {
        	System.out.println("file 2 " + inLine2);
        }
        
        if(inLine1.equals(inLine2)) {
            System.out.println("They match yeeey  ") ;  // display the line
            parseLine(inLine1, inLine2);
        } else {
        	  System.out.println("does not match");
        }   
    //if((inLine1 == null) && (inLine2 != null)){
    //    System.out.println("file 1 is empty but file 2 still has records");
   } // closes the while loop
  br1.close();
  br2.close();

 } //closes maine
  static void parseLine(String inLine1, String inLine2) {
 	 char[] c= inLine1.toCharArray();  
 	 char[] d= inLine2.toCharArray();  
 	 char[] e= new char[c.length];
 	 int  count=0; 
 if(c.length == d.length)  { 
 	for(int i=0;i<inLine1.length();i++){  
 		// for(int k=0;k<=c.length-1;k++) {
 		//   if(g.charAt(i)==c[k]){  
 			if (c[i] == d[i]) {
 				continue;
	      }  else {
		      System.out.println("They don't match  " + c[i] + " "+ d[i]); 
		      //System.out.println(Arrays.deepToString((c[i]))); //"+ Arrays.deepToString(char (d[i]))); 
		      e[i] = c[i];
		      count++;    
	      }
    // }  
  }  
  String linePrint = Arrays.toString(e);
  //System.out.println("no. of duplicate character "  + Arrays.toString(e) +" " +count);  
  System.out.println("no. of duplicate character "  + linePrint +" " +count); 
}  
}
} // closes class