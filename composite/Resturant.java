package composite;

public class Resturant {
	public static void main (String[] args) 
    { 
		//Adjusting Chefs information
		EmployeeDirectory chefs = new EmployeeDirectory(); 
		Chef chef1 = new Chef(900923, "Gard Zeringue", "Head Chef", 70); 
        Chef chef2= new Chef(900911, "Nick VanGundy", "Line Cook", 60); 
        Chef chef3 = new Chef(900945, "Iverson Johnson", "Sous Chef", 60); 
        chefs.add(chef1); 
        chefs.add(chef2); 
        chefs.add(chef3); 
        chefs.remove(chef2);
        
        //Adjusting Managers information
        EmployeeDirectory managers = new EmployeeDirectory(); 
        Manager dayMan = new Manager(900954, "Rich Clark", "Day Manager", 100);
        Manager nightMan = new Manager(900963, "Gage Zeringue", "Night Manager", 80); 
        managers.add(dayMan); 
        managers.add(nightMan); 
        
        //Adjusting servers information
        EmployeeDirectory servers = new EmployeeDirectory(); 
        Server server1 = new Server(900987, "Andrew Hicks", "Head Server", 45); 
        Server server2 = new Server(900985, "Nick Depoy", "Server", 40); 
        servers.add(server1);
        servers.add(server2);
        
        //Adjusting directories information
        EmployeeDirectory empDirectory = new EmployeeDirectory(); 
        empDirectory.add(chefs); 
        empDirectory.add(managers); 
        empDirectory.add(servers);
        empDirectory.employeeToString(); 
    } 
}
