package iterator;
import java.util.Scanner;

public class IteratorPatternTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ChannelCollection channels = populateChannels();
		ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);
		System.out.println("All Channels...");
		while (baseIterator.hasNext()) {
			Channel c = baseIterator.next();
			System.out.println(c.toString());
		}

		System.out.println("\nSelect a channel type AM, FM, or XM");
		String iteratorType = input.next();
		
			if(iteratorType.equalsIgnoreCase("am")) {
				ChannelIterator amIterator = channels.iterator(ChannelTypeEnum.AM);
				while (amIterator.hasNext()) {
					Channel c = amIterator.next();
					System.out.println(c.toString());
				
				}
			}else if(iteratorType.equalsIgnoreCase("fm")) {
				ChannelIterator fmIterator = channels.iterator(ChannelTypeEnum.FM);
				while (fmIterator.hasNext()) {
					Channel c = fmIterator.next();
					System.out.println(c.toString());
				
				}
			}else if(iteratorType.equalsIgnoreCase("xm")) {
				ChannelIterator xmIterator = channels.iterator(ChannelTypeEnum.XM);
				while (xmIterator.hasNext()) {
					Channel c = xmIterator.next();
					System.out.println(c.toString());
				
				}
			}else 
				System.out.println("Invalid Channel Type...");
			
	}

	private static ChannelCollection populateChannels() {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.AM,"HIP HOP"));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.AM,"HIP HOP"));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.AM,"CLASSIC ROCK"));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.FM,"ROCK"));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.FM,"COUNTRY"));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FM,"SPORTS"));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.XM,"CLASSIC ROCK"));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.XM,"ROCK"));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.XM,"COUNTRY"));
		return channels;
	}

}


