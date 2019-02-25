import java.util.ArrayList;

public class RaceResults {
	
	private ArrayList<Event> events ;
	
	
	
	

	public RaceResults(ArrayList<Event> events) {
		
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
	
	
	public void onNewResult(String tagNumber, TimeDuration resultTime)
	
	{
		this.events.add(new Event(tagNumber,resultTime));
		
	}
	
	
	
	
	
	
	


	
	
	
}
