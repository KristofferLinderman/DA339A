package laboration11;

public class Table {

	private String material;
	private double width, depth, height, size;

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public String getMaterial() {
		return material;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getDepth() {
		return depth;
	}

	public double size() {
		return depth * width;
	}

	public String toString() {
		return "\tTABLE\nMaterial: " + material + "\nWidth: " + width
				+ "\nDepth: " + depth + "\nHeight: " + height;
	}
}
