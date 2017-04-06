import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Vector;

public class MainApp {

	
	public static void main(String[] args)throws Exception {
		
		/*
		YahooData stockData = new YahooData();
		
		//constructor with
		Downloader stockDownloader = 
				new Downloader(stockData, "01/01/2006", "12/31/2016", "C:/", "Stocks.txt");
		
		if(stockDownloader.loadAll()){
			System.out.println("Yaahooo!!");
		}else{
			System.out.println("uh oh");
			
		}
		
		Downloader indexDownloader = 
				new Downloader("01/01/2006", "12/31/2016", "C:/", "Indices.txt");
		
		if(indexDownloader.loadAll()){
			System.out.println("Yaahooo!!");
		}else{
			System.out.println("uh oh");	
		}
		*/
		
		
		Bar b1 = new Bar("04/05/2006",301.3f,435,300,347,350,1800000);
		Bar b2 = new Bar("04/05/2010",301.3f,435,300,347,350,1800000);
		Bar b3 = new Bar("04/05/2016",301.3f,435,300,347,350,1800000);
		Bar b4 = new Bar("04/05/2017",301.3f,435,300,347,350,1800000);
		BarArray  bars = new BarArray(1000);
		
		/*
		bars.insertTail(b1);
		bars.insertTail(b2);
		bars.insertHead(b3);
		bars.insert(b4,1);
		
		bars.display();
		
		bars.removeHead();
		bars.remove(2);
		bars.insert(b1, 2);
		
		bars.display();
		*/
		
		
		Populator barPopulator = new Populator(bars);
		
		barPopulator.populate("AAPL","Trades/");
		
		
		bars.display();
	}
}
