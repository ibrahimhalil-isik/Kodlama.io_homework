package eCommerceDemo.business.abstracts;

import eCommerceDemo.entitites.concretes.User;

public interface UserService {
	
	public void add(User user);

	public void update(User user);

	public void delete(User user);
	

}
