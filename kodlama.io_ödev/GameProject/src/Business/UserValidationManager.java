package Business;

import Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		
		if(
				gamer.getIdentityNumber()==123456789 &&
				gamer.getFirstName()=="�brahim Halil" && 
				gamer.getLastName()=="I�IK" &&				
				gamer.getBirthYear()==2000
		) {
			return true;
		}
			
		
		return false;
	}

}
