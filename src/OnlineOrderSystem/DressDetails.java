package OnlineOrderSystem;

public class DressDetails extends Process{
	
	private int sharee;
	private int winter;
	private int kamiz;
	private int shirts;
	private int jeans;
	
	public DressDetails() {}
	public DressDetails(int sharee,int winter,int kamiz,int shirts,int jeans)
	{
		this.sharee = sharee;
		this.winter = winter;
		this.kamiz = kamiz;
		this.shirts = shirts;
		this.jeans = jeans;
	}
	public int getSharee() {
		return sharee;
	}
	public void setSharee(int sharee) {
		this.sharee = sharee;
	}
	public int getWinter() {
		return winter;
	}
	public void setWinter(int winter) {
		this.winter = winter;
	}
	public int getKamiz() {
		return kamiz;
	}
	public void setKamiz(int kamiz) {
		this.kamiz = kamiz;
	}
	public int getShirts() {
		return shirts;
	}
	public void setShirts(int shirts) {
		this.shirts = shirts;
	}
	public int getJeans() {
		return jeans;
	}
	public void setJeans(int jeans) {
		this.jeans = jeans;
	}
	
	public double price()
	{
		return (7000*sharee)+ (5000*winter) + (2000*kamiz)+(1000*shirts)+(2000*jeans);
	}
	

}
