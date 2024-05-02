package react4;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getNameString()+" kampanyası eklendi.");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getNameString()+" kampanyası silindi.");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getNameString()+" kampanyası güncellendi.");
		
	}

	

}
