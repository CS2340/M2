package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name = "Bryan Koo";
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
		char[] str = input.toCharArray();
		String str1 = input.substring(0,2); //g 
		System.out.println("str1 " + str1);
		String str2 = input.substring(2);
		System.out.println("str2 " + str2);
		String newstr = str2 + str1;
		System.out.println("newstr " + newstr);
		return newstr; 
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	public static void main(String[] args){
		Person5 foo = new Person5("gtg123b"); 
		System.out.println(foo.calc("gtg123b"));
	}

}
