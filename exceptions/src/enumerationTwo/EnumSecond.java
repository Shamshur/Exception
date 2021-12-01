package enumerationTwo;
//An enumeration of Apple variety
enum Apple{
	Ram, Sita, Geeta, Peeta
}
class EnumSecond {
	public static void main(String[] args) {
		Apple ap;
		System.out.println(" Here is all apple constant:");
		//use values()
		Apple allapples[] = Apple.values();
		//for(Apple a: allapples)
		for(Apple a: Apple.values())//this is better practice
			System.out.println(a);
		System.out.println();
		//use valueof())
		ap=Apple.valueOf("Geeta");
		System.out.println("ap contains " + ap);
	}


}
