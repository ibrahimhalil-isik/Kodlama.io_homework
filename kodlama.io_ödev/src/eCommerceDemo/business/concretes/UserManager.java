package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.entitites.concretes.User;

public class UserManager  implements UserService{

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi");
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� silindi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� g�ncellendi");
		
	}

}
