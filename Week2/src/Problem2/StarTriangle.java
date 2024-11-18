package Problem2;

public class StarTriangle {
	private int width;
	
	public StarTriangle(int width) {
		this.width = width;
	}
	public String toString() {
		String result = "";
		for(int i = 1; i <= width; i++) {
			result += "[*]".repeat(i) + '\n';
		}
		return result;
	}
}
