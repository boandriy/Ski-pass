public class Skipass {
	public int days;
	public int pass;
	public int[] p = {10,20,50,100}; 
	public boolean status = true;
	
	public void setPass(int var){
		this.pass = p[var];
	}
	
	public int getPass(){
		return pass;
	}
	public void setStatus(){
		status = false;
	}

	
}
