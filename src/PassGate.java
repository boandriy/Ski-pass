public class PassGate {
	
	public boolean verifyStatus(Skipass p){
		/*
		 * varifies pass status 
		 */
		return p.status;
	}
	
	public void setBlocked(Skipass p){
		/*
		 *Blocks user 
		 */
		p.status = false;
	}
	
	public boolean pass(Skipass p){
		/**
		 * pass func returns True if person have passed.
		 * False otherwise 
		 */
		if (!(verifyStatus(p))){
			return false;
		}
		if ((p.days >= 1) || (p.pass >= 1)){
			if(p.pass >= 1){
				p.pass = p.pass - 1;
			}
			return true;
		}
		
		return false;
		
	}
	public void endDay(Skipass p){
		/*
		 * ends day for pass
		 */
		p.days = p.days - 1; 
	}
}
