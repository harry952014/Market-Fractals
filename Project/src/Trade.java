

/**
 * design and code a class trade that  has the following:
 * 
 * entryDate: date on which the trade is opened
 * 
 */


public class Trade {
	
	
	private Date entryDate, exitDate ;
	private float entryPrice, exitPrice, stopLoss, target;
	private String direction = "none";
	
	//accessor
	
	public Date getEntryDate(){
		return entryDate;
	}
	
	public Date getExitDate(){
		return exitDate;
	}
	
	public float getEntryPrice(){
		return entryPrice;
	}
	
	public float getExitPrice(){
		return exitPrice;
	}
	
	public float getStopLoss(){
		return stopLoss;
	}
	
	public float getTarget(){
		return target;
	}
	public String getDirection(){
		return direction;
	}
	
	//mutators
	
	public void setEntryDate(String d){
		
		entryDate = new Date(d);
	}
	
	public void setExitDate(String d){
		
		exitDate = new Date(d);
	}
	public void setEntryPrice(float entP){
	
	entryPrice = entP;
	}
	
	public void setExitDate(float extP){
	
		exitPrice = extP;
	}

}
