package model;
import java.util.ArrayList;

public class Picture {
	
	private String url;
	private static int ID = 0;
	private int id;
	private double price;
	private ArrayList<String> categories;
	private int timesBought;
	

	public Picture(ArrayList<String> categories, String url, double price, int timesBought){
		this.categories = categories;
		this.url = url;
		this.price = price;
		this.timesBought = timesBought;
		id = ID++;
	}
	public ArrayList<String> getCategories() {
		return categories;
	}
	@Override
	public String toString() {
		return "-----Picture " + id + "-----";
	}
	public void showInfo(){
		System.out.println("-----Picture " + id + "-----");
		for(String category: categories)
			System.out.print(category + " ");
		System.out.println("Price : " + price);
		System.out.println("Times bought : " + timesBought);
		
	}
}
