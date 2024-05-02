package react4;

public class PlayerManager implements PlayerService,SalesService{

	@Override
	public void add(Player player) {
		System.out.println("oyuncu eklendi :"+player.getFirstName()+player.getLastName());
	}

	@Override
	public void delete(Player player) {
		System.out.println("oyuncu silindi :"+player.getFirstName()+player.getLastName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("oyuncu güncelendi :"+player.getFirstName()+player.getLastName());
		
	}

	@Override
	public void verify(Player player) {
		System.out.println("oyuncu doğrulandı :"+player.getFirstName()+player.getLastName());
		
	}
	

	@Override
	public void buyWithCampaing(Game game, Player player, Campaing campaing) {
		System.out.println(player.getFirstName()+" oyuncusu "+game.getName()+" oynuunu "+campaing.getNameString()+" kampanyayla satın aldı");
		
	}

	@Override
	public void buyingGame(Game game, Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" oyuncusu "+game.getName()+" oynunu satın aldı");
		
	}

	

	

	


}
