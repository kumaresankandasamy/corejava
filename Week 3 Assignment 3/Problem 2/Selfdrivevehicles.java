import java.util.*;
interface Selfdrivevehicles{
	public abstract void drive(int userOpt);
}
class Vehicles implements Selfdrivevehicles{
	private String  source;
	private String  destination;

	public Vehicles(String source,String destination){
		this.source = source;
		this.destination = destination;
	}

	@Override
	public void drive(int userOpt){
		if(userOpt == 1){
			System.out.println("His driving Waganor Vehicle from  "+this.source +" to "+this.destination);
		}
		else if(userOpt == 2){
			System.out.println("His driving BMW Vehicle from "+this.source +" to "+this.destination);
		}

	}


}