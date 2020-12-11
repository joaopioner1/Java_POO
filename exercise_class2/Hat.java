package exercise_class2;

public class Hat {
	// Author: Joao Vitor Souza Pioner | Data: 10/12/2020 23:45

	private String color;
	protected String material;
	protected String size;
	protected String brand;
	protected int quantity;
	protected boolean using;
	protected boolean clean;

	public Hat(String c, String m, String s, String b, int q) {

		this.color = c; // this.color faz referencia ao atributo do objeto
		this.material = m;
		this.brand = b;
		this.size = s;
		this.quantity = q;
		this.notUsing();
		this.clean();
	}
	
	public void using() {
		this.using = true;
	}
	
	public void notUsing() {
		this.using = false;
	}
	
	public void clean() {
		this.clean = true;
	}
	
	public void unclean() {
		this.clean = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void information() {
		
		System.out.println("-----HAT DESCRIPTION----");
		System.out.println("Color: " + this.color);
		System.out.println("Made of: " + this.material);
		System.out.println("Brand: " + this.brand);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Clean: " + this.clean);
		System.out.println("Using: " + this.using);
		System.out.println("------------------------");
	}
	
}
