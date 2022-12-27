

public class Check 
{
	
	public static boolean checkWhite()
	{
		  for(int a =0;a< 8;a++)
		  {
		  		for(int b =0;b< 8;b++)
		  		{
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bP.toString()))
		  			{
		  				if(bPcheck(a,b))
		  					return true;
		  				
		  			}
		  			// check for every piece if it attacks king and return 
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bR.toString()))
		  			{
		  				if(bRcheck(a,b))
		  					return true;
		  				
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bH.toString()))
		  			{
		  				if(bHcheck(a,b))
		  					return true;
		  				
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bB.toString()))
		  			{
		  				if(bBcheck(a,b))
		  					return true;
		  				
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bQ.toString()))
		  			{
		  				if(bQcheck(a,b))
		  					return true;
		  				
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.bK.toString()))
		  			{
		  				if(bKcheck(a,b))
		  					return true;
		  			}
		  		}
		  }
		 
		return false;
	}

	private static boolean bKcheck(int a, int b) 
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == chess.WKingC && b + br[z] == chess.WKingD)
			{
				return true;
			}
		}
		return false;
	}

	private static boolean bQcheck(int a, int b) 
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
					if(tempa == chess.WKingC && tempb == chess.WKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.wK)&& tempa == chess.WKingC && tempb == chess.WKingD )
				{
						return true;
				}
			}
		}

		return false;
	}

	private static boolean bHcheck(int a, int b) 
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == chess.WKingC  && b + br[z] == chess.WKingD )
			{
				return true;
			}
		}
		
		return false;
	}

	private static boolean bBcheck(int a, int b) 
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
					if(tempa == chess.WKingC && tempb == chess.WKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.wK)&& tempa == chess.WKingC && tempb == chess.WKingD )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean bRcheck(int a ,int b) 
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
					if( tempa == chess.WKingC && tempb == chess.WKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.wK)&& tempa == chess.WKingC && tempb == chess.WKingD )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean bPcheck(int a ,int b)
	{
		if(a-1 == chess.WKingC && b + 1 == chess.WKingD)
		{
			return true;
		}
		else if(a-1 == chess.WKingC && b - 1 == chess.WKingD)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
// -----------------------------------------------------------CHECKBLACK-----------------------------------------------------------------------------
	public static boolean checkBlack() 
	{
		  for(int a =0;a< 8;a++)
		  {
		  		for(int b =0;b< 8;b++)
		  		{
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wP.toString()))
		  			{
		  				if(wPcheck(a,b))
		  					return true;
		  				
		  			}
		  			// check for every piece if it attacks king and return 
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wR.toString()))
		  			{
		  				if(wRcheck(a,b))
		  					return true;
		  				
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wH.toString()))
		  			{
		  				if(wHcheck(a,b))
		  					return true;
		  			}
		  			
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wB.toString()))
		  			{
		  				if(wBcheck(a,b))
		  					return true;
		  				
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wQ.toString()))
		  			{
		  				if(wQcheck(a,b))
		  					return true;
		  			}
		  			if(chess.board[a][b].getIcon().toString().equals(chess.wK.toString()))
		  			{
		  				if(wKcheck(a,b))
		  					return true;
		  				
		  			}
		  		}
		  }
		 
		return false;
	}
	private static boolean wKcheck(int a, int b) 
	{
		int ar[] = {1,-1,-1,1,1,-1,0,0};
		int br[] = {1,-1,1,-1,0,0,1,-1};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == chess.BKingC && b + br[z] == chess.BKingD)
			{
				return true;
			}
		}
		return false;
	}

	private static boolean wQcheck(int a, int b) 
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
					if(tempa == chess.BKingC && tempb == chess.BKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.bK)&& tempa == chess.BKingC && tempb == chess.BKingD )
				{
						return true;
				}
			}
		}

		return false;
	}

	private static boolean wHcheck(int a, int b) 
	{
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if(a + ar[z] == chess.BKingC  && b + br[z] == chess.BKingD )
			{
				return true;
			}
		}
		
		return false;
	}

	private static boolean wBcheck(int a, int b) 
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
					if(tempa == chess.BKingC && tempb == chess.BKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.bK)&& tempa == chess.BKingC && tempb == chess.BKingD )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean wRcheck(int a ,int b) 
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
					if( tempa == chess.BKingC && tempb == chess.BKingD)
					{
						return true;
					}
					break;
				}
				if(tempa >-1 && tempa < 8 && tempb >-1 && tempb < 8 && chess.board[tempa][tempb].getIcon().toString().equals(chess.bK)&& tempa == chess.BKingC && tempb == chess.BKingD )
				{
						return true;
				}
			}
		}
		return false;
	}

	private static boolean wPcheck(int a ,int b)
	{
		if(a-1 == chess.BKingC && b + 1 == chess.BKingD)
		{
			return true;
		}
		else if(a-1 == chess.BKingC && b - 1 == chess.BKingD)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
