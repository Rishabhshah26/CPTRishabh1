import arc.*;

public class MultChoice{
	public static void main(String[] args){
		Console con = new Console();
		
		String strDecision;
		
		con.println("Would you like to: A - Play a Quiz, B - View Leaderboard, C - Add Quiz, C - Quit");
		strDecision = con.readLine();
		
		if(strDecision.equalsIgnoreCase("A")){
			TextInputFile marvel = new TextInputFile("MCU.txt"); 
		
			String strMCU [][];
			strMCU = new String [13][6];
		

			String strQuestion;
			String strA;
			String strB;
			String strC;
			String strD;
			String strAns = "";
			int intBSort; 
			int intCount = 0;
			
			while(marvel.eof()== false){
				if(intCount >= 13){
					intCount = intCount + 1;
					strQuestion = con.readLine();
					strA = con.readLine();
					strB = con.readLine();
					strC = con.readLine();
					strD = con.readLine();
			
					intBSort = (int)(Math.random()*100+1);
		
		
					strMCU[intCount][0] = strQuestion;
					strMCU[intCount][1] = strA;
					strMCU[intCount][2] = strB;
					strMCU[intCount][3] = strC;
					strMCU[intCount][4] = strD;
					strMCU[intCount][5] = strAns;
					strMCU[intCount][6] = Integer.toString(intBSort);

				}
			
			
		
			}
		}
	}
}
