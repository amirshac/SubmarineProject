package Shapes;

public class RotatableShape extends EvenShape{
	
	
	// constructors
	public RotatableShape(char[][] data) {
		super(data);
	}
	
	public RotatableShape(int size) {
		super(size);
	}
	
	// methods
	public void rotate() {
		int len = data.length-1;
		char temp;
		
		for (int i=0; i<data.length/2; i++) {
			for (int j=i; j<len-i; j++) {
				temp = data[i][j];
				data[i][j] = data[len-j][i];
				data[len-j][i] = data[len-i][len-j];
				data[len-i][len-j] = data[j][len-i];
				data[j][len-i] = temp;
			}
		}
	}

}
