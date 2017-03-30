import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Vector;

public class MainApp {

	
	public static void main(String[] args)throws Exception {
		

		
		YahooData stockData = new YahooData("^IXIC","C:\\Users\\aceit\\Desktop", new Date("01/01/2006"),new Date("12/31/2016"));
		
		stockData.load();
		
	}
}
