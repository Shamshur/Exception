package enumerationOne;
//An enumeration of Apple varieties
enum Apple{
	John, Johny, Jonathan, Tara, Rum, Pum
}
class EnumFirst {

	public static void main(String[] args) {
		{
			Apple ap;
			ap= Apple.Jonathan;
			//output an enum value
			System.out.println(" value of ap:" + ap);
			System.out.println();
			
			ap=Apple.Johny;
			//compare two Enum values
			if(ap == Apple.Johny)
				System.out.println("ap contains Johny.\n");
			
			//Use an enum to control switch statement.
			switch(ap) {
			case John: 
				System.out.println("John is red");
				break;
			case Johny:
				System.out.println("Johny is yellow");
				break;
			case Jonathan:
				System.out.println("Jonathan is green");
				break;
			case Tara:
				System.out.println("Tara is violet");
				break;
			case Rum:
				System.out.println("Rum is indigo");
				break;
			}
		}

	}

}
