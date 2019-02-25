
public class TimeDuration {
	
	private int numberOfSeconds;
	
	


	
	public TimeDuration(int numberOfSeconds) throws BadBadValueException{
		
		if (numberOfSeconds<0) throw new BadBadValueException("Nombre négatif non accepté");
		this.numberOfSeconds = numberOfSeconds;
		
	}

	
	public int getNumberOfSeconds() {
		return numberOfSeconds;
	}



	public void setNumberOfSeconds(int numberOfSeconds) {
		this.numberOfSeconds = numberOfSeconds;
	}



	public String toString() {
		int h;
		int m;
		int s=this.numberOfSeconds;
		
		h= s/3600;
		s=s%3600;
		m= s/60;
		s= s%60;
		
        if ((h==0) && (m==0))		
		return s+"s";
        if (h==0) return m+"m "+s+"s";
        else return h+"h "+m+"m "+s+"s";
	}


	public static void main(String[] args) throws BadBadValueException
	{
		
		System.out.println(new TimeDuration(0).toString());
		System.out.println(new TimeDuration(732).toString());
		System.out.println(new TimeDuration(7242).toString());
		
		
	}
	
	

	
}
