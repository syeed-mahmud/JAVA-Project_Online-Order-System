package OnlineOrderSystem;

public class FoodDetails extends Process{
	private int burger;
	private int pizza;
	private int shake;
	
	public FoodDetails() {}
	public FoodDetails(int burger,int pizza,int shake)
	{
		this.burger = burger;
		this.pizza = pizza;
		this.shake = shake;
		
	}
	public int getBurger() {
		return burger;
	}
	public void setBurger(int burger) {
		this.burger = burger;
	}
	public int getPizza() {
		return pizza;
	}
	public void setPizza(int pizza) {
		this.pizza = pizza;
	}
	public int getShake() {
		return shake;
	}
	public void setShake(int shake) {
		this.shake = shake;
	}
	
	public double price()
	{
		return (200*burger)+ (1350*pizza) + (150*shake);
	}

}
