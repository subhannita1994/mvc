
public class Controller {

	public static void getSumAndAverage(int i) {
		// TODO Auto-generated method stub
		
		Model m = new Model(i);
		calculate(m);
		View v = new View();
		display(m,v);
		
	}

	private static void display(Model m, View v) {
		// TODO Auto-generated method stub
		
		v.display(m.getSum(),m.getAverage());
		
	}

	private static void calculate(Model m) {
		// TODO Auto-generated method stub
		
		int sum = m.geti();
		int average = 0;
		for(int j=1; j<10; j++) {
			sum += j;
			average = sum/j;
		}
		m.setSum(sum);
		m.setAverage(average);
	}

}
