package iteratorA10;

public interface FrequencyCollection {
	
	public void add(Frequency f);
	
	public void remove(Frequency f);
	
	public FrequencyIterator iterator(FrequencyTypeEnum type);
}
