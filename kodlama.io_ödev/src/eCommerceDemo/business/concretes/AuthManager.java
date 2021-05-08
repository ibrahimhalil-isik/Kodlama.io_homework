package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.AuthService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.entitites.concretes.User;
import eCommerceDemo.entitites.dtos.UserForLoginDto;
import eCommerceDemo.entitites.dtos.UserForRegisterDto;

public class AuthManager implements AuthService {
	
	UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void register(UserForRegisterDto userForRegisterDto, String password) {
         User user = new User(
        		 userForRegisterDto.getEmail(),
        		 userForRegisterDto.getPassword(),
        		 userForRegisterDto.getFirstName(),
        		 userForRegisterDto.getLastName()
        		 );		 
         this.userService.add(user);
		
	}

	@Override
	public void login(UserForLoginDto userForLoginDto) {
		
		User user = new User();
        
		
	}

}
