
public class Event implements Comparable {

	private String RFIDTag;
	private TimeDuration raceTime;
	
	
	
	public Event(String RFIDTag, TimeDuration raceTime) {
		
		this.RFIDTag = RFIDTag;
		this.raceTime = raceTime;
	}
	public String getRFIDTag() {
		return RFIDTag;
	}
	public void setRFIDTag(String RFIDTag) {
		this.RFIDTag = RFIDTag;
	}
	public TimeDuration getRaceTime() {
		return raceTime;
	}
	public void setRaceTime(TimeDuration raceTime) {
		this.raceTime = raceTime;
	}
	
	
	@Override
	public int compareTo(Object evenCompare) {

		int compareage=((Event)evenCompare).getRaceTime().getNumberOfSeconds();
       
        return this.raceTime.getNumberOfSeconds()-compareage;

		
	}
}
