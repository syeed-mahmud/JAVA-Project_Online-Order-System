package OnlineOrderSystem;

public class SportsDetails extends Process{
	
	private int bat;
	private int carrom;
	private int football;
	
	public SportsDetails() {}
	public SportsDetails(int bat,int carrom,int football)
	{
		super();
		this.bat = bat;
		this.carrom = carrom;
		this.football =  football;
		
	}
	public int getBat() {
		return bat;
	}
	public void setBat(int bat) {
		this.bat = bat;
	}
	public int getCarrom() {
		return carrom;
	}
	public void setCarrom(int carrom) {
		this.carrom = carrom;
	}
	public int getFootball() {
		return football;
	}
	public void setFootball(int football) {
		this.football = football;
	}
	
	
	public double price()
	{
		return (500*bat)+ (3000*carrom) + (1200*football);
	}

}
