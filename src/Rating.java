
public class Rating 
{
	static int wpawnBoard[][]={
	        { 0,  0,  0,  0,  0,  0,  0,  0},
	        {50, 50, 50, 50, 50, 50, 50, 50},
	        {10, 10, 20, 30, 30, 20, 10, 10},
	        { 5,  5, 10, 25, 25, 10,  5,  5},
	        { 0,  0,  0, 20, 20,  0,  0,  0},
	        { 5, -5,-10,  0,  0,-10, -5,  5},
	        { 5, 10, 10,-20,-20, 10, 10,  5},
	        { 0,  0,  0,  0,  0,  0,  0,  0}};
	static int bpawnBoard[][]={
	        { 0,  0,  0,  0,  0,  0,  0,  0},
	        { 5, 10, 10,-20,-20, 10, 10,  5},
	        { 5, -5,-10,  0,  0,-10, -5,  5},
	        { 0,  0,  0, 20, 20,  0,  0,  0},
	        { 5,  5, 10, 25, 25, 10,  5,  5},
	        {10, 10, 20, 30, 30, 20, 10, 10},
	        {50, 50, 50, 50, 50, 50, 50, 50},
	        { 0,  0,  0,  0,  0,  0,  0,  0}};
	    static int rookBoard[][]={
	        { 0,  0,  0,  0,  0,  0,  0,  0},
	        { 5, 10, 10, 10, 10, 10, 10,  5},
	        {-5,  0,  0,  0,  0,  0,  0, -5},
	        {-5,  0,  0,  0,  0,  0,  0, -5},
	        {-5,  0,  0,  0,  0,  0,  0, -5},
	        {-5,  0,  0,  0,  0,  0,  0, -5},
	        {-5,  0,  0,  0,  0,  0,  0, -5},
	        { 0,  0,  0,  5,  5,  0,  0,  0}};
	    static int knightBoard[][]={
	        {-50,-40,-30,-30,-30,-30,-40,-50},
	        {-40,-20,  0,  0,  0,  0,-20,-40},
	        {-30,  0, 10, 15, 15, 10,  0,-30},
	        {-30,  5, 15, 20, 20, 15,  5,-30},
	        {-30,  0, 15, 20, 20, 15,  0,-30},
	        {-30,  5, 10, 15, 15, 10,  5,-30},
	        {-40,-20,  0,  5,  5,  0,-20,-40},
	        {-50,-40,-30,-30,-30,-30,-40,-50}};
	    static int bishopBoard[][]={
	        {-20,-10,-10,-10,-10,-10,-10,-20},
	        {-10,  0,  0,  0,  0,  0,  0,-10},
	        {-10,  0,  5, 10, 10,  5,  0,-10},
	        {-10,  5,  5, 10, 10,  5,  5,-10},
	        {-10,  0, 10, 10, 10, 10,  0,-10},
	        {-10, 10, 10, 10, 10, 10, 10,-10},
	        {-10,  5,  0,  0,  0,  0,  5,-10},
	        {-20,-10,-10,-10,-10,-10,-10,-20}};
	    static int queenBoard[][]={
	        {-20,-10,-10, -5, -5,-10,-10,-20},
	        {-10,  0,  0,  0,  0,  0,  0,-10},
	        {-10,  0,  5,  5,  5,  5,  0,-10},
	        { -5,  0,  5,  5,  5,  5,  0, -5},
	        {  0,  0,  5,  5,  5,  5,  0, -5},
	        {-10,  5,  5,  5,  5,  5,  0,-10},
	        {-10,  0,  5,  0,  0,  0,  0,-10},
	        {-20,-10,-10, -5, -5,-10,-10,-20}};
	    static int bkingMidBoard[][]={
	        { 20, 30, 10,  0,  0, 10, 30, 20},
	        { 20, 20,  0,  0,  0,  0, 20, 20},
	        {-10,-20,-20,-20,-20,-20,-20,-10},
	        {-20,-30,-30,-40,-40,-30,-30,-20},
	        {-30,-40,-40,-50,-50,-40,-40,-30},
	        {-30,-40,-40,-50,-50,-40,-40,-30},
	        {-30,-40,-40,-50,-50,-40,-40,-30},
	        {-30,-40,-40,-50,-50,-40,-40,-30}};
	    static int wkingMidBoard[][]={
	            {-30,-40,-40,-50,-50,-40,-40,-30},
	            {-30,-40,-40,-50,-50,-40,-40,-30},
	            {-30,-40,-40,-50,-50,-40,-40,-30},
	            {-30,-40,-40,-50,-50,-40,-40,-30},
	            {-20,-30,-30,-40,-40,-30,-30,-20},
	            {-10,-20,-20,-20,-20,-20,-20,-10},
	            { 20, 20,  0,  0,  0,  0, 20, 20},
	            { 20, 30, 10,  0,  0, 10, 30, 20}};
	    static int kingEndBoard[][]={
	        {-50,-40,-30,-20,-20,-30,-40,-50},
	        {-30,-20,-10,  0,  0,-10,-20,-30},
	        {-30,-10, 20, 30, 30, 20,-10,-30},
	        {-30,-10, 30, 40, 40, 30,-10,-30},
	        {-30,-10, 30, 40, 40, 30,-10,-30},
	        {-30,-10, 20, 30, 30, 20,-10,-30},
	        {-30,-30,  0,  0,  0,  0,-30,-30},
	        {-50,-30,-30,-30,-30,-30,-30,-50}};
	    public static int rating(int list, int depth) {
	        int counter=0, material=rateMaterial();
	        System.out.println(material);
	        
	        counter+=rateAttack();
	        counter+=material;
	        counter+=rateMoveablitly(list, depth, material);
	        counter+=ratePositional(material);
	        
	        return (counter+depth*50);
	    }
	    public static int rateAttack() {
	        int counter=0;
	        int tempPositionC,tempPositionD,WtempPositionC,WtempPositionD;
	  if(chess.whitemove == true)
	  {
		  tempPositionC=chess.BKingC;
		  tempPositionD=chess.BKingD;
		  WtempPositionC=chess.WKingC;
		  WtempPositionD=chess.WKingD;
	        for (int i=0;i<64;i++) {
	            switch (chess.board[i/8][i%8].getIcon().toString()) {
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bP.png": {chess.BKingC=i/8;chess.BKingC=i%8; if (Check.checkBlack()) {counter-=64;}}
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bR.png": {chess.BKingC=i/8;chess.BKingC=i%8; if (Check.checkBlack()) {counter-=500;}}
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bN.png": {chess.BKingC=i/8;chess.BKingC=i%8; if (Check.checkBlack()) {counter-=300;}}
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bB.png": {chess.BKingC=i/8;chess.BKingC=i%8; if (Check.checkBlack()) {counter-=300;}}
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bQ.png": {chess.BKingC=i/8;chess.BKingC=i%8; if (Check.checkBlack()) {counter-=900;}}
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wP.png": {chess.WKingC=i/8;chess.WKingC=i%8; if (Check.checkWhite()) {counter+=64;}}
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wR.png": {chess.WKingC=i/8;chess.WKingC=i%8; if (Check.checkWhite()) {counter+=500;}}
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wN.png": {chess.WKingC=i/8;chess.WKingC=i%8; if (Check.checkWhite()) {counter+=300;}}
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wB.png": {chess.WKingC=i/8;chess.WKingC=i%8; if (Check.checkWhite()) {counter+=300;}}
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wQ.png": {chess.WKingC=i/8;chess.WKingC=i%8; if (Check.checkWhite()) {counter+=900;}}
                    break;
	            }
	            
	        }
	        chess.BKingC=tempPositionC;
			chess.BKingD=tempPositionD;
			chess.WKingC=WtempPositionC;
			chess.WKingD=WtempPositionD;
	        if (Check.checkBlack()) {counter-=200;}

	        if (Check.checkWhite()) {counter+=200;}
	        
	    }
	        return counter/2;
	    }
	    //-----------------------------------------------------------------------------------------------------------------------------
	    public static int rateMaterial() 
	    {
	        int counter=0, bishopCounter=0, wbishopCounter=0;
	      if(chess.whitemove == true)
	      {
	        for (int i=0;i<64;i++) {
	            if(chess.board[i/8][i%8].getIcon().toString().equals(chess.bP))
	            {
	            	counter+=100;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.bR))
	            {
	            	counter+=500;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.bH))
	            {
	            	counter+=300;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.bB))
	            {
	            	bishopCounter+=1;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.bQ))
	            {
	            	counter+=900;
	            }
	            if(chess.board[i/8][i%8].getIcon().toString().equals(chess.wP))
	            {
	            	counter-=100;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.wR))
	            {
	            	counter-=500;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.wH))
	            {
	            	counter-=300;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.wB))
	            {
	            	wbishopCounter+=1;
	            }
	            else if(chess.board[i/8][i%8].getIcon().toString().equals(chess.wQ))
	            {
	            	counter-=900;
	            }
	            
	        }
	        if (bishopCounter>=2) {
	            counter+=300*bishopCounter;
	        } else {
	            if (bishopCounter==1) {counter+=250;}
	        }
	        if (wbishopCounter>=2) {
	            counter-=300*wbishopCounter;
	        } else {
	            if (wbishopCounter==1) {counter-=250;}
	        }
	      } 
	        return counter;
	    }
	    //-----------------------------------------------------------------------------------------------------------------------------
	    public static int rateMoveablitly(int listLength, int depth, int material) {

	    	int counter=0;
	    	if(chess.whitemove==true)
	    	{
	        counter+=listLength;//5 pointer per valid move
	        if (listLength==0) {//current side is in checkmate or stalemate
	        	if(Check.checkBlack())
	        	{
	        	CheckMate.BcheckMate();
	        	if (chess.BcheckMate == true) 
	            {//if checkmate
	                counter+=-200000*depth;
	            }
	        	}
	        	if(Check.checkWhite())
	        	{
	        	CheckMate.checkMate();
	        	if (chess.WcheckMate == true) 
	            {//if checkmate
	                counter+=200000*depth;
	            }
	        	}
	            }
	        }
	    
	        return counter;
	    }
	    
	    public static int ratePositional(int material) {
	        int counter=0;
	        if(chess.whitemove==true)
	    	{
	        for (int i=0;i<64;i++) {
	            switch (chess.board[i/8][i%8].getIcon().toString()) {
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bP.png": counter+=bpawnBoard[i/8][i%8];
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bR.png": counter+=rookBoard[i/8][i%8];
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bN.png": counter+=knightBoard[i/8][i%8];
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bB.png": counter+=bishopBoard[i/8][i%8];
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bQ.png": counter+=queenBoard[i/8][i%8];
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bK.png": if (material>=1750) {counter+=bkingMidBoard[i/8][i%8]; } 
	                			else{counter+=kingEndBoard[i/8][i%8]; }
	                    break;
	                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wP.png": counter-=wpawnBoard[i/8][i%8];
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wR.png": counter-=rookBoard[i/8][i%8];
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wN.png": counter-=knightBoard[i/8][i%8];
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wB.png": counter-=bishopBoard[i/8][i%8];
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wQ.png": counter-=queenBoard[i/8][i%8];
                    break;
                case "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wK.png": if (material>=1750) {counter+=wkingMidBoard[i/8][i%8]; } 
                			else{counter+=kingEndBoard[i/8][i%8]; }
                    break;
	            }
	        }
	    }
	        return counter;
	    }

}
