package eCommerceDemo.core.concretes;

import eCommerceDemo.core.abstracts.AuthService;
import eCommerceDemo.support.GoogleAccount;

public class GoogleAccountAdapter implements AuthService{

	GoogleAccount googleAccount = new GoogleAccount();

	@Override
	public void register(String email, String password) {
		googleAccount.register(email, password);	
	}

	@Override
	public void login(String email, String password) {
		googleAccount.login(email, password);
		
	}

}
