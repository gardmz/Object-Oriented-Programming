package adapterA9;

public class ClientAdapter extends NewClient implements Client{
	private OldClient oldClient;
	
	public ClientAdapter(OldClient oldClient) {
		this.oldClient = oldClient;
		this.adapt();
	}
	
	public void adapt() {
		this.setName(oldClient.getName());
		this.setAge(Integer.valueOf(oldClient.getAge()));
		this.setGender(oldClient.getGender());
		Address address = new Address();
		String[] oldAddress = oldClient.getAddress().split(",");
		
		address.setStreetName(oldAddress[0]);
		address.setHouseNumber(Integer.valueOf(oldAddress[1]));
		address.setPostalCode(Integer.valueOf(oldAddress[2]));
		address.setCity(oldAddress[3]);
		this.setAddress(address);
	}
}
