package eCommerceDemo.dataAccess.abstracts;

import eCommerceDemo.entitites.concretes.User;

public interface UserDao {
	
	 	void add(User user);

	    void update(User user);

	    void delete(User user);

}
