
package iterator;

public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;
	private String genre;
	
	public Channel(double freq, ChannelTypeEnum type, String genre){
		this.frequency=freq;
		this.TYPE=type;
		this.genre = genre;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
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
