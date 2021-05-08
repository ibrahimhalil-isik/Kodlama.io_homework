package eCommerceDemo.core.abstracts;

public interface AuthService {
	
	void register(String email, String password);

    void login(String email, String password);

}
