public class Comparator<T extends Object> {
	private T x;
	private T y;

	/*
	* Constructor method
	*/
	public Comparator(T x, T y) {
		this.x = x;
		this.y = y;
	}

	/*
	* Return the maximum value of two pararmeters.
	*/
	public T getMax() {
		Object objX = (Object)this.x;
		String strX = objX.toString();
		Double dX = Double.parseDouble(strX);
		Object objY = (Object)this.y;
		String strY = objY.toString();
		Double dY = Double.parseDouble(strY);
		if (dX >= dY) {
			return this.x;
		} else {
			return this.y;
		}
	}

	public static void main(String[] args) {
		Comparator<String> myStr = new Comparator<String>("15.99", "8.1");
		System.out.println(myStr.getMax());

		Comparator<Integer> myInt = new Comparator<Integer>(12, 12536);
		System.out.println(myInt.getMax());

		Comparator<Double> myDoub = new Comparator<Double>(12.956328, 12536.1);
		System.out.println(myDoub.getMax());
	}
}


