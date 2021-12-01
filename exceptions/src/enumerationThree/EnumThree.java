package enumerationThree;
enum Apple{
	John(10), Johny(20), Jonathan(25),Jakob(30);
	private int price;
	//constructors
	Apple(int p) {price = p;}
	int getPrice() {
		return price;
		}
}
class EnumThree {

	public static void main(String[] args) {
		Apple ap;
		//Display price of Jakob
		System.out.println(" Jakob cost is" + Apple.Jakob.getPrice() + " cents.\n");
//Display all apples and prices
		System.out.println("All apple prices:");
		for(Apple a: Apple.values())
			System.out.println(a + "costs" + a.getPrice() + "cents.");
	}

}
