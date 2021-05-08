package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entitites.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile silindi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile güncellendi");
		
	}

}
