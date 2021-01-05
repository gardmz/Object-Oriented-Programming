package iteratorA10;

import java.util.Scanner;

public class IteratorTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FrequencyCollection frequencies = load();
		FrequencyIterator baseIterator = frequencies.iterator(FrequencyTypeEnum.ALL);
		System.out.println("All Stations...");
		while (baseIterator.hasNext()) {
			Frequency f = baseIterator.next();
			System.out.println(f.toString());
		}

		System.out.println("\nSelect a channel type AM, FM, or XM");
		String iteratorType = input.next();
		
			if(iteratorType.equalsIgnoreCase("am")) {
				FrequencyIterator amIterator = frequencies.iterator(FrequencyTypeEnum.AM);
				while (amIterator.hasNext()) {
					Frequency f = amIterator.next();
					System.out.println(f.toString());
				
				}
			}else if(iteratorType.equalsIgnoreCase("fm")) {
				FrequencyIterator fmIterator = frequencies.iterator(FrequencyTypeEnum.FM);
				while (fmIterator.hasNext()) {
					Frequency f = fmIterator.next();
					System.out.println(f.toString());
				
				}
			}else if(iteratorType.equalsIgnoreCase("xm")) {
				FrequencyIterator xmIterator = frequencies.iterator(FrequencyTypeEnum.XM);
				while (xmIterator.hasNext()) {
					Frequency f = xmIterator.next();
					System.out.println(f.toString());
				
				}
			}else 
				System.out.println("Invalid Frequency Type...");
			
			input.close();
	}

	private static FrequencyCollection load() {
		FrequencyCollection frequencies = new MyFrequencyCollection();
		frequencies.add(new Frequency(1001.6, FrequencyTypeEnum.AM,"HIP HOP"));
		frequencies.add(new Frequency(1001.2, FrequencyTypeEnum.AM,"HIP HOP"));
		frequencies.add(new Frequency(1001.8, FrequencyTypeEnum.AM,"CLASSIC ROCK"));
		frequencies.add(new Frequency(202.3, FrequencyTypeEnum.FM,"ROCK"));
		frequencies.add(new Frequency(204.2, FrequencyTypeEnum.FM,"COUNTRY"));
		frequencies.add(new Frequency(202.7, FrequencyTypeEnum.FM,"SPORTS"));
		frequencies.add(new Frequency(3000.9, FrequencyTypeEnum.XM,"CLASSIC ROCK"));
		frequencies.add(new Frequency(3001.6, FrequencyTypeEnum.XM,"ROCK"));
		frequencies.add(new Frequency(3004.2, FrequencyTypeEnum.XM,"COUNTRY"));
		return frequencies;
	}
}
