public class WeekendPass extends Skipass{
	
	public int pass;
	public int days;
	public int[] d = {1,2,5};
	
	
	
	public void setDays(int var){
		this.days = d[var];
	}
	
	public int getDays(){
		return days;
	} 
	
}
