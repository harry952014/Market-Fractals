import java.io.*;

public class Populator {

	private BarArray myBarArr ;
    private String directory;
    private String fileName;
    private String symbol;
	
	public Populator(){
		
		myBarArr = new BarArray();
		directory = "/";
		symbol = "APPL";
		fileName = directory + symbol + "_Daily.csv";
	}
	
	public Populator(String s, String dir, String f){
		
		directory = dir;
		symbol = s;
		fileName = directory + f;
	}
	
	public Populator(BarArray b){
		
		myBarArr = new BarArray(b);
		directory = "/";
		symbol = "AAPL";
		fileName = directory + symbol + "_Daily.csv";
	}
	
	public Populator(BarArray b, String s, String dir, String f){
		
		myBarArr = new BarArray(b);
		directory = dir;
		symbol = s;
		fileName = directory + f;
	}
	
	
	
	public void populate(String s,String dir){
		
		String line;
		fileName = dir + s + "_Daily.csv";
		
		try{
			File file = new File(fileName);
			BufferedReader buff = new BufferedReader(new FileReader(file));
			buff.readLine();
			
			while((line = buff.readLine()) != null){
				myBarArr.insertTail(new Bar(line));
			}
			
			buff.close();
			
		}
		catch(IOException e){
			
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
