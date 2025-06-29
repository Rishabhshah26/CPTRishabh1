// Rishabh Shah
//Trivia Legends Multiple Choice
//June 12th, 2025
// Version Number 1.0 

import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class MultChoice{
	public static void main(String[] args){
		Console con = new Console("MultChoice", 1280, 780);
		con.println("\n\n\n\n\n\n\nWelcome to...");
		BufferedImage trivialogo = con.loadImage("trivialogo.png");
		con.drawImage(trivialogo, 40, 0);
		int intCorrect = 0;
		int intCount = 0;

		
		TextOutputFile scorelist = new TextOutputFile("leaderboard.txt", true);
		// opening leaderboard file to write
		
		
		String strDecision;
		
		String strDecision2;
		
		String strScoreLine;
		String strHelpDecision;
		String strName;
		String strQuestion;
		String strA;
		String strB;
		String strC;
		String strD;
		String strAns = "";
		String strSelect;
		int intBSort; 
		int intSpot;
		double dblpercent = 0;
		
		con.println("\n\n\n\n\n\n\n\nWould you like to: \nA          - Play a Quiz, \nB          - View Leaderboard, \nC          - Add Quiz, \nD          - Quit, \nH          - Help");
		strDecision = con.readLine();
		
		if(strDecision.equalsIgnoreCase("A")){	
			
			con.println("A - MCU, B - Countries, C - Sports, D - New Quiz");
			strDecision2 = con.readLine();
			
			if(strDecision2.equalsIgnoreCase("A")){
			
			
		
				String strMCU [][];
				strMCU = new String [5][12];
				// creating MCU Array

				con.println("What is your name?");
				strName = con.readLine();	
				TextInputFile marvel = new TextInputFile("MCU.txt");	


				
				
			
				while(marvel.eof()!= true){

					strQuestion = marvel.readLine();
					strA = marvel.readLine();
					strB = marvel.readLine();
					strC = marvel.readLine();
					strD = marvel.readLine();
					strAns = marvel.readLine();
					
					con.println("Your name is: "+strName);
					
					


					con.println(strQuestion);
					con.println(strA);
					con.println(strB);
					con.println(strC);
					con.println(strD);
					strSelect = con.readLine();
					
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
//					intBSort = (int)(Math.random()*100+1);
		
		
/*					strMCU[0][intCount] = strQuestion;
					strMCU[1][intCount] = strA;
					strMCU[2][intCount] = strB;
					strMCU[3][intCount] = strC;
					strMCU[4][intCount] = strD;
					strMCU[5][intCount] = strAns;
//					strMCU[6][intCount] = Integer.toString(intBSort);

*/

						 
						 
						// sorting array
						
//						if(Integer.parseInt(strMCU[6][intCount]) > Integer.parseInt(strMCU[6][intCount + 1])){
	//						intSpot = Integer.parseInt(strMCU[6][intCount]);
		//					strMCU[6][intCount + 1] = strMCU[6][intCount];
			//				strMCU[6][intCount] = Integer.toString(intSpot);
				//		} 

					intCount ++;





					if(strSelect.equalsIgnoreCase(strAns)){
						
						con.println("Correct!"); 
						intCorrect = intCorrect + 1;
						dblpercent = (double)intCorrect/intCount;
						
					}else{
						con.println("False...");
						dblpercent = (double)intCorrect/intCount;
						
					}

								
					con.println("Your current score is: " +intCorrect +" / "+intCount);
					
 
				} 
				if(strName.equalsIgnoreCase("statitan") && intCorrect < 10){
					intCorrect = intCorrect + 2;
				}
				System.out.println("Score checkpoint");
				con.println("Your final score was " +intCorrect +" / "+intCount);
				scorelist.println("MCU Quiz: "+strName +" - " +intCorrect +"/"+intCount);
				marvel.close();

				
			} else if(strDecision2.equalsIgnoreCase("B")){
					
				String strCountries [][];
				strCountries = new String [5][9];

				con.println("What is your name?");
				strName = con.readLine();	
				TextInputFile capitals = new TextInputFile("countries.txt");	


				
				
			
				while(capitals.eof()!= true){

					strQuestion = capitals.readLine();
					strA = capitals.readLine();
					strB = capitals.readLine();
					strC = capitals.readLine();
					strD = capitals.readLine();
					strAns = capitals.readLine();
					
					con.println("Your name is: "+strName);
					
					


					con.println(strQuestion);
					con.println(strA);
					con.println(strB);
					con.println(strC);
					con.println(strD);
					strSelect = con.readLine();
					
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
//					intBSort = (int)(Math.random()*100+1);
		
		
/*					strMCU[0][intCount] = strQuestion;
					strMCU[1][intCount] = strA;
					strMCU[2][intCount] = strB;
					strMCU[3][intCount] = strC;
					strMCU[4][intCount] = strD;
					strMCU[5][intCount] = strAns;
//					strMCU[6][intCount] = Integer.toString(intBSort);

*/

						 
						 
						// sorting array
						
//						if(Integer.parseInt(strMCU[6][intCount]) > Integer.parseInt(strMCU[6][intCount + 1])){
	//						intSpot = Integer.parseInt(strMCU[6][intCount]);
		//					strMCU[6][intCount + 1] = strMCU[6][intCount];
			//				strMCU[6][intCount] = Integer.toString(intSpot);
				//		} 

					intCount ++;





					if(strSelect.equalsIgnoreCase(strAns)){
						
						con.println("Correct!"); 
						intCorrect = intCorrect + 1;
						dblpercent = (double)intCorrect/intCount;
						
					}else{
						con.println("False...");
						dblpercent = (double)intCorrect/intCount;
						
					}

								
					con.println("Your current score is: " +intCorrect +" / "+intCount);
					
 
				} 
				if(strName.equalsIgnoreCase("statitan") && intCorrect < 7){
					intCorrect = intCorrect + 2;
				}
				System.out.println("Score checkpoint");
				con.println("Your final score was " +intCorrect +" / "+intCount);
				scorelist.println("Countries Quiz: "+strName +" - " +intCorrect +"/"+intCount);
				capitals.close();

			} else if(strDecision2.equalsIgnoreCase("C")){
					
				String strSports [][];
				strSports = new String [5][9];

				con.println("What is your name?");
				strName = con.readLine();	
				TextInputFile sports = new TextInputFile("Sports.txt");	


				
				
			
				while(sports.eof()!= true){

					strQuestion = sports.readLine();
					strA = sports.readLine();
					strB = sports.readLine();
					strC = sports.readLine();
					strD = sports.readLine();
					strAns = sports.readLine();
					
					con.println("Your name is: "+strName);
					
					


					con.println(strQuestion);
					con.println(strA);
					con.println(strB);
					con.println(strC);
					con.println(strD);
					strSelect = con.readLine();
					
					con.setDrawColor(Color.BLACK);
					con.fillRect(0, 0, 1280, 720);
//					intBSort = (int)(Math.random()*100+1);
		
		
/*					strMCU[0][intCount] = strQuestion;
					strMCU[1][intCount] = strA;
					strMCU[2][intCount] = strB;
					strMCU[3][intCount] = strC;
					strMCU[4][intCount] = strD;
					strMCU[5][intCount] = strAns;
//					strMCU[6][intCount] = Integer.toString(intBSort);

*/

						 
						 
						// sorting array
						
//						if(Integer.parseInt(strMCU[6][intCount]) > Integer.parseInt(strMCU[6][intCount + 1])){
	//						intSpot = Integer.parseInt(strMCU[6][intCount]);
		//					strMCU[6][intCount + 1] = strMCU[6][intCount];
			//				strMCU[6][intCount] = Integer.toString(intSpot);
				//		} 

					intCount ++;





					if(strSelect.equalsIgnoreCase(strAns)){
						
						con.println("Correct!"); 
						intCorrect = intCorrect + 1;
						dblpercent = (double)intCorrect/intCount;
						
					}else{
						con.println("False...");
						dblpercent = (double)intCorrect/intCount;
						
					}

								
					con.println("Your current score is: " +intCorrect +" / "+intCount);
					
 
				} 
				if(strName.equalsIgnoreCase("statitan") && intCorrect < 7){
					intCorrect = intCorrect + 2;
				}
				System.out.println("Score checkpoint");
				con.println("Your final score was " +intCorrect +" / "+intCount);
				
				scorelist.println("Sports Quiz: "+strName +" - " +intCorrect +"/"+intCount);
				sports.close();
				}else{


					con.println("What is your name?");
					strName = con.readLine();	
					TextInputFile newquizquiz = new TextInputFile("NewQuiz1.txt");	


				
				
			
						while(newquizquiz.eof()!= true){
	
						strQuestion = newquizquiz.readLine();
						strA = newquizquiz.readLine();
						strB = newquizquiz.readLine();
						strC = newquizquiz.readLine();
						strD = newquizquiz.readLine();
						strAns = newquizquiz.readLine();
					
						con.println("Your name is: "+strName);
					
					


						con.println(strQuestion);
						con.println(strA);
						con.println(strB);
						con.println(strC);
						con.println(strD);
						strSelect = con.readLine();
					
						con.setDrawColor(Color.BLACK);
						con.fillRect(0, 0, 1280, 720);
						intCount ++;

						if(strSelect.equalsIgnoreCase(strAns)){
						
							con.println("Correct!"); 
							intCorrect = intCorrect + 1;
							dblpercent = (double)intCorrect/intCount;
						
						}else{
							con.println("False...");
							dblpercent = (double)intCorrect/intCount;
						
						}

								
						con.println("Your current score is: " +intCorrect +" / "+intCount);

					
 
				}
			} 
				if(strName.equalsIgnoreCase("statitan") && intCorrect < 7){
					intCorrect = intCorrect + 2;
				}
				System.out.println("Score checkpoint");
				con.println("Your final score was " +intCorrect +" / "+intCount);
				
				scorelist.println("Sports Quiz: "+strName +" - " +intCorrect +"/"+intCount);

		}else if(strDecision.equalsIgnoreCase("H")){
			
				con.println("Which quiz did you need help with? A - MCU, B - Countries, C - Sports");
				strHelpDecision = con.readLine();
			
				if(strHelpDecision.equalsIgnoreCase("A")){
					con.println("The MCU is currently in Phase 5. Also, recall the real birthplace of Loki...");
				} else if(strHelpDecision.equalsIgnoreCase("B")){
					con.println("The Capital of Brazil is actually not Rio De Janeiro. \nThe Capital of Belgium is also the name of a sprout vegetable");
				} else{ 
					con.println("Many people believe that Nikola Jokic deserved the MVP award over the \nCanadian shooting Guard on Oklahoma City. Lionel Messi rejected a roughly \n$1 Billion contract from Al Hilal to move to the South Eastern corner of the USA.");
				}
		
			} else if(strDecision.equalsIgnoreCase("B")){
				TextInputFile scorereader = new TextInputFile("leaderboard.txt");
			while(scorereader.eof()!= true){
				strScoreLine = scorereader.readLine();
				con.println(strScoreLine);
		}
			
			
		} else if(strDecision.equalsIgnoreCase("C")){
			TextOutputFile newquizquiz = new TextOutputFile("NewQuiz1.txt", true);	
			String strChoice;
			int intCount2 = 0;
			while(intCount2 < 20){
				intCount2 = intCount2 +1;
				con.println("do you want to add another question? Y for yes, N for no");
				strChoice = con.readLine();
		if(strChoice.equalsIgnoreCase("Y")){
			String strQuizQuestion;
			String strQuizA;
			String strQuizB;
			String strQuizC;
			String strQuizD;
			String strQuizAns;
			con.println("Enter the options in the format, \nA - Option 1 \n B - Option 2 etc.");
			con.println("Enter a question");
			strQuizQuestion = con.readLine();
			con.println("Enter the 1st option");
			strQuizA = con.readLine();
			con.println("Enter the 2nd option");
			strQuizB = con.readLine();
			con.println("Enter the 3rd option");
			strQuizC = con.readLine();
			con.println("Enter the 4th option");
			strQuizD = con.readLine();
			con.println("Enter the A, B, C, D, of the correct answer");
			strQuizAns = con.readLine();	
		
			newquizquiz.println(strQuizQuestion);
			newquizquiz.println(strQuizA);
			newquizquiz.println(strQuizB);
			newquizquiz.println(strQuizC);
			newquizquiz.println(strQuizD);
			newquizquiz.close();
		}	
		}
		}else{ 
			
			
		}
		

		
		
	}
	
}	//scorelist.close();
	

