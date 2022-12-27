import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class computer 
{
	static int globalDepth =6;
	public static void Computer()
	{
		if(chess.whitemove == true)
		{
			int tempWKC = chess.WKingC,tempWKD = chess.WKingD,tempBKC=chess.BKingC,tempBKD=chess.BKingD;

			JButton[][] tempar = new JButton[8][8];

			tempar = comp.setTemp();
			String a = BAlphaBeta(6,1000000,-1000000,"",true);
			comp.setBoard(tempar);
			
			chess.WKingC = tempWKC ;
			chess.WKingD = tempWKD;
			chess.BKingC = tempBKC;
			chess.BKingD = tempBKD;

           makemove(a.substring(0,4));
		}
		// Analyze ALPHABETA
		
	}
	
	public static String BAlphaBeta(int depth, int beta, int alpha,String move,boolean minmax)
	{
		String list;
		if(minmax == true && chess.whitemove == true)
			 list= BposibleMoves();
		else if(minmax == false && chess.whitemove == true)
			 list= WposibleMoves();
		else if(minmax == true && chess.whitemove == false)
			 list= WposibleMoves();
		else
			 list= BposibleMoves();
		
		
        if (depth==0 || list.length() ==0 ) 
        {
;
        	return move+(Rating.rating(list.length(), depth));
        }
      //  list=sortMoves(list);

  	  // 	 System.out.println(list);
       
        for (int i=0;i<list.length();i+=4) 
        {

      	//   	 System.out.println(list.substring(i,i+4) + " " + i + " " + list.length());

        	makemove(list.substring(i,i+4));
        	String returnString;
            if(minmax ==false)
                minmax=true;
            else
            	minmax=false;
            

            returnString=BAlphaBeta(depth-1, beta, alpha, list.substring(i,i+4), minmax);
            
            int value=Integer.valueOf(returnString.substring(4));
            
            
            undoMove(list.substring(i,i+4));
            if (minmax==false) 
            {
                if (value<=beta)
                {
                	beta=value; 
                	if (depth==globalDepth) 
                	{
                		move=returnString.substring(0,4);
               		}
                }
            } 
            else
            {
                if (value>alpha) 
                {
                	alpha=value; 
                	if (depth==globalDepth) 
                	{
                		move=returnString.substring(0,4);
                	}
                }
            }
            if (alpha>=beta)
            {
                if (minmax == false) 
                {

               	 System.out.println( beta + "a");
                	return move+beta;
               	}
                else 
                {

                  	 System.out.println(alpha + "b");
                	return move+alpha;
                }
            }
        }
        if (minmax == false) 
        {

       	 System.out.println(beta+ "c");
        	return move+beta;
        }
        else 
        {

       	 System.out.println(alpha + "d");
        	return move+alpha;
        }
		
	}

	private static String WposibleMoves() 
	{
		String list="";
        for (int i=0; i<64; i++) 
        {
            switch (chess.board[i/8][i%8].getIcon().toString()) 
            {
            case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wP.png": list+=posibleP(i,true);
            break;
        case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wR.png": list+=posibleR(i,true);
            break;
        case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wH.png": list+=posibleH(i,true);
            break;
        case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wB.png": list+=posibleB(i,true);
            break;
        case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wQ.png": list+=posibleQ(i,true);
            break;
        case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wK.png": list+=posibleA(i,true);
            break;
            }
        }
		return list;
	}

	private static String BposibleMoves() 
	{
		String list="";
        for (int i=0; i<64; i++) 
        {
            switch (chess.board[i/8][i%8].getIcon().toString()) 
            {
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bP.png": list+=posibleP(i,false);
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bR.png": list+=posibleR(i,false);
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bH.png": list+=posibleH(i,false);
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bB.png": list+=posibleB(i,false);
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bQ.png": list+=posibleQ(i,false);
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bK.png": list+=posibleA(i,false);
                    break;
            }
        }

		return list;
	}
	private static String posibleQ(int i, boolean b) 
	{

		String list="";
        int r=i/8, c=i%8;
        int tem=1;
        JButton temp,e;
        temp=chess.board[r][c];
        for (int j=-1; j<=1; j++) {
            for (int k=-1; k<=1; k++) {
                if (j!=0 || k!=0) {
                    try {
                        while(" ".equals(chess.board[r+tem*j][c+tem*k].getIcon().toString()))
                        {
                        	e=chess.board[r+tem*j][c+tem*k];	
                        	Icon ImageIcon = e.getIcon();
                    		e.setIcon(temp.getIcon());
                    		temp.setIcon(new ImageIcon(""));
                    		if(Check.checkBlack() == false)
                    		{
                                list=list+r+c+(r+tem*j)+(c+tem*k);
                    		}
                    		temp.setIcon(e.getIcon());
                			e.setIcon(ImageIcon);
                            
                        }
                        if (Move.whiteInclude(r+tem*j, c+tem*k)) 
                        {
                        	e=chess.board[r+tem*j][c+tem*k];	
                        	Icon ImageIcon = e.getIcon();
                    		e.setIcon(temp.getIcon());
                    		temp.setIcon(new ImageIcon(""));
                    		if(Check.checkBlack() == false)
                    		{
                                list=list+r+c+(r+tem*j)+(c+tem*k);
                    		}
                    		temp.setIcon(e.getIcon());
                			e.setIcon(ImageIcon);
                            
                        }
                    } catch (Exception e1) {}
                    tem=1;
                }
            }
        }

        return list;
	}

	private static String posibleA(int i, boolean b)
	{
		String list="";
		int r=i/8, c=i%8;
        JButton temp,e;
        temp=chess.board[r][c];
		
		for (int j=-1; j<=1; j+=2) {
        for (int k=-1; k<=1; k+=2) {
            try {
                if (Move.whiteInclude(r+j,c+k*2) || " ".equals(chess.board[r+j][c+k*2].getIcon().toString())) 
                {
                	e=chess.board[r+j][c+k*2];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		if(Check.checkBlack() == false)
            		{
                        list=list+r+c+(r+j)+(c+k*2);
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
                    
                }
            } catch (Exception e1) {}
            try {
                if (Move.whiteInclude(r+j*2,c+k) || " ".equals(chess.board[r+j*2][c+k].getIcon().toString())) {
                	e=chess.board[r+j*2][c+k];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		if(Check.checkBlack() == false)
            		{
                        list=list+r+c+(r+j*2)+(c+k);
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
                    
                }
            } catch (Exception e1) {}
        }
    }
    return list;
	}

	private static String posibleH(int i, boolean b) 
	{
		String list="";
        int r=i/8, c=i%8;
        JButton temp,e;
        temp=chess.board[r][c];

    	temp=chess.board[r][c];
        if(b==false)
        {
		int ar[] = {2,2,-2,-2,1,-1,1,-1};
		int br[] = {1,-1,1,-1,2,2,-2,-2};
		
		for(int z = 0;z<8;z++)
		{
			if( Move.blackInclude(r + ar[z] ,c + br[z]) ==false)
			{
				e=chess.board[r+ar[z]][c+br[z]];
            	Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		if(Check.checkBlack() == false)
        		{
                    list=list+r+c+(r+ar[z])+(c+br[z]);
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);
			}
		}
        }

        return list;
	}

	private static String posibleB(int i, boolean b) 
	{
		String list="";
        int r=i/8, c=i%8;
        int tem=1;
        JButton temp,e;

    	temp=chess.board[r][c];
        if(b==false)
        {
        for (int j=-1; j<=1; j+=2) {
            for (int k=-1; k<=1; k+=2) {
                try {
                    while(" ".equals(chess.board[r+tem*k][c+tem*k].getIcon().toString()))
                    {
                    	e=chess.board[r+tem*j][c+tem*k];
                    	Icon ImageIcon = e.getIcon();
                		e.setIcon(temp.getIcon());
                		temp.setIcon(new ImageIcon(""));
                		if(Check.checkBlack() == false)
                		{
                            list=list+r+c+(r+tem*j)+(c+tem*k);
                		}
                		temp.setIcon(e.getIcon());
            			e.setIcon(ImageIcon);
                		
                        tem++;
                    
                        
                    }
                    if (Move.whiteInclude(r+tem*j,c+tem*k)) 
                    {
                    	e=chess.board[r+tem*j][c+tem*k];
                    	Icon ImageIcon = e.getIcon();
                		e.setIcon(temp.getIcon());
                		temp.setIcon(new ImageIcon(""));
                		if(Check.checkBlack() == false)
                		{
                            list=list+r+c+(r+tem*j)+(c+tem*k);
                		}
                		temp.setIcon(e.getIcon());
            			e.setIcon(ImageIcon);
                		
                    }
                } catch (Exception e1) {}
                tem=1;
            }
        }
        }
        return list;
	}

	private static String posibleP(int i,boolean white) 
	{
		String list="";
        int r=i/8, c=i%8;
        JButton temp,e;

    	temp =chess.board[r][c];
		if(white ==false)
		{
			if(r+1 < 8 && chess.board[r+1][c].getIcon().toString().equals(""))
			{
            	e=chess.board[r+1][c];

				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r+1) +c;	
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);			
			}
			if(r ==  1 && chess.board[r+1][c].getIcon().toString().equals("")  && chess.board[r+2][c].getIcon().toString().equals(""))
			{
            	e=chess.board[3][c];

				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r+2) +c;	
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
			if(r+1 < 8 && c+1 <8 && !chess.board[r+1][c+1].getIcon().toString().equals("") && Move.blackInclude(r+1,c+1) ==false)
			{
            	e=chess.board[r+1][c+1];
				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r+1) +(c+1);
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
			if(r+1 < 8 && c-1 >-1 && !chess.board[r+1][c-1].getIcon().toString().equals("") && Move.blackInclude(r+1,c-1) ==false)
			{
            	e=chess.board[r+1][c-1];

				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r+1) +(c-1);
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
		}
		else
		{		
			if(r-1 >-1  && chess.board[r-1][c].getIcon().toString().equals(""))
			{
            	e=chess.board[r-1][c];

				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r-1) +c;	
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);			
			}
			if(r ==  6 && chess.board[r-1][c].getIcon().toString().equals("")  && chess.board[r-2][c].getIcon().toString().equals(""))
			{
            	e=chess.board[4][c];

				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r-2) +c;	
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
			if(r-1 >-1 && c+1 <8 && !chess.board[r-1][c+1].getIcon().toString().equals("") && Move.blackInclude(r-1,c+1) ==false)
			{
            	e=chess.board[r-1][c+1];
				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r-1) +(c+1);
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
			if(r-1  >-1 && c-1 >-1 && !chess.board[r-1][c-1].getIcon().toString().equals("") && Move.blackInclude(r-1,c-1) ==false)
			{
            	e=chess.board[r-1][c-1];
				Icon ImageIcon = e.getIcon();
        		e.setIcon(temp.getIcon());
        		temp.setIcon(new ImageIcon(""));
        		chess.valid = true;
        		if(Check.checkBlack() == false)
        		{
					list= list+ r+c+(r-1) +(c-1);
        		}
        		temp.setIcon(e.getIcon());
    			e.setIcon(ImageIcon);		
			}
		
		}

		return list;
	}
	
	private static String posibleR(int i, boolean b) 
	{
		String list="";
        int r=i/8, c=i%8;
		int tem =1;
		JButton temp,e;
		
    	temp = chess.board[r][c];
		if(b==false)
		{
		for (int j=-1; j<=1; j+=2) {
            try {
                while("".equals(chess.board[r][c+tem*j].getIcon().toString()))
                {
                	e=chess.board[r][c+tem*j];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		chess.valid = true;
            		if(Check.checkBlack() == false)
            		{

            			list=list+r+c+r+(c+tem*j);
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
            		
                    tem++;
                }
                if (Move.blackInclude(r,c+tem*j) == false) 
                {
                	e=chess.board[r][c+tem*j];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		chess.valid = true;
            		if(Check.checkBlack() == false)
            		{

            			list=list+r+c+r+(c+tem*j);
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
                }
            } catch (Exception e1) {}
            tem=1;
            try {
                while("".equals(chess.board[r+tem*j][c].getIcon().toString()))
                {
                	e=chess.board[r+tem*j][c];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		chess.valid = true;
            		if(Check.checkBlack() == false)
            		{

            			list=list+r+c+(r+tem*j)+c;
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
            		
                    tem++;
                }
                if (Move.blackInclude(r+tem*j,c) == false) 
                {
                	e=chess.board[r+tem*j][c];
                	Icon ImageIcon = e.getIcon();
            		e.setIcon(temp.getIcon());
            		temp.setIcon(new ImageIcon(""));
            		chess.valid = true;
            		if(Check.checkBlack() == false)
            		{
            			
            			list=list+r+c+(r+tem*j)+c;
            		}
            		temp.setIcon(e.getIcon());
        			e.setIcon(ImageIcon);
                }
            } catch (Exception e1) {}
            tem=1;
        }
	}
		else
		{
			
		}

		return list;
	}
	
// -----------------------------------------------------------------------------------------------------------------------
	private static void makemove(String substring) 
	{
		String ar = substring.substring(0,4);
		int tem = Integer.parseInt(ar);
		JButton temp,e;
		int d = tem%10,c = (tem/10)%10,b = (tem/100)%10,a = (tem/1000)%10;

		temp = chess.board[a][b];
		e = chess.board[c][d];
		if(temp.getIcon().toString().equals(chess.wP))
		{
			Move.movewP(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.wH.toString()))
		{
			Move.movewH(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.wB))
		{
			Move.movewB(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.wR))
		{
			Move.movewR(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.wQ))
		{
			Move.movewQ(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.wK))  
		{
			Move.movewK(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bP))
		{
			Move.movebP(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bH.toString()))
		{
			Move.movebH(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bB))
		{
			Move.movebB(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bR))
		{
			Move.movebR(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bQ))
		{
			Move.movebQ(temp,a,b,e,c,d);
		}
		else if(temp.getIcon().toString().equals(chess.bK))  
		{
			Move.movebK(temp,a,b,e,c,d);
		}
	
	}
	
	private static void undoMove(String substring) 
	{
		String ar = substring.substring(0,4);
		int tem = Integer.parseInt(ar);
		JButton temp,e;
		int a = tem%10,b = (tem/10)%10,c = (tem/100)%10,d = (tem/1000)%10;
		temp = chess.board[c][d];
		e = chess.board[a][b];
		Icon ImageIcon = e.getIcon();
		e.setIcon(temp.getIcon());
		temp.setIcon(new ImageIcon(""));
		
	}
}
