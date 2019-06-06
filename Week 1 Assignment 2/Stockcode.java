public class Stockcode{
	public static void main(String[] args) {
		String input = "TCS";
    switch(input){
			case "INF" :
			input =" Infosys";
			break;
			case "TCS" :
			input = "Tata Consultancy Services";
			break;
			case "RIL" :
			input = "Reliance Industries ";
			break;
			default :
			input = " Not Mapped";
			break;

		}
		System.out.println(input);
	}
}