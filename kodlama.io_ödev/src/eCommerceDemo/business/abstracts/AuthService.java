package eCommerceDemo.business.abstracts;

import eCommerceDemo.entitites.dtos.UserForLoginDto;
import eCommerceDemo.entitites.dtos.UserForRegisterDto;

public interface AuthService {
	
	void register(UserForRegisterDto userForRegisterDto, String password);
	
    void login(UserForLoginDto userForLoginDto);

}
