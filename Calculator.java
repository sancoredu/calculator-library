public Calculator {
	public int add(int a, int b) {
	    if (a < 0 || b < 0) {
	    throw new IllegalArgumentException();
	    }
                         	 return a + b;
	}
}
