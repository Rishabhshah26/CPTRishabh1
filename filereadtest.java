import arc.*;

public class filereadtest{
	public static void main(String[] args){
		Console con = new Console();
		
		TextInputFile marvel = new TextInputFile("MCU.txt"); 
		
		String strName = "";
		
		String strName1 = "";
		String strParty = "";
		
		con.println("hello");
		
		while(marvel.eof()== false){
			strName = con.readLine();
			strName1 = con.readLine();
			strParty = con.readLine();
			
			
			con.println("President Name: "+strName);
			con.println("President Name: "+strName1);
			con.println("President Name: "+strParty);
		}
		
	}
}
