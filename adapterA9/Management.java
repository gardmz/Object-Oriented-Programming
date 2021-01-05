package adapterA9;

public class Management {
	
	public static void main(String args[]) {
		
		OldClient oldClient = new OldClient();
		oldClient.setName("Tom");
		oldClient.setAddress("Patterstone Drive,3346,30458,New York");
		oldClient.setAge(45);
		oldClient.setGender("Male");
		Client client = new ClientAdapter(oldClient);
		System.out.println(client.getName());
		System.out.println(client.getAge());
		System.out.println(client.getAddress());
		System.out.println(client.getGender());
	}
}
