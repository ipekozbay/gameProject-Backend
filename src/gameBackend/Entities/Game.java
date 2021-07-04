package gameBackend.Entities;

public class Game {
	
	int id;
	String name;
	String features;
	int price;
	
	public Game() {}
	
	public Game(int id, String name, String features, int price) {
		super();
		this.id = id;
		this.name = name;
		this.features = features;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
