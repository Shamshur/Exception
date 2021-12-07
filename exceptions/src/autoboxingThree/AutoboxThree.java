package autoboxingThree;
//AUTOBOXING AND UNBOXING OCCUR INSIDE THE EXPRESSION
public class AutoboxThree {

	public static void main(String[] args) {
	Integer iob,iob1;
	int i;
    iob=100;
    System.out.println("Original value of iob:"+ iob);
    //The following automatically unboxes iob,
    //performs the increment, and then reboxes
    //the result back into iob
    ++iob;
    System.out.println("After ++iob: " + iob);
    //Here, iob is unboxed, the expression is
    //evaluated, and the result is reboxed and
    //assigned to iob2
    iob1 = iob + (iob/3);
    System.out.println("iob after expression:" + iob1);
    
    //The same expression is evaluated, but the
    //result is not reboxed
    i = iob + (iob/3);
    System.out.println("i after the expression: " + i);
	}

}
