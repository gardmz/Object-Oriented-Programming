package iteratorA10;

public class Frequency {
	
	private double frequency;
	private FrequencyTypeEnum TYPE;
	private String genre;
	
	public Frequency(double freq, FrequencyTypeEnum type, String genre){
		this.frequency=freq;
		this.TYPE=type;
		this.genre = genre;
	}

	public double getFrequency() {
		return frequency;
	}

	public FrequencyTypeEnum getTYPE() {
		return TYPE;
	}
	
	public String getGenre() {
		return genre;
	}
	@Override
	public String toString(){
		return "Frequency="+this.frequency+", Type="+this.TYPE+", Genre ="+this.genre;
	}
}
