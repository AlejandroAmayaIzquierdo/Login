package login.db;

public interface AuthService {
	
	public boolean login(String username, String password) throws Exception;

}
