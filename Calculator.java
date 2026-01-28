public Calculator {
	public int add(int a, int b) {
		System.out.println("Adding numbers");
	    if (a < 0 || b < 0) {
		throw new IllegalArgumentException();
	    }
		return a + b;
	}
}
