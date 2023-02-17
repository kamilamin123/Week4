package main;
public class HiddenWord{
	private String hidden;

    public HiddenWord(String hidden) {
		super();
		this.hidden = hidden;
	}

	/** Declare any fields (instance variables) **/

    /** Declare a constructor */

    /** Write the getHint method */
  public String getHint(String hint) {
    	StringBuilder output = new StringBuilder ();
    	
    	for (int i=0; i<hidden.length();i++) {
    		if(hidden.contains(String.valueOf(hint.charAt(i)))){
    			if (hidden.charAt(i)==hint.charAt(i)) {
    				output.append(hint.charAt(i));
    			}else {
    				output.append("+");	
    			}
    		}else {
    			output.append("*");
    		}
    	}
    	return output.toString();
      	
    }

    /** This is a main method for testing the class */
    public static void main(String[] args) {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
        System.out.println(puzzle.getHint("HELLO") + " it should print H****");
        System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
        System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
        System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

    } // end of main

} // end of clas
