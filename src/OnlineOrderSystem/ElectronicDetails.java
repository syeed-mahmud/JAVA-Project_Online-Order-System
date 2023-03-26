package OnlineOrderSystem;

public class ElectronicDetails extends Process{
	private int tv;
	private int pc;
	private int ac;
	
	public ElectronicDetails() {}
	public ElectronicDetails(int tv,int pc,int ac)
	{
		this.tv = tv;
		this.pc = pc;
		this.ac = ac;
		
	}
	public int getTv() {
		return tv;
	}
	public void setTv(int tv) {
		this.tv = tv;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	
	public double price()
	{
		return (50000*tv)+ (80000*pc) + (60000*ac);
	}
	
	

}
