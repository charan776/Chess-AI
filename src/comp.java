import javax.swing.ImageIcon;
import javax.swing.JButton;

public class comp
{
		public static void Computer()
		{
			int best =Integer.MIN_VALUE;
			int beta =Integer.MAX_VALUE;
			int score =0;
			int tempa=1,tempb=1,tempc=2,tempd=1,tempWKC = 0,tempWKD = 0,tempBKC=0,tempBKD=0;
			JButton temp,e;
			JButton[][] tempar = new JButton[8][8];
			chess.valid =false;
			for(int a =0; a<8; a++)
			{
				for(int b =0; b<8; b++)
				{
					if(!chess.board[a][b].getIcon().toString().equals(""))
					{
						for(int c =0; c<8; c++)
						{
							for(int d =0; d<8; d++)
							{
								
								tempar = setTemp();
								temp = chess.board[a][b];
								e = chess.board[c][d];
								tempWKC = chess.WKingC;
								tempWKD = chess.WKingD;
								tempBKC = chess.BKingC;
								tempBKD = chess.BKingD;
								
								if(chess.whitemove == true)
								{
									if(Move.blackInclude(c,d) == false)
									{
									if(temp.getIcon().toString().equals(chess.bP))
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
									System.out.println(a + " " + b + " " + c+" " + d );
									if(chess.valid == true)
									{

										System.out.println("ins");
										score = minmax(2,false,best,beta);
										System.out.println(score);
										if(score>best)
										{
											best = score;
											tempa = a;
											tempb = b;
											tempc = c;
											tempd=d;
										}
										chess.valid = false;

							//			setBoard(tempar);

										chess.WKingC = tempWKC;
										chess.WKingD = tempWKD;
										chess.BKingC = tempBKC;
										chess.BKingD =  tempBKD;
									}
								}
								}
								else if(chess.whitemove == false)
								{
									if(Move.whiteInclude(c,d) == false)
									{
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
								
								if(chess.valid == true)
								{
									score = minmax(2,false,best,beta);
									
									if(score>best)
									{
										best = score;
										tempa = a;
										tempb = b;
										tempc = c;
										tempd=d;
									}
									chess.valid = false;

									setBoard(tempar);

									chess.WKingC = tempWKC;
									chess.WKingD = tempWKD;
									chess.BKingC = tempBKC;
									chess.BKingD =  tempBKD;
								}
								}
								}
							}
						}
					}
				}
			}
		
			temp = chess.board[tempa][tempb];
			e = chess.board[tempc][tempd];
			if(chess.whitemove == true)
			{
				if(temp.getIcon().toString().equals(chess.bP))
				{
					Move.movebP(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.bH.toString()))
				{
					Move.movebH(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.bB))
				{
					Move.movebB(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.bR))
				{
					Move.movebR(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.bQ))
				{
					Move.movebQ(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.bK))  
				{
					Move.movebK(temp,tempa,tempb,e,tempc,tempd);
				}
			}
			else if(chess.whitemove == false)
			{
				if(temp.getIcon().toString().equals(chess.wP))
				{
					Move.movewP(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.wH.toString()))
				{
					Move.movewH(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.wB))
				{
					Move.movewB(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.wR))
				{
					Move.movewR(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.wQ))
				{
					Move.movewQ(temp,tempa,tempb,e,tempc,tempd);
				}
				else if(temp.getIcon().toString().equals(chess.wK))  
				{
					Move.movewK(temp,tempa,tempb,e,tempc,tempd);
				}
			}
			System.out.println(tempa+" "+ tempb+" "+ tempc+" "+ tempd);
			System.out.println(tempWKC+" "+ tempWKD+" "+ tempBKC+" "+ tempBKD);
		}

		private static int minmax(int depth, boolean minimax,int best,int beta) 
		{
			JButton temp,e;
			if(depth==0)
			{
				return rating();
			}
			
			if(minimax)
			{
				for(int a =0; a<8; a++)
				{
					for(int b =0; b<8; b++)
					{				
					if(!chess.board[a][b].getIcon().toString().equals(""))
					{
						for(int c =0; c<8; c++)
						{
							for(int d =0; d<8; d++)
							{
								JButton[][] tempar = new JButton[8][8];
								tempar = setTemp();
								temp = chess.board[a][b];
								e = chess.board[c][d];
								if(chess.whitemove == true)
								{
									if(Move.blackInclude(c,d) == false)
									{
									if(temp.getIcon().toString().equals(chess.bP))
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
									System.out.println(a + " " + b + " " + c+" " + d );
									if(chess.valid == true)
									{

										System.out.println("ins");
										int score = minmax(depth -1,false,best,beta);
										best = (int) Math.max(best, score);	
										chess.valid = false;
										
									       if (best >= beta) 
							                {
							                    break;
							                }

										}
									}
								}
								else if(chess.whitemove == false)
								{
									if(Move.whiteInclude(c,d) == false)
									{
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
									System.out.println(a + " " + b + " " + c+" " + d );
									if(chess.valid == true)
									{

										System.out.println("ins");
									int score = minmax(depth -1,false,best,beta);
									best = (int) Math.max(best, score);	
									chess.valid = false;
									
								       if (best >= beta) 
						                {
						                    break;
						                }

									}
									}
								}
							}
						}
			         
					}
				}
				}
				return best;
				
			}
			else
			{
				for(int a =0; a<8; a++)
				{
					for(int b =0; b<8; b++)
					{
						if(!chess.board[a][b].getIcon().toString().equals(""))
						{
							for(int c =0; c<8; c++)
							{
								for(int d =0; d<8; d++)
								{
									JButton[][] tempar = new JButton[8][8];
									tempar = setTemp();
									temp = chess.board[a][b];
									e = chess.board[c][d];
									if(chess.whitemove == true)
									{
										if(Move.whiteInclude(c,d) == false)
										{
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
										System.out.println(a + " " + b + " " + c+" " + d );
										if(chess.valid == true)
										{
											System.out.println("ins");
										int score = minmax(depth -1,true,best,beta);
								
											beta = (int) Math.min(beta, score);
											chess.valid=false;
								            if (best >= beta)
								            {
								                break;
								            }

										}
										}
									}
									else if(chess.whitemove == false)
									{
										if(Move.blackInclude(c,d) == false)
										{
										if(temp.getIcon().toString().equals(chess.bP))
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
										if(chess.valid == true)
										{
									int score = minmax(depth -1,true,best,beta);
							
										beta = (int) Math.min(beta, score);
										chess.valid=false;
							            if (best >= beta)
							            {
							                break;
							            }

									}
									}
									}
								}
								}
							}
					}
				}
				return beta;
			}
			
		}

	
	
	private static int rating() 
	{
		
		int count =0;
		
		if(chess.whitemove == true)
		{
		
		for(int a =0; a<8; a++)
		{
			for(int b =0; b<8; b++)
			{
				if(chess.board[a][b].getIcon().toString().equals(chess.bP.toString()))
				{
					count += 1;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bB.toString()))
				{
					count += 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bR.toString()))
				{
					count += 5;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bH.toString()))
				{
					count += 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bQ.toString()))
				{
					count += 9;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wP.toString()))
				{
					count -= 1;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wB.toString()))
				{
					count -= 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wR.toString()))
				{
					count -= 5;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wH.toString()))
				{
					count -= 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wQ.toString()))
				{
					count -= 9;
				}
			}
		}
		
			if( chess.WcheckMate ==  true)
			{
				count += 1000;
			}
			if( chess.BcheckMate ==  true)
			{
				count -= 1000;
			}
		}
		///-----------------------------------------------------------BLACK------------------------------
		if(chess.whitemove == false)
		{
		for(int a =0; a<8; a++)
		{
			for(int b =0; b<8; b++)
			{
				if(chess.board[a][b].getIcon().toString().equals(chess.wP.toString()))
				{
					count += 1;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wB.toString()))
				{
					count += 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wR.toString()))
				{
					count += 5;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wH.toString()))
				{
					count += 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.wQ.toString()))
				{
					count += 9;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bP.toString()))
				{
					count -= 1;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bB.toString()))
				{
					count -= 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bR.toString()))
				{
					count -= 5;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bH.toString()))
				{
					count -= 3;
				}
				
				if(chess.board[a][b].getIcon().toString().equals(chess.bQ.toString()))
				{
					count -= 9;
				}
			}
		}
		
			if( chess.BcheckMate ==  true)
			{
				count += 1000;
			}
			if( chess.WcheckMate ==  true)
			{
				count -= 1000;
			}
		}
		return count;
	
	}
	
	static void setBoard(JButton[][] c) 
	{
			for(int a =0;a<8;a++)
			{
				for(int b =0;b<8;b++)
				{
					chess.board[a][b].setIcon(new ImageIcon(c[a][b].getIcon().toString()));
				}
			}
	}

	static JButton[][] setTemp() 
	{
		 JButton[][] c = new  JButton[8][8];
		 	JButton ta8 = new JButton("");
			JButton tb8 = new JButton("");
			JButton tc8 = new JButton("");
			JButton td8 = new JButton("");
			JButton te8 = new JButton("");
			JButton tf8 = new JButton("");
			JButton tg8 = new JButton("");
			JButton th8 = new JButton("");
			JButton ta7 = new JButton("");
			JButton tb7 = new JButton("");
			JButton tc7 = new JButton("");
			JButton td7 = new JButton("");
			JButton te7 = new JButton("");
			JButton tf7 = new JButton("");
			JButton tg7 = new JButton("");
			JButton th7 = new JButton("");
			JButton ta6 = new JButton("");
			JButton tb6 = new JButton("");
			JButton tc6 = new JButton("");
			JButton td6 = new JButton("");
			JButton te6 = new JButton("");
			JButton tf6 = new JButton("");
			JButton tg6 = new JButton("");
			JButton th6 = new JButton("");
			JButton ta5 = new JButton("");
			JButton tb5 = new JButton("");
			JButton tc5 = new JButton("");
			JButton td5 = new JButton("");
			JButton te5 = new JButton("");
			JButton tf5 = new JButton("");
			JButton tg5 = new JButton("");
			JButton th5 = new JButton("");
			JButton ta4 = new JButton("");
			JButton tb4 = new JButton("");
			JButton tc4 = new JButton("");
			JButton td4 = new JButton("");
			JButton te4 = new JButton("");
			JButton tf4 = new JButton("");
			JButton tg4 = new JButton("");
			JButton th4 = new JButton("");
			JButton ta3 = new JButton("");
			JButton tb3 = new JButton("");
			JButton tc3 = new JButton("");
			JButton td3 = new JButton("");
			JButton te3 = new JButton("");
			JButton tf3 = new JButton("");
			JButton tg3 = new JButton("");
			JButton th3 = new JButton("");
			JButton ta2 = new JButton("");
			JButton tb2 = new JButton("");
			JButton tc2 = new JButton("");
			JButton td2 = new JButton("");
			JButton te2 = new JButton("");
			JButton tf2 = new JButton("");
			JButton tg2 = new JButton("");
			JButton th2 = new JButton("");
			JButton ta1 = new JButton("");
			JButton tb1 = new JButton("");
			JButton tc1 = new JButton("");
			JButton td1 = new JButton("");
			JButton te1 = new JButton("");
			JButton tf1 = new JButton("");
			JButton tg1 = new JButton("");
			JButton th1 = new JButton("");
			c[0][0] = ta8;
			c[0][1] = tb8;
			c[0][2] = tc8;
			c[0][3] = td8;
			c[0][4] = te8;
			c[0][5] = tf8;
			c[0][6] = tg8;
			c[0][7] = th8;
			c[1][0] = ta7;
			c[1][1] = tb7;
			c[1][2] = tc7;
			c[1][3] = td7;
			c[1][4] = te7;
			c[1][5] = tf7;
			c[1][6] = tg7;
			c[1][7] = th7;
			c[2][0] = ta6;
			c[2][1] = tb6;
			c[2][2] = tc6;
			c[2][3] = td6;
			c[2][4] = te6;
			c[2][5] = tf6;
			c[2][6] = tg6;
			c[2][7] = th6;
			c[3][0] = ta5;
			c[3][1] = tb5;
			c[3][2] = tc5;
			c[3][3] = td5;
			c[3][4] = te5;
			c[3][5] = tf5;
			c[3][6] = tg5;
			c[3][7] = th5;
			c[4][0] = ta4;
			c[4][1] = tb4;
			c[4][2] = tc4;
			c[4][3] = td4;
			c[4][4] = te4;
			c[4][5] = tf4;
			c[4][6] = tg4;
			c[4][7] = th4;
			c[5][0] = ta3;
			c[5][1] = tb3;
			c[5][2] = tc3;
			c[5][3] = td3;
			c[5][4] = te3;
			c[5][5] = tf3;
			c[5][6] = tg3;
			c[5][7] = th3;
			c[6][0] = ta2;
			c[6][1] = tb2;
			c[6][2] = tc2;
			c[6][3] = td2;
			c[6][4] = te2;
			c[6][5] = tf2;
			c[6][6] = tg2;
			c[6][7] = th2;
			c[7][0] = ta1;
			c[7][1] = tb1;
			c[7][2] = tc1;
			c[7][3] = td1;
			c[7][4] = te1;
			c[7][5] = tf1;
			c[7][6] = tg1;
			c[7][7] = th1;
			
		for(int a=0;a<8;a++)
		{
			for(int b =0;b<8;b++)
			{
				c[a][b].setIcon(new ImageIcon(chess.board[a][b].getIcon().toString()));
			}
		}
		return c;
	}
}


