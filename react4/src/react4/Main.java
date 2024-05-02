package react4;

public class Main {

	public static void main(String[] args) {
		
		Player player=new Player();
		player.setFirstName("levi");
		player.setLastName("dado");
		player.setDate("1453");
		player.setTc("25478301");
		player.setId(1);
		
		System.out.println(player.getFirstName()+" "+player.getDate());
		
		PlayerManager playerManager=new PlayerManager();
		CampaingManager campaingManager=new CampaingManager();
		Campaing campaing=new Campaing();
		campaing.setNameString("dew kampanya 2 . bedava");
		
		playerManager.add(player);
		campaingManager.add(campaing);
	}

}
