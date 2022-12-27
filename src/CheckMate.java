
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CheckMate 
{
	public static void checkMate()
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		int tempc,tempd;
		int count=0;
		int kingc = chess.WKingC, kingd = chess.WKingD;
		for(int z = 0;z<8;z++)
		{
		
				tempc = chess.WKingC + ar[z];
				tempd = chess.WKingD  + br[z];
			if(tempc > -1 && tempc < 8 && tempd > -1  && tempd < 8)
			{	
				if(Move.whiteInclude(tempc,tempd) == true)
				{
					count++;
					continue;
				}
				Icon ImageIcon = chess.board[tempc][tempd].getIcon();
				chess.board[tempc][tempd].setIcon(chess.board[chess.WKingC][chess.WKingD].getIcon());
				chess.board[chess.WKingC][chess.WKingD].setIcon(new ImageIcon(""));
				chess.WKingC = tempc;
				chess.WKingD = tempd;
				if(Check.checkWhite() == true)
				{
					count++;
				}
				chess.WKingC = kingc;
				chess.WKingD = kingd;
				chess.board[chess.WKingC][chess.WKingD].setIcon(chess.board[tempc][tempd].getIcon());
					chess.board[tempc][tempd].setIcon(ImageIcon);
			}
			else
			{
				count++;
			}
		}
		if(count==8)
		{
			if(WtestAll()==false)
			{
				System.out.println("CheckMate");
				chess.WcheckMate = true;
			}
		}
	}

	

	private static boolean WtestAll()
	{
		for(int a =0;a< 8;a++)
		  {
		  		for(int b =0;b< 8;b++)
		  		{
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wP.toString()))
		  			{
		  				if(wPtest(a,b))
		  					return true;
		  				
		  			}
		  			// check for every piece if it attacks king and return 
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wR.toString()))
		  			{
		  				if(wRtest(a,b))
		  					return true;
		  				
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wH.toString()))
		  			{
		  				if(wHtest(a,b))
		  					return true;
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wB.toString()))
		  			{
		  				if(wBtest(a,b))
		  					return true;
		  				
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wQ.toString()))
		  			{
		  				if(wQtest(a,b))
		  					return true;
		  			}
		  			
		  		}
		  }
		return false;
	}
	
	private static boolean wPtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canwP(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean wRtest(int a, int b)
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canwR(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean wHtest(int a, int b)
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canwH(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean wBtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canwB(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}
	
	private static boolean wQtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canwQ(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}
	

	private static boolean canwQ(int a, int b,int c,int d) 
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
					if(Move.whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}

		return false;
	}

	private static boolean canwH(int a, int b,int c,int d) 
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c  && b + br[z] == d && Move.whiteInclude(c,d) ==false )
			{
				return true;
			}
		}
		
		return false;
	}

	private static boolean canwB(int a, int b,int c, int d) 
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
					if(Move.whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean canwR(int a ,int b,int c,int d) 
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
					if(Move.whiteInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean canwP(int a ,int b,int c,int d)
	{
		if(a-1 == c && b == d && chess.board[c][d].getIcon().toString().equals(""))
		{
			return true;
		}
		else if(a == 6 && c == 4 && b == d && chess.board[5][b].getIcon().toString().equals("") &&  chess.board[c][d].getIcon().toString().equals(""))
		{
			return true;
		}
		else if(a-1 == c && b + 1 == d && !chess.board[c][d].getIcon().toString().equals("") && Move.whiteInclude(c,d) ==false)
		{
			return true;
		}
		else if(a-1 == c && b - 1 == d && !chess.board[c][d].getIcon().toString().equals("") && Move.whiteInclude(c,d) ==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// -----------------------------------------------BLACK---------------------------------------------------------------------------------

	public static void BcheckMate() 
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		int tempc,tempd;
		int count=0;
		int kingc = chess.BKingC, kingd = chess.BKingD;
		for(int z = 0;z<8;z++)
		{
		
				tempc = chess.BKingC + ar[z];
				tempd = chess.BKingD  + br[z];
			if(tempc > -1 && tempc < 8 && tempd > -1  && tempd < 8)
			{	
				if(Move.blackInclude(tempc,tempd) == true)
				{
					count++;
					continue;
				}
				Icon ImageIcon = chess.board[tempc][tempd].getIcon();
				chess.board[tempc][tempd].setIcon(chess.board[chess.BKingC][chess.BKingD].getIcon());
				chess.board[chess.BKingC][chess.BKingD].setIcon(new ImageIcon(""));
				chess.BKingC = tempc;
				chess.BKingD = tempd;
				if(Check.checkWhite() == true)
				{
					count++;
				}
				chess.BKingC = kingc;
				chess.BKingD = kingd;
				chess.board[chess.BKingC][chess.BKingD].setIcon(chess.board[tempc][tempd].getIcon());
					chess.board[tempc][tempd].setIcon(ImageIcon);
			}
			else
			{
				count++;
			}
		}
		if(count==8)
		{
			if(BtestAll()==false)
			{
				System.out.println("CheckMate");
				chess.BcheckMate = true;
			}
		}
	}

	

	private static boolean BtestAll()
	{
		for(int a =0;a< 8;a++)
		  {
		  		for(int b =0;b< 8;b++)
		  		{
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bP.toString()))
		  			{
		  				if(bPtest(a,b))
		  					return true;
		  				
		  			}
		  			// check for every piece if it attacks king and return 
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bR.toString()))
		  			{
		  				if(bRtest(a,b))
		  					return true;
		  				
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bH.toString()))
		  			{
		  				if(bHtest(a,b))
		  					return true;
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bB.toString()))
		  			{
		  				if(bBtest(a,b))
		  					return true;
		  				
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bQ.toString()))
		  			{
		  				if(bQtest(a,b))
		  					return true;
		  			}
		  			
		  		}
		  }
		return false;
	}
	
	private static boolean bPtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canbP(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkBlack() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean bRtest(int a, int b)
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canbR(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkBlack() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean bHtest(int a, int b)
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canbH(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkBlack() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}



	private static boolean bBtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canbB(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkWhite() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}
	
	private static boolean bQtest(int a, int b) 
	{
		for(int c =0;c< 8;c++)
		  {
		  		for(int d =0;d< 8;d++)
		  		{
		  			if(canbQ(a,b,c,d))
		  			{
		  				Icon ImageIcon = chess.board[c][d].getIcon();
						chess.board[c][d].setIcon(chess.board[a][b].getIcon());
						chess.board[a][b].setIcon(new ImageIcon(""));
						if(Check.checkBlack() == false)
						{

							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
							return true;
						}
							chess.board[a][b].setIcon(chess.board[c][d].getIcon());
							chess.board[c][d].setIcon(ImageIcon);
		  			}
		  		}
		  }
		return false;
	}
	

	private static boolean canbQ(int a, int b,int c,int d) 
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
					if(Move.blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}

		return false;
	}

	private static boolean canbH(int a, int b,int c,int d) 
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == c  && b + br[z] == d && Move.whiteInclude(c,d) ==false )
			{
				return true;
			}
		}
		
		return false;
	}

	private static boolean canbB(int a, int b,int c, int d) 
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
					if(Move.blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean canbR(int a ,int b,int c,int d) 
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
					if(Move.blackInclude(c,d) == false && tempa == c && tempb == d)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals("")&& tempa == c && tempb == d )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean canbP(int a ,int b,int c,int d)
	{
		if(a-1 == c && b == d && chess.board[c][d].getIcon().toString().equals(""))
		{
			return true;
		}
		else if(a == 6 && c == 4 && b == d && chess.board[5][b].getIcon().toString().equals("") &&  chess.board[c][d].getIcon().toString().equals(""))
		{
			return true;
		}
		else if(a-1 == c && b + 1 == d && !chess.board[c][d].getIcon().toString().equals("") && Move.blackInclude(c,d) ==false)
		{
			return true;
		}
		else if(a-1 == c && b - 1 == d && !chess.board[c][d].getIcon().toString().equals("") && Move.blackInclude(c,d) ==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
///////////--------------------------------------------------------------------------------------------------


	private static void disable() 
	{
		for(int a =0;a<8; a++)
		{
			for(int b =0;b<8; b++)
			{
				chess.board[a][b].setEnabled(false);
			}
		}
	}
	
}
