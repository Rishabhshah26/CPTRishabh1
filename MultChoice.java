import arc.*;

public class MultChoice{
	public static void main(String[] args){
		Console con = new Console();
		
		String strDecision;
		
		String strDecision2;
		
		con.println("Would you like to: A - Play a Quiz, B - View Leaderboard, C - Add Quiz, D - Quit");
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
		}
	}
}
