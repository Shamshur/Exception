package autoboxingTwo;

class AutoboxTwo {
//Take integer parameter & return
	//an int value
	static int m(Integer v) {
		return v; //auto-unbox to int
	}
	public static void main(String[] args) {
		//pass an int to m() and assign the return value
		//to an integer. Here, the argument 100 is autobox
		//into an integer. The return value is also autobox
		Integer iob = m(100);
		System.out.println(iob);

	}

}
