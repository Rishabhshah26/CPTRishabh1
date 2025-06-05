import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MultChoice{
	public static void main(String[] args){
		Console con = new Console("MultChoice", 1280, 720);
		con.println("\n\n\n\n\n\n\nWelcome to...");
		BufferedImage trivialogo = con.loadImage("trivialogo.png");
		con.drawImage(trivialogo, 40, 0);
		
		String strDecision;
		
		String strDecision2;
		
		String strHelpDecision;
		
		con.println("\n\n\n\n\n\n\n\nWould you like to: \nA          - Play a Quiz, \nB          - View Leaderboard, \nC          - Add Quiz, \nD          - Quit, \nH          - Help");
		strDecision = con.readLine();
		
		if(strDecision.equalsIgnoreCase("A")){	
			
			con.println("A - MCU, B - Countries, C - Sports");
			strDecision2 = con.readLine();
			
			if(strDecision2.equalsIgnoreCase("A")){
			
			
		
				String strMCU [][];
				strMCU = new String [6][13];
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
				double dblpercent;
				
			
				while(marvel.eof()== false){
					if(intCount >= 13){
						intCount = intCount + 1;
						strQuestion = con.readLine();
						strA = con.readLine();
						strB = con.readLine();
						strC = con.readLine();
						strD = con.readLine();
			
						intBSort = (int)(Math.random()*100+1);
		
		
						strMCU[0][intCount] = strQuestion;
						strMCU[1][intCount] = strA;
						strMCU[2][intCount] = strB;
						strMCU[3][intCount] = strC;
						strMCU[4][intCount] = strD;
						strMCU[5][intCount] = strAns;
						strMCU[6][intCount] = Integer.toString(intBSort);
						 
						 
						// sorting array
						
						if(Integer.parseInt(strMCU[6][intCount]) > Integer.parseInt(strMCU[6][intCount + 1])){
							intSpot = Integer.parseInt(strMCU[6][intCount]);
							strMCU[6][intCount + 1] = strMCU[6][intCount];
							strMCU[6][intCount] = Integer.toString(intSpot);
						} 
					
					con.println(strMCU[0][intCount]+ strMCU[1][intCount] + strMCU[2][intCount]+ strMCU[3][intCount]+ strMCU[4][intCount]);
					strSelect = con.readLine();
					if(strSelect.equalsIgnoreCase(strAns)){
						con.println("Correct!");
					}else{
						con.println("False...");
					}
				
								
					}
				
				}
				
			}
		} else if(strDecision.equalsIgnoreCase("H")){
			
			con.println("Which quiz are you going to play? A - MCU, B - Countries, C - Sports");
			strHelpDecision = con.readLine();
			
			if(strHelpDecision.equalsIgnoreCase("A")){
				con.println("The MCU is currently in Phase 5. Also, recall the real birthplace of Loki...");
			} else if(strHelpDecision.equalsIgnoreCase("B")){
				con.println("The Capital of Brazil is actually not Rio De Janeiro. \nThe Capital of Belgium is also the name of a sprout vegetable");
			} else{ 
				con.println("Many people believe that Nikola Jokic deserved the MVP award over the \nCanadian shooting Guard on Oklahoma City. Lionel Messi rejected a roughly \n$1 Billion contract from Al Hilal to move to the South Eastern corner of the USA.");
			}
		
		} else if(strDecision.equalsIgnoreCase("B")){
		} else if(strDecision.equalsIgnoreCase("C")){
		}
	}
}
