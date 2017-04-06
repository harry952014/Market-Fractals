import java.io.*;

//design and code class Downloader (wrapper for yahooData) that has the following properties:
//fileName: for a file containing symbols to download from yahoo
//yahooData object to connect to yahoo and download the stock
//startDate and endDate for the period to
//Directory where to download all the data. 
//Write a tester to download all the data you need (stocks.txt and indices.txt on blackboard).
//method loadAll() to download all symbols in the input file.
public class Downloader {

	private String fileName;
	private YahooData data ;
	private Date startDate,endDate;
	private String directory;
	
	public Downloader(){
		data = new YahooData();
		fileName = "Stocks.txt";
		this.startDate = new Date();
		this.endDate = new Date();
		directory = "/";
	}
	
	
	public Downloader( YahooData data, String startDate, String endDate, String directory,String fileName) {
		
		
		this.data = new YahooData(data);
		this.startDate = new Date(startDate);
		this.endDate = new Date(endDate);
		this.directory = directory;
		this.fileName = directory  + fileName;
	}
	
	public Downloader(String startDate, String endDate, String directory, String fileName) {
		
		this.data = new YahooData();
		this.startDate = new Date(startDate);
		this.endDate = new Date(endDate);
		this.directory = directory;
		this.fileName = directory + fileName;
	}


	
	public boolean loadAll(){
		
		try{
			
			FileReader inFile = new FileReader(this.fileName);
			BufferedReader inBuff = new BufferedReader(inFile);
			String symbol;
			
			while((symbol = inBuff.readLine())!= null){
				
				data.setData(symbol,"Trades/", startDate,endDate);
				
				if(data.load()){
					System.out.println("Yaahooo!!");
				}else{
					System.out.println("Sorry :(.");
					
				}
				
			}
	
			inBuff.close();
			return true;
		}
		catch (IOException e){
			System.out.println("Exception: " + e.getMessage());
			return false;
		}
		
	}

	//accessors and mutators
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public YahooData getData() {
		return data;
	}
	public void setData(YahooData data) {
		this.data = new YahooData();
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = new Date(startDate);
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = new Date(endDate);
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	
	
	
	
}
