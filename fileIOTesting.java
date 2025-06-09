import arc.*;

public class fileIOTesting{
	public static void main(String[] args){
		Console con = new Console();
				
				
				
				String strMCU [][];
				strMCU = new String [5][13];
				String strName;
				con.println("What is your name?");
				strName = con.readLine();	
				
				TextInputFile marvel = new TextInputFile("MCU.txt");	

				String strQuestion;
				String strA;
				String strB;
				String strC;
				String strD;
				String strAns = "";
				String strSelect;
				int intBSort; 
				int intCount = 0;
				int intSpot;
				double dblpercent = 0;
				int intCorrect = 0;
				
			
				while(marvel.eof()!= true){
					intCount = intCount + 1;
					strQuestion = marvel.readLine();
					strA = marvel.readLine();
					strB = marvel.readLine();
					strC = marvel.readLine();
					strD = marvel.readLine();
					strAns = marvel.readLine();
					con.println("apdfjas[jf" +intCount);

					con.println("The question is: " +strQuestion);
					con.println(strA);
					con.println(strB);
					con.println(strC);
					con.println(strD);
					strSelect = con.readLine();
//					intBSort = (int)(Math.random()*100+1);
				}


	}
}		
