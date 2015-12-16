package laboration11;

public class TableTest {
public static void main(String[] args) {
	Table t = new Table();
	
	t.setWidth(120);
	t.setDepth(70);
	t.setMaterial("metalllz");
	t.setHeight(45);
	
	System.out.println("Width: " + t.getWidth());
	System.out.println("Height: "+ t.getHeight());
	System.out.println("Depth: " + t.getDepth());
	System.out.println("Area: " +t.size());
	System.out.println("Material: " + t.getMaterial());
	System.out.println();
	System.out.println(t.toString());

}
}
