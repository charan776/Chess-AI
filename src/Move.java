

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Move
{
	public static void changeWhite(JButton temp,int a,int b,JButton e,int c,int d)
	{
		Icon ImageIcon = e.getIcon();
		e.setIcon(temp.getIcon());
		temp.setIcon(new ImageIcon(""));
		chess.valid = true;
		if(Check.checkWhite() == true)
		{
			temp.setIcon(e.getIcon());
			e.setIcon(ImageIcon);
			chess.valid = false;
		}
		if(Check.checkBlack() == true)
		{
			System.out.println("Check");
			CheckMate.BcheckMate();
		}
	}
	public static boolean whiteInclude(int c, int d)
	{
		if(!chess.board[c][d].getIcon().toString().equals(chess.wP.toString()) && !chess.board[c][d].getIcon().toString().equals(chess.wR.toString()) && !chess.board[c][d].getIcon().toString().equals(chess.wB.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.wQ.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.wK.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.wH.toString()))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void movewP(JButton temp,int a,int b,JButton e,int c,int d)
	{
		if(a-1 == c && b == d && e.getIcon().toString().equals(""))
		{
			changeWhite( temp, a, b, e, c,d);
		}
		else if(a == 6 && c == 4 && b == d && chess.board[5][b].getIcon().toString().equals("") &&  e.getIcon().toString().equals(""))
		{
			changeWhite( temp, a, b, e, c,d);
		}
		else if(a-1 == c && b + 1 == d && !chess.board[c][d].getIcon().toString().equals("") && whiteInclude(c,d) ==false)
		{
			changeWhite( temp, a, b, e, c,d);
		}
		else if(a-1 == c && b - 1 == d && !chess.board[c][d].getIcon().toString().equals("") && whiteInclude(c,d) ==false)
		{
			changeWhite( temp, a, b, e, c,d);
		}
		
	}
	
	public static void movewB(JButton temp,int a,int b,JButton e,int c,int d)
	{

		int ar[] = {1,-1,1,-1};
		int br[] = {1,-1,-1,1};
		
		for(int z = 0;z<4;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeWhite(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeWhite(temp, a, b, e, c,d);
				}
			}
		}

	}
	
	public static void movewR(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {1,-1,1,-1,0,0,0,0};
		int br[] = {0,0,0,0,1,-1,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeWhite(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeWhite(temp, a, b, e, c,d);
				}
			}
		}
	}
	
	public static void movewH(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c && b + br[z] == d && whiteInclude(c,d) ==false)
			{
				changeWhite( temp, a, b, e, c,d);
			}
		}
	}
	
	public static void movewQ(JButton temp,int a,int b,JButton e,int c,int d)
	{

		int ar[] = {1,-1,1,-1,1,-1,1,-1,0,0,0,0};
		int br[] = {1,-1,-1,1,0,0,0,0,1,-1,1,-1};
		
		for(int z = 0;z<12;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeWhite(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeWhite(temp, a, b, e, c,d);
				}
			}
		}

	}
	
	public static void movewK(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c && b + br[z] == d && whiteInclude(c,d) ==false )
			{
				chess.WKingC = c;
				chess.WKingD = d;
				changeWhite( temp, a, b, e, c,d);
			}
		}
	}
	//--------------------------------------------------BLACK -------------------------------------------------------------------------------------------
	
	public static void changeBlack(JButton temp,int a,int b,JButton e,int c,int d)
	{
		Icon ImageIcon = e.getIcon();
		e.setIcon(temp.getIcon());
		temp.setIcon(new ImageIcon(""));
		chess.valid = true;
		if(Check.checkBlack() == true)
		{
			temp.setIcon(e.getIcon());
			e.setIcon(ImageIcon);
			chess.valid = false;
		}
		if(Check.checkWhite() == true)
		{
			System.out.println("white Check");
			CheckMate.checkMate();
		}
		
	}
	
	public static boolean blackInclude(int c, int d)
	{
		if(!chess.board[c][d].getIcon().toString().equals(chess.bP.toString()) && !chess.board[c][d].getIcon().toString().equals(chess.bR.toString()) && !chess.board[c][d].getIcon().toString().equals(chess.bB.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.bQ.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.bK.toString())&& !chess.board[c][d].getIcon().toString().equals(chess.bH.toString()))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void movebP(JButton temp,int a,int b,JButton e,int c,int d)
	{
		if(a+1 == c && b == d && e.getIcon().toString().equals(""))
		{
			changeBlack( temp, a, b, e, c,d);
		}
		else if(a == 1 && c == 3 && b == d && chess.board[5][b].getIcon().toString().equals("") &&  e.getIcon().toString().equals(""))
		{
			changeBlack( temp, a, b, e, c,d);
		}
		else if(a+1 == c && b + 1 == d && !chess.board[c][d].getIcon().toString().equals("") && blackInclude(c,d) ==false)
		{
			changeBlack( temp, a, b, e, c,d);
		}
		else if(a+1 == c && b - 1 == d && !chess.board[c][d].getIcon().toString().equals("") && blackInclude(c,d) ==false)
		{
			changeBlack( temp, a, b, e, c,d);
		}
		
	}
	
	public static void movebB(JButton temp,int a,int b,JButton e,int c,int d)
	{

		int ar[] = {1,-1,1,-1};
		int br[] = {1,-1,-1,1};
		
		for(int z = 0;z<4;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeBlack(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeBlack(temp, a, b, e, c,d);
				}
			}
		}

	}
	
	public static void movebR(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {1,-1,1,-1,0,0,0,0};
		int br[] = {0,0,0,0,1,-1,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeBlack(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeBlack(temp, a, b, e, c,d);
				}
			}
		}
	}
	
	public static void movebH(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c && b + br[z] == d && blackInclude(c,d) ==false)
			{
				changeBlack( temp, a, b, e, c,d);
			}
		}
	}
	
	public static void movebQ(JButton temp,int a,int b,JButton e,int c,int d)
	{

		int ar[] = {1,-1,1,-1,1,-1,1,-1,0,0,0,0};
		int br[] = {1,-1,-1,1,0,0,0,0,1,-1,1,-1};
		
		for(int z = 0;z<12;z++)
		{
			int tempa=a;
			int tempb=b;
			
			for(int y = 0;y<8;y++)
			{

				tempa = tempa + ar[z];
				tempb = tempb + br[z];
				
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && !chess.board[tempa][tempb].getIcon().toString().equals("") )
				{
					if(blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						changeBlack(temp, a, b, e, c,d);
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						changeBlack(temp, a, b, e, c,d);
				}
			}
		}

	}
	
	public static void movebK(JButton temp,int a,int b,JButton e,int c,int d)
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c && b + br[z] == d && blackInclude(c,d) ==false )
			{
				chess.BKingC = c;
				chess.BKingD = d;
				changeBlack( temp, a, b, e, c,d);
			}
		}
	}
}
