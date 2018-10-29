package WebDriver.function;
/**
 * @author anthony.nehme
 *
*/
public class JavaVariable {

	static int item4=20;
		  
 public void Calc() {
  // Local Variables.
 
  int sum;
  int item1 = 7;
  int item2 = 7;
 
  
  sum = item1 + item2+ item4;
  
  if (sum >= 34)  {
	  System.out.println ("The sum was over" +sum);}
  else {
	  System.out.println ("The sum was below" +sum);
  }
		  
  //System.out.println("Sum is : " + sum);
 }

 public static void main(String args[]) {
 
	 	 
	JavaVariable j = new JavaVariable();
	j.Calc();
	    
 System.out.println ("The sum was below" +item4);
 j.Reverse ();
 
 System.out.println(removeChar("chicago", 'c'));
 }

 public void Reverse () {
	  //String to reverse.
	 
	 
	  String str = "This Is String.";
	  String revstring = "";
	

	  for (int i = str.length() - 1; i >= 0; --i) {
	   //Start getting characters from end of the string.
	   revstring += str.charAt(i);
	  }

	  System.out.println(revstring);
	   
     }

 public static String removeChar(String str, char c) {
	     if (str == null)
	         return null;
	     return str.replaceAll(Character.toString(c), "");
	     
	    
	 }
	 
	 }

