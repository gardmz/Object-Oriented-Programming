package iteratorA10;

import java.util.ArrayList;

import java.util.List;

public class MyFrequencyCollection implements FrequencyCollection {
	
	private List<Frequency> frequencyList;

	public MyFrequencyCollection() {
		frequencyList = new ArrayList<>();
	}

	public void add(Frequency f) {
		this.frequencyList.add(f);
	}

	public void remove(Frequency f) {
		this.frequencyList.remove(f);
	}

	@Override
	public FrequencyIterator iterator(FrequencyTypeEnum type) {
		return new FrequencyIteratorImpl(type, this.frequencyList);
	}

	private class FrequencyIteratorImpl implements FrequencyIterator {

		private FrequencyTypeEnum type;
		private List<Frequency> frequencys;
		private int position;

		public FrequencyIteratorImpl(FrequencyTypeEnum ty, List<Frequency> frequencyList) {
			this.type = ty;
			this.frequencys = frequencyList;
		}

		@Override
		public boolean hasNext() {
			while (position < frequencys.size()) {
				Frequency f = frequencys.get(position);
				if (f.getTYPE().equals(type) || type.equals(FrequencyTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Frequency next() {
			Frequency f = frequencys.get(position);
			position++;
			return f;
		}

	}
}
