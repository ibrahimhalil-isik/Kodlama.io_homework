package Business;

import Entities.Gamer;

public class GamerManager implements GamerService {
	
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.Validate(gamer)) {
			System.out.println("Kayit baþarili. Eklenen oyuncu : "+gamer.getFirstName());
		} else {
			System.out.println("Kayit basarisiz. "+gamer.getFirstName()+" Girilen bilgiler dogrulanamadi.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kayit silindi. Silinen oyuncu : "+gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kayýt guncellendi. Güncellenen oyuncu : "+gamer.getFirstName());
		
	}

	@Override
	public void getAll(Gamer[] gamer) {
		
		System.out.println(" Tum oyuncular ");
		
		for (Gamer _gamer : gamer) {
			System.out.println(_gamer.getFirstName()+" "+_gamer.getLastName());
		}
		
	}

}
