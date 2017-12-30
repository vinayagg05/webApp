package webapp;

public class LoginService {

	public boolean validateUser(String name, String password){
		if(name.equalsIgnoreCase("vinay") && (password.equalsIgnoreCase("abcd")))
			return true;
		
		return false;
	}
	
}
