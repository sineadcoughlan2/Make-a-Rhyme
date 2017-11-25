//Sinead Coughlan
//R00128834
//Feb 8th 2016

public class Rhyme {

	//Displays verse 1
	public static void thisHouse()	{
		System.out.println("This is the house that Jack built.\n ");
	} //end of verse 1
 
	//Displays the final line of the next six verses
	public static void builtHouse()	{
		System.out.println("That lay in the house that Jack built.\n ");
	} 

	//start of verse 2
	public static void thisMalt() {
		System.out.println("This is the malt, ");
		builtHouse(); //refer to builtHouse method
	} 

	public static void ateMalt() {
		System.out.println("That ate the malt, ");
		builtHouse(); //refer to builtHouse method
	} 

	//start of verse 3
	public static void thisRat() {
		System.out.println("This is the rat, ");
		ateMalt(); //refer to ateMalt method
	} 

	public static void killedRat() {
		System.out.println("That killed the rat, ");
		ateMalt(); //refer to ateMalt method
	} 

	//start of verse 4
	public static void thisCat() {
		System.out.println("This is the cat, ");
		killedRat(); //refer to killedRat method
	} 

	public static void worriedCat()	 {
		System.out.println("That worried the cat, ");
		killedRat(); //refer to killedRat method
	} 

	//start of verse 5
	public static void thisDog() {
		System.out.println("This is the Dog, ");
		worriedCat(); //refer to worriedCat method
	} 

	public static void tossedDog() {
		System.out.println("That tossed the Dog, ");
		worriedCat(); //refer to worriedCat method
	} 

	//start of verse 6
	public static void thisCow() {
		System.out.println("This is the cow with the crumpled horn, ");
		tossedDog(); //refer to tossedDog method
	} 

	public static void milkedCow()	 {
		System.out.println("That milked the cow with the crumpled horn, ");
		tossedDog(); //refer to tossedDog method
	} 

	//start of verse 7
	public static void thisMaiden() {
		System.out.println("This is the maiden all forlorn, ");
		milkedCow(); //refer to milkedCow method
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisHouse();
		thisMalt(); 
		thisRat();
		thisCat();
		thisDog();
		thisCow();
		thisMaiden();

	}
}
