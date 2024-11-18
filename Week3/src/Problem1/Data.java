package Problem1;

public class Data {
	private double sum;
	private double max = Double.NEGATIVE_INFINITY;
	private int count;
	
	public Data() {
		
	}
	public void addValue(double value) {
		sum += value;
		if(max < value) {
			max = value;
		}
		count++;
	}
	
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		return sum / count;
	}
	
	public double getLargest() {
		if(count == 0) {
			return 0;
		}
		return max;
	}
	
}
