 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class chess {

	
	private JFrame frame;
	static String bR =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bR.png";
	static String bH =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bN.png";
	static String bB =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bB.png";
	static String bQ =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bQ.png";
	static String bK =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bK.png";
	static String bP =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\bP.png";
	static String wR =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wR.png";
	static String wP =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wP.png";
	static String wK =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wK.png";
	static String wQ =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wQ.png";
	static String wB =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wB.png";
	static String wH =  "C:\\Users\\chara\\OneDrive\\Desktop\\flappy bird\\wN.png";
	static JButton[][] board = new JButton[8][8] ;
	JButton a8 = new JButton("");
	JButton b8 = new JButton("");
	JButton c8 = new JButton("");
	JButton d8 = new JButton("");
	JButton e8 = new JButton("");
	JButton f8 = new JButton("");
	JButton g8 = new JButton("");
	JButton h8 = new JButton("");
	JButton a7 = new JButton("");
	JButton b7 = new JButton("");
	JButton c7 = new JButton("");
	JButton d7 = new JButton("");
	JButton e7 = new JButton("");
	JButton f7 = new JButton("");
	JButton g7 = new JButton("");
	JButton h7 = new JButton("");
	JButton a6 = new JButton("");
	JButton b6 = new JButton("");
	JButton c6 = new JButton("");
	JButton d6 = new JButton("");
	JButton e6 = new JButton("");
	JButton f6 = new JButton("");
	JButton g6 = new JButton("");
	JButton h6 = new JButton("");
	JButton a5 = new JButton("");
	JButton b5 = new JButton("");
	JButton c5 = new JButton("");
	JButton d5 = new JButton("");
	JButton e5 = new JButton("");
	JButton f5 = new JButton("");
	JButton g5 = new JButton("");
	JButton h5 = new JButton("");
	JButton a4 = new JButton("");
	JButton b4 = new JButton("");
	JButton c4 = new JButton("");
	JButton d4 = new JButton("");
	JButton e4 = new JButton("");
	JButton f4 = new JButton("");
	JButton g4 = new JButton("");
	JButton h4 = new JButton("");
	JButton a3 = new JButton("");
	JButton b3 = new JButton("");
	JButton c3 = new JButton("");
	JButton d3 = new JButton("");
	JButton e3 = new JButton("");
	JButton f3 = new JButton("");
	JButton g3 = new JButton("");
	JButton h3 = new JButton("");
	JButton a2 = new JButton("");
	JButton b2 = new JButton("");
	JButton c2 = new JButton("");
	JButton d2 = new JButton("");
	JButton e2 = new JButton("");
	JButton f2 = new JButton("");
	JButton g2 = new JButton("");
	JButton h2 = new JButton("");
	JButton a1 = new JButton("");
	JButton b1 = new JButton("");
	JButton c1 = new JButton("");
	JButton d1 = new JButton("");
	JButton e1 = new JButton("");
	JButton f1 = new JButton("");
	JButton g1 = new JButton("");
	JButton h1 = new JButton("");
	boolean pick =true;
	JButton temp;
	String tem;
	int a,b;
	static boolean valid = true;
	static Color col;
	static int WKingC = 7, WKingD = 4;
	static int BKingC = 7;
	static int BKingD = 4;
	static boolean whitemove ;
	static boolean WcheckMate = false;
	static boolean BcheckMate = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chess window = new chess();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public chess() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(10,10,800,800);
		
		

		JButton ChooseBlack = new JButton("choose Black");
		JButton btnNewButton = new JButton("choose White");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(217, 183, 180, 83);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setWBoard();
				whitemove = true;
				WKingC = 7;
				WKingD = 4;
				BKingC = 0;
				BKingD = 4;
				
				btnNewButton.setEnabled(false);
				btnNewButton.setVisible(false);

				ChooseBlack.setEnabled(false);
				ChooseBlack.setVisible(false);
			}
		});
		
		ChooseBlack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ChooseBlack.setBounds(217, 298, 180, 83);
		ChooseBlack.setBackground(Color.WHITE);
		frame.getContentPane().add(ChooseBlack); 
		ChooseBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setBBoard();
				WKingC = 0;
				WKingD = 4;
				BKingC = 7;
				BKingD = 4;
				
				whitemove = false;
				btnNewButton.setEnabled(false);
				btnNewButton.setVisible(false);

				ChooseBlack.setEnabled(false);
				ChooseBlack.setVisible(false);
			}
//-----------------------------------------
			private void setBBoard() 
			{
				
				a8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,0,a8);
					}
				});
				a8.setBackground(new Color(255, 255, 255));
				a8.setIcon(new ImageIcon(wR));
				a8.setToolTipText("");
				a8.setBounds(0, 0, 100, 100);
				frame.getContentPane().add(a8);
				board[0][0] = a8;
				
				
				b8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,1,b8);
					}
				});
				
				b8.setBackground(new Color(160, 82, 45));
				b8.setIcon(new ImageIcon(wH));
				b8.setBounds(100, 0, 100, 100);
				frame.getContentPane().add(b8);
				board[0][1] = b8;
				
				c8.setBackground(new Color(255, 255, 255));
				c8.setIcon(new ImageIcon(wB));
				c8.setBounds(200, 0, 100, 100);
				frame.getContentPane().add(c8);
				board[0][2] = c8;
				c8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,2,c8);
					}
				});
				
				d8.setIcon(new ImageIcon(wQ));
				d8.setBackground(new Color(160, 82, 45));
				d8.setBounds(300, 0, 100, 100);
				frame.getContentPane().add(d8);
				board[0][3] = d8;
				d8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,3,d8);
					}
				});
				
				e8.setBackground(new Color(255, 255, 255));
				e8.setIcon(new ImageIcon(wK));
				e8.setBounds(400, 0, 100, 100);
				frame.getContentPane().add(e8);
				board[0][4] = e8;
				e8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,4,e8);
					}
				});
				
				f8.setBackground(new Color(160, 82, 45));
				f8.setIcon(new ImageIcon(wB));
				f8.setBounds(500, 0, 100, 100);
				frame.getContentPane().add(f8);
				board[0][5] = f8;
				f8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,5,f8);
					}
				});
				
				g8.setBackground(new Color(255, 255, 255));
				g8.setIcon(new ImageIcon(wH));
				g8.setBounds(600, 0, 100, 100);
				frame.getContentPane().add(g8);
				board[0][6] = g8;
				g8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,6,g8);
					}
				});
				
				h8.setBackground(new Color(160, 82, 45));
				h8.setIcon(new ImageIcon(wR));
				h8.setBounds(700, 0, 100, 100);
				frame.getContentPane().add(h8);
				board[0][7] = h8;
				h8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(0,7,h8);
					}
				});
				
				a7.setBackground(new Color(160, 82, 45));
				a7.setIcon(new ImageIcon(wP));
				a7.setToolTipText("");
				a7.setBounds(0, 100, 100, 100);
				frame.getContentPane().add(a7);
				board[1][0] = a7;
				a7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,0,a7);
					}
				});
				
				b7.setBackground(new Color(255, 255, 255));
				b7.setIcon(new ImageIcon(wP));
				b7.setToolTipText("");
				b7.setBounds(100, 100, 100, 100);
				frame.getContentPane().add(b7);
				board[1][1] = b7;
				b7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,1,b7);
					}
				});
				
				c7.setBackground(new Color(160, 82, 45));
				c7.setIcon(new ImageIcon(wP));
				c7.setToolTipText("");
				c7.setBounds(200, 100, 100, 100);
				frame.getContentPane().add(c7);
				board[1][2] = c7;
				c7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,2,c7);
					}
				});
				
				d7.setBackground(new Color(255, 255, 255));
				d7.setIcon(new ImageIcon(wP));
				d7.setToolTipText("");
				d7.setBounds(300, 100, 100, 100);
				frame.getContentPane().add(d7);
				board[1][3] = d7;
				d7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,3,d7);
					}
				});
				
				e7.setIcon(new ImageIcon(wP));
				e7.setBackground(new Color(160, 82, 45));
				e7.setToolTipText("");
				e7.setBounds(400, 100, 100, 100);
				frame.getContentPane().add(e7);
				board[1][4] = e7;
				e7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,4,e7);
					}
				});
				
				f7.setBackground(new Color(255, 255, 255));
				f7.setIcon(new ImageIcon(wP));
				f7.setToolTipText("");
				f7.setBounds(500, 100, 100, 100);
				frame.getContentPane().add(f7);
				board[1][5] = f7;
				f7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,5,f7);
					}
				});
				
				g7.setBackground(new Color(160, 82, 45));
				g7.setIcon(new ImageIcon(wP));
				g7.setToolTipText("");
				g7.setBounds(600, 100, 100, 100);
				frame.getContentPane().add(g7);
				board[1][6] = g7;
				g7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,6,g7);
					}
				});
				
				h7.setBackground(new Color(255, 255, 255));
				h7.setIcon(new ImageIcon(wP));
				h7.setToolTipText("");
				h7.setBounds(700, 100, 100, 100);
				frame.getContentPane().add(h7);
				board[1][7] = h7;
				h7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(1,7,h7);
					}
				});
				
				a6.setIcon(new ImageIcon(""));
				a6.setBackground(new Color(255, 255, 255));
				a6.setToolTipText("");
				a6.setBounds(0, 200, 100, 100);
				frame.getContentPane().add(a6);
				board[2][0] = a6;
				a6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,0,a6);
					}
				});
				
				b6.setIcon(new ImageIcon(""));
				b6.setBackground(new Color(160, 82, 45));
				b6.setToolTipText("");
				b6.setBounds(100, 200, 100, 100);
				frame.getContentPane().add(b6);
				board[2][1] = b6;
				b6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,1,b6);
					}
				});
				
				c6.setIcon(new ImageIcon(""));
				c6.setBackground(new Color(255, 255, 255));
				c6.setToolTipText("");
				c6.setBounds(200, 200, 100, 100);
				frame.getContentPane().add(c6);
				board[2][2] = c6;
				c6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,2,c6);
					}
				});
				
				d6.setIcon(new ImageIcon(""));
				d6.setBackground(new Color(160, 82, 45));
				d6.setToolTipText("");
				d6.setBounds(300, 200, 100, 100);
				frame.getContentPane().add(d6);
				board[2][3] = d6;
				d6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,3,d6);
					}
				});
				
				e6.setIcon(new ImageIcon(""));
				e6.setBackground(new Color(255, 255, 255));
				e6.setToolTipText("");
				e6.setBounds(400, 200, 100, 100);
				frame.getContentPane().add(e6);
				board[2][4] = e6;
				e6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,4,e6);
					}
				});
				
				f6.setIcon(new ImageIcon(""));
				f6.setBackground(new Color(160, 82, 45));
				f6.setToolTipText("");
				f6.setBounds(500, 200, 100, 100);
				frame.getContentPane().add(f6);
				board[2][5] = f6;
				f6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,5,f6);
					}
				});
				
				g6.setIcon(new ImageIcon(""));
				g6.setBackground(new Color(255, 255, 255));
				g6.setToolTipText("");
				g6.setBounds(600, 200, 100, 100);
				frame.getContentPane().add(g6);
				board[2][6] = g6;
				g6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,6,g6);
					}
				});
				
				h6.setIcon(new ImageIcon(""));
				h6.setBackground(new Color(160, 82, 45));
				h6.setToolTipText("");
				h6.setBounds(700, 200, 100, 100);
				frame.getContentPane().add(h6);
				board[2][7] = h6;
				h6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(2,7,h6);
					}
				});
				
				a5.setIcon(new ImageIcon(""));
				a5.setBackground(new Color(160, 82, 45));
				a5.setToolTipText("");
				a5.setBounds(0, 300, 100, 100);
				frame.getContentPane().add(a5);
				board[3][0] = a5;
				a5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,0,a5);
						
					}
				});
				
				b5.setIcon(new ImageIcon(""));
				b5.setBackground(new Color(255, 255, 255));
				b5.setToolTipText("");
				b5.setBounds(100, 300, 100, 100);
				frame.getContentPane().add(b5);
				board[3][1] = b5;
				b5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,1,b5);
					}
				});
				
				c5.setIcon(new ImageIcon(""));
				c5.setBackground(new Color(160, 82, 45));
				c5.setToolTipText("");
				c5.setBounds(200, 300, 100, 100);
				frame.getContentPane().add(c5);
				board[3][2] = c5;
				c5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,2,c5);
					}
				});
				
				d5.setIcon(new ImageIcon(""));
				d5.setBackground(new Color(255, 255, 255));
				d5.setToolTipText("");
				d5.setBounds(300, 300, 100, 100);
				frame.getContentPane().add(d5);
				board[3][3] = d5;
				d5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,3,d5);
					}
				});
				
				e5.setIcon(new ImageIcon(""));
				e5.setBackground(new Color(160, 82, 45));
				e5.setToolTipText("");
				e5.setBounds(400, 300, 100, 100);
				frame.getContentPane().add(e5);
				board[3][4] = e5;
				e5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,4,e5);
					}
				});
				
				f5.setIcon(new ImageIcon(""));
				f5.setBackground(new Color(255, 255, 255));
				f5.setToolTipText("");
				f5.setBounds(500, 300, 100, 100);
				frame.getContentPane().add(f5);
				board[3][5] = f5;
				f5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,5,f5);
					}
				});
				
				g5.setIcon(new ImageIcon(""));
				g5.setBackground(new Color(160, 82, 45));
				g5.setToolTipText("");
				g5.setBounds(600, 300, 100, 100);
				frame.getContentPane().add(g5);
				board[3][6] = g5;
				g5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,6,g5);
					}
				});
				
				h5.setIcon(new ImageIcon(""));
				h5.setBackground(new Color(255, 255, 255));
				h5.setToolTipText("");
				h5.setBounds(700, 300, 100, 100);
				frame.getContentPane().add(h5);
				board[3][7] = h5;
				h5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(3,7,h5);
					}
				});
				
				a4.setIcon(new ImageIcon(""));
				a4.setBackground(new Color(255, 255, 255));
				a4.setToolTipText("");
				a4.setBounds(0, 400, 100, 100);
				frame.getContentPane().add(a4);
				board[4][0] = a4;
				a4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,0,a4);
					}
				});
				
				b4.setIcon(new ImageIcon(""));
				b4.setBackground(new Color(160, 82, 45));
				b4.setToolTipText("");
				b4.setBounds(100, 400, 100, 100);
				frame.getContentPane().add(b4);
				board[4][1] = b4;
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,1,b4);
					}
				});
				
				c4.setIcon(new ImageIcon(""));
				c4.setBackground(new Color(255, 255, 255));
				c4.setToolTipText("");
				c4.setBounds(200, 400, 100, 100);
				frame.getContentPane().add(c4);
				board[4][2] = c4;
				c4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,2,c4);
					}
				});
				
				d4.setIcon(new ImageIcon(""));
				d4.setBackground(new Color(160, 82, 45));
				d4.setToolTipText("");
				d4.setBounds(300, 400, 100, 100);
				frame.getContentPane().add(d4);
				board[4][3] = d4;
				d4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,3,d4);
					}
				});
				
				e4.setIcon(new ImageIcon(""));
				e4.setBackground(new Color(255, 255, 255));
				e4.setToolTipText("");
				e4.setBounds(400, 400, 100, 100);
				frame.getContentPane().add(e4);
				board[4][4] = e4;
				e4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,4,e4);
					}
				});
				
				f4.setIcon(new ImageIcon(""));
				f4.setBackground(new Color(160, 82, 45));
				f4.setToolTipText("");
				f4.setBounds(500, 400, 100, 100);
				frame.getContentPane().add(f4);
				board[4][5] = f4;
				f4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,5,f4);
					}
				});
				
				g4.setIcon(new ImageIcon(""));
				g4.setBackground(new Color(255, 255, 255));
				g4.setToolTipText("");
				g4.setBounds(600, 400, 100, 100);
				frame.getContentPane().add(g4);
				board[4][6] = g4;
				g4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,6,g4);
					}
				});
				
				h4.setIcon(new ImageIcon(""));
				h4.setBackground(new Color(160, 82, 45));
				h4.setToolTipText("");
				h4.setBounds(700, 400, 100, 100);
				frame.getContentPane().add(h4);
				board[4][7] = h4;
				h4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(4,7,h4);
					}
				});
				
				
				a3.setIcon(new ImageIcon(""));
				a3.setBackground(new Color(160, 82, 45));
				a3.setToolTipText("");
				a3.setBounds(0, 500, 100, 100);
				frame.getContentPane().add(a3);
				board[5][0] = a3;
				a3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,0,a3);
					}
				});
				
				b3.setIcon(new ImageIcon(""));
				b3.setBackground(new Color(255, 255, 255));
				b3.setToolTipText("");
				b3.setBounds(100, 500, 100, 100);
				frame.getContentPane().add(b3);
				board[5][1] = b3;
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,1,b3);
					}
				});
				
				c3.setIcon(new ImageIcon(""));
				c3.setBackground(new Color(160, 82, 45));
				c3.setToolTipText("");
				c3.setBounds(200, 500, 100, 100);
				frame.getContentPane().add(c3);
				board[5][2] = c3;
				c3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,2,c3);
					}
				});
				
				d3.setIcon(new ImageIcon(""));
				d3.setBackground(new Color(255, 255, 255));
				d3.setToolTipText("");
				d3.setBounds(300, 500, 100, 100);
				frame.getContentPane().add(d3);
				board[5][3] = d3;
				d3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,3,d3);
					}
				});
				
				e3.setIcon(new ImageIcon(""));
				e3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,4,e3);
					}
				});
				e3.setBackground(new Color(160, 82, 45));
				e3.setToolTipText("");
				e3.setBounds(400, 500, 100, 100);
				frame.getContentPane().add(e3);
				board[5][4] = e3;
				
				f3.setIcon(new ImageIcon(""));
				f3.setBackground(new Color(255, 255, 255));
				f3.setToolTipText("");
				f3.setBounds(500, 500, 100, 100);
				frame.getContentPane().add(f3);
				board[5][5] = f3;
				f3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,5,f3);
					}
				});
				
				g3.setIcon(new ImageIcon(""));
				g3.setBackground(new Color(160, 82, 45));
				g3.setToolTipText("");
				g3.setBounds(600, 500, 100, 100);
				frame.getContentPane().add(g3);
				board[5][6] = g3;
				g3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,6,g3);
					}
				});
				
				h3.setIcon(new ImageIcon(""));
				h3.setBackground(new Color(255, 255, 255));
				h3.setToolTipText("");
				h3.setBounds(700, 500, 100, 100);
				frame.getContentPane().add(h3);
				board[5][7] = h3;
				h3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(5,7,h3);
					}
				});
				
				a2.setBackground(new Color(255, 255, 255));
				a2.setIcon(new ImageIcon(bP));
				a2.setToolTipText("");
				a2.setBounds(0, 600, 100, 100);
				frame.getContentPane().add(a2);
				board[6][0] = a2;
				a2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,0,a2);
					}
				});
				
				
				
				b2.setIcon(new ImageIcon(bP));
				b2.setToolTipText("");
				b2.setBackground(new Color(160, 82, 45));
				b2.setBounds(100, 600, 100, 100);
				frame.getContentPane().add(b2);
				board[6][1] = b2;
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,1,b2);
					}
				});
				
				c2.setIcon(new ImageIcon(bP));
				c2.setToolTipText("");
				c2.setBackground(new Color(255, 255, 255));
				c2.setBounds(200, 600, 100, 100);
				frame.getContentPane().add(c2);
				board[6][2] = c2;
				c2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,2,c2);
					}
				});
				
				
				d2.setIcon(new ImageIcon(bP));
				d2.setToolTipText("");
				d2.setBackground(new Color(160, 82, 45));
				d2.setBounds(300, 600, 100, 100);
				frame.getContentPane().add(d2);
				board[6][3] = d2;
				d2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,3,d2);
					}
				});
				
				
				e2.setIcon(new ImageIcon(bP));
				e2.setToolTipText("");
				e2.setBackground(new Color(255, 255, 255));
				e2.setBounds(400, 600, 100, 100);
				frame.getContentPane().add(e2);
				board[6][4] = e2;
				e2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,4,e2);
					}
				});
				
				f2.setIcon(new ImageIcon(bP));
				f2.setToolTipText("");
				f2.setBackground(new Color(160, 82, 45));
				f2.setBounds(500, 600, 100, 100);
				frame.getContentPane().add(f2);
				board[6][5] = f2;
				f2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,5,f2);
					}
				});
				
				
				g2.setIcon(new ImageIcon(bP));
				g2.setToolTipText("");
				g2.setBackground(new Color(255, 255, 255));
				g2.setBounds(600, 600, 100, 100);
				frame.getContentPane().add(g2);
				board[6][6] = g2;
				g2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,6,g2);
					}
				});
				
				
				
				h2.setIcon(new ImageIcon(bP));
				h2.setToolTipText("");
				h2.setBackground(new Color(160, 82, 45));
				h2.setBounds(700, 600, 100, 100);
				frame.getContentPane().add(h2);
				board[6][7] = h2;
				h2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(6,7,h2);
					}
				});
				
				a1.setIcon(new ImageIcon(bR));
				a1.setToolTipText("");
				a1.setBackground(new Color(160, 82, 45));
				a1.setBounds(0, 700, 100, 100);
				frame.getContentPane().add(a1);
				board[7][0] = a1;
				a1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,0,a1);
					}
				});
				
				b1.setIcon(new ImageIcon(bH));
				b1.setToolTipText("");
				b1.setBackground(new Color(255, 255, 255));
				b1.setBounds(100, 700, 100, 100);
				frame.getContentPane().add(b1);
				board[7][1] = b1;
				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,1,b1);
					}
				});
				
				c1.setIcon(new ImageIcon(bB));
				c1.setToolTipText("");
				c1.setBackground(new Color(160, 82, 45));
				c1.setBounds(200, 700, 100, 100);
				frame.getContentPane().add(c1);
				board[7][2] = c1;
				c1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,2,c1);
					}
				});
				
				d1.setIcon(new ImageIcon(bQ));
				d1.setToolTipText("");
				d1.setBackground(new Color(255, 255, 255));
				d1.setBounds(300, 700, 100, 100);
				frame.getContentPane().add(d1);
				board[7][3] = d1;
				d1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,3,d1);
					}
				});
				
				e1.setIcon(new ImageIcon(bK));
				e1.setToolTipText("");
				e1.setBackground(new Color(160, 82, 45));
				e1.setBounds(400, 700, 100, 100);
				frame.getContentPane().add(e1);
				board[7][4] = e1;
				e1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,4,e1);
					}
				});
				
				f1.setIcon(new ImageIcon(bB));
				f1.setToolTipText("");
				f1.setBackground(new Color(255, 255, 255));
				f1.setBounds(500, 700, 100, 100);
				frame.getContentPane().add(f1);
				board[7][5] = f1;
				f1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,5,f1);
					}
				});
				
				g1.setIcon(new ImageIcon(bH));
				g1.setToolTipText("");
				g1.setBackground(new Color(160, 82, 45));
				g1.setBounds(600, 700, 100, 100);
				frame.getContentPane().add(g1);
				board[7][6] = g1;
				g1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,6,g1);
					}
				});
				
				h1.setIcon(new ImageIcon(bR));
				h1.setToolTipText("");
				h1.setBackground(new Color(255, 255, 255));
				h1.setBounds(700, 700, 100, 100);
				frame.getContentPane().add(h1);
				frame.setBounds(10, 10, 810, 837);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				board[7][7] = h1;
				h1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						action(7,7,h1);
					}
				});	

				
			}
		});
	}
	
	private void setWBoard()
	{
		a8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,0,a8);
			}
		});
		a8.setBackground(new Color(255, 255, 255));
		a8.setIcon(new ImageIcon(bR));
		a8.setToolTipText("");
		a8.setBounds(0, 0, 100, 100);
		frame.getContentPane().add(a8);
		board[0][0] = a8;
		
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,1,b8);
			}
		});
		
		b8.setBackground(new Color(160, 82, 45));
		b8.setIcon(new ImageIcon(bH));
		b8.setBounds(100, 0, 100, 100);
		frame.getContentPane().add(b8);
		board[0][1] = b8;
		
		c8.setBackground(new Color(255, 255, 255));
		c8.setIcon(new ImageIcon(bB));
		c8.setBounds(200, 0, 100, 100);
		frame.getContentPane().add(c8);
		board[0][2] = c8;
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,2,c8);
			}
		});
		
		d8.setIcon(new ImageIcon(bQ));
		d8.setBackground(new Color(160, 82, 45));
		d8.setBounds(300, 0, 100, 100);
		frame.getContentPane().add(d8);
		board[0][3] = d8;
		d8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,3,d8);
			}
		});
		
		e8.setBackground(new Color(255, 255, 255));
		e8.setIcon(new ImageIcon(bK));
		e8.setBounds(400, 0, 100, 100);
		frame.getContentPane().add(e8);
		board[0][4] = e8;
		e8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,4,e8);
			}
		});
		
		f8.setBackground(new Color(160, 82, 45));
		f8.setIcon(new ImageIcon(bB));
		f8.setBounds(500, 0, 100, 100);
		frame.getContentPane().add(f8);
		board[0][5] = f8;
		f8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,5,f8);
			}
		});
		
		g8.setBackground(new Color(255, 255, 255));
		g8.setIcon(new ImageIcon(bH));
		g8.setBounds(600, 0, 100, 100);
		frame.getContentPane().add(g8);
		board[0][6] = g8;
		g8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,6,g8);
			}
		});
		
		h8.setBackground(new Color(160, 82, 45));
		h8.setIcon(new ImageIcon(bR));
		h8.setBounds(700, 0, 100, 100);
		frame.getContentPane().add(h8);
		board[0][7] = h8;
		h8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(0,7,h8);
			}
		});
		
		a7.setBackground(new Color(160, 82, 45));
		a7.setIcon(new ImageIcon(bP));
		a7.setToolTipText("");
		a7.setBounds(0, 100, 100, 100);
		frame.getContentPane().add(a7);
		board[1][0] = a7;
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,0,a7);
			}
		});
		
		b7.setBackground(new Color(255, 255, 255));
		b7.setIcon(new ImageIcon(bP));
		b7.setToolTipText("");
		b7.setBounds(100, 100, 100, 100);
		frame.getContentPane().add(b7);
		board[1][1] = b7;
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,1,b7);
			}
		});
		
		c7.setBackground(new Color(160, 82, 45));
		c7.setIcon(new ImageIcon(bP));
		c7.setToolTipText("");
		c7.setBounds(200, 100, 100, 100);
		frame.getContentPane().add(c7);
		board[1][2] = c7;
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,2,c7);
			}
		});
		
		d7.setBackground(new Color(255, 255, 255));
		d7.setIcon(new ImageIcon(bP));
		d7.setToolTipText("");
		d7.setBounds(300, 100, 100, 100);
		frame.getContentPane().add(d7);
		board[1][3] = d7;
		d7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,3,d7);
			}
		});
		
		e7.setIcon(new ImageIcon(bP));
		e7.setBackground(new Color(160, 82, 45));
		e7.setToolTipText("");
		e7.setBounds(400, 100, 100, 100);
		frame.getContentPane().add(e7);
		board[1][4] = e7;
		e7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,4,e7);
			}
		});
		
		f7.setBackground(new Color(255, 255, 255));
		f7.setIcon(new ImageIcon(bP));
		f7.setToolTipText("");
		f7.setBounds(500, 100, 100, 100);
		frame.getContentPane().add(f7);
		board[1][5] = f7;
		f7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,5,f7);
			}
		});
		
		g7.setBackground(new Color(160, 82, 45));
		g7.setIcon(new ImageIcon(bP));
		g7.setToolTipText("");
		g7.setBounds(600, 100, 100, 100);
		frame.getContentPane().add(g7);
		board[1][6] = g7;
		g7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,6,g7);
			}
		});
		
		h7.setBackground(new Color(255, 255, 255));
		h7.setIcon(new ImageIcon(bP));
		h7.setToolTipText("");
		h7.setBounds(700, 100, 100, 100);
		frame.getContentPane().add(h7);
		board[1][7] = h7;
		h7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(1,7,h7);
			}
		});
		
		a6.setIcon(new ImageIcon(""));
		a6.setBackground(new Color(255, 255, 255));
		a6.setToolTipText("");
		a6.setBounds(0, 200, 100, 100);
		frame.getContentPane().add(a6);
		board[2][0] = a6;
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,0,a6);
			}
		});
		
		b6.setIcon(new ImageIcon(""));
		b6.setBackground(new Color(160, 82, 45));
		b6.setToolTipText("");
		b6.setBounds(100, 200, 100, 100);
		frame.getContentPane().add(b6);
		board[2][1] = b6;
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,1,b6);
			}
		});
		
		c6.setIcon(new ImageIcon(""));
		c6.setBackground(new Color(255, 255, 255));
		c6.setToolTipText("");
		c6.setBounds(200, 200, 100, 100);
		frame.getContentPane().add(c6);
		board[2][2] = c6;
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,2,c6);
			}
		});
		
		d6.setIcon(new ImageIcon(""));
		d6.setBackground(new Color(160, 82, 45));
		d6.setToolTipText("");
		d6.setBounds(300, 200, 100, 100);
		frame.getContentPane().add(d6);
		board[2][3] = d6;
		d6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,3,d6);
			}
		});
		
		e6.setIcon(new ImageIcon(""));
		e6.setBackground(new Color(255, 255, 255));
		e6.setToolTipText("");
		e6.setBounds(400, 200, 100, 100);
		frame.getContentPane().add(e6);
		board[2][4] = e6;
		e6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,4,e6);
			}
		});
		
		f6.setIcon(new ImageIcon(""));
		f6.setBackground(new Color(160, 82, 45));
		f6.setToolTipText("");
		f6.setBounds(500, 200, 100, 100);
		frame.getContentPane().add(f6);
		board[2][5] = f6;
		f6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,5,f6);
			}
		});
		
		g6.setIcon(new ImageIcon(""));
		g6.setBackground(new Color(255, 255, 255));
		g6.setToolTipText("");
		g6.setBounds(600, 200, 100, 100);
		frame.getContentPane().add(g6);
		board[2][6] = g6;
		g6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,6,g6);
			}
		});
		
		h6.setIcon(new ImageIcon(""));
		h6.setBackground(new Color(160, 82, 45));
		h6.setToolTipText("");
		h6.setBounds(700, 200, 100, 100);
		frame.getContentPane().add(h6);
		board[2][7] = h6;
		h6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(2,7,h6);
			}
		});
		
		a5.setIcon(new ImageIcon(""));
		a5.setBackground(new Color(160, 82, 45));
		a5.setToolTipText("");
		a5.setBounds(0, 300, 100, 100);
		frame.getContentPane().add(a5);
		board[3][0] = a5;
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,0,a5);
				
			}
		});
		
		b5.setIcon(new ImageIcon(""));
		b5.setBackground(new Color(255, 255, 255));
		b5.setToolTipText("");
		b5.setBounds(100, 300, 100, 100);
		frame.getContentPane().add(b5);
		board[3][1] = b5;
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,1,b5);
			}
		});
		
		c5.setIcon(new ImageIcon(""));
		c5.setBackground(new Color(160, 82, 45));
		c5.setToolTipText("");
		c5.setBounds(200, 300, 100, 100);
		frame.getContentPane().add(c5);
		board[3][2] = c5;
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,2,c5);
			}
		});
		
		d5.setIcon(new ImageIcon(""));
		d5.setBackground(new Color(255, 255, 255));
		d5.setToolTipText("");
		d5.setBounds(300, 300, 100, 100);
		frame.getContentPane().add(d5);
		board[3][3] = d5;
		d5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,3,d5);
			}
		});
		
		e5.setIcon(new ImageIcon(""));
		e5.setBackground(new Color(160, 82, 45));
		e5.setToolTipText("");
		e5.setBounds(400, 300, 100, 100);
		frame.getContentPane().add(e5);
		board[3][4] = e5;
		e5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,4,e5);
			}
		});
		
		f5.setIcon(new ImageIcon(""));
		f5.setBackground(new Color(255, 255, 255));
		f5.setToolTipText("");
		f5.setBounds(500, 300, 100, 100);
		frame.getContentPane().add(f5);
		board[3][5] = f5;
		f5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,5,f5);
			}
		});
		
		g5.setIcon(new ImageIcon(""));
		g5.setBackground(new Color(160, 82, 45));
		g5.setToolTipText("");
		g5.setBounds(600, 300, 100, 100);
		frame.getContentPane().add(g5);
		board[3][6] = g5;
		g5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,6,g5);
			}
		});
		
		h5.setIcon(new ImageIcon(""));
		h5.setBackground(new Color(255, 255, 255));
		h5.setToolTipText("");
		h5.setBounds(700, 300, 100, 100);
		frame.getContentPane().add(h5);
		board[3][7] = h5;
		h5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(3,7,h5);
			}
		});
		
		a4.setIcon(new ImageIcon(""));
		a4.setBackground(new Color(255, 255, 255));
		a4.setToolTipText("");
		a4.setBounds(0, 400, 100, 100);
		frame.getContentPane().add(a4);
		board[4][0] = a4;
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,0,a4);
			}
		});
		
		b4.setIcon(new ImageIcon(""));
		b4.setBackground(new Color(160, 82, 45));
		b4.setToolTipText("");
		b4.setBounds(100, 400, 100, 100);
		frame.getContentPane().add(b4);
		board[4][1] = b4;
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,1,b4);
			}
		});
		
		c4.setIcon(new ImageIcon(""));
		c4.setBackground(new Color(255, 255, 255));
		c4.setToolTipText("");
		c4.setBounds(200, 400, 100, 100);
		frame.getContentPane().add(c4);
		board[4][2] = c4;
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,2,c4);
			}
		});
		
		d4.setIcon(new ImageIcon(""));
		d4.setBackground(new Color(160, 82, 45));
		d4.setToolTipText("");
		d4.setBounds(300, 400, 100, 100);
		frame.getContentPane().add(d4);
		board[4][3] = d4;
		d4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,3,d4);
			}
		});
		
		e4.setIcon(new ImageIcon(""));
		e4.setBackground(new Color(255, 255, 255));
		e4.setToolTipText("");
		e4.setBounds(400, 400, 100, 100);
		frame.getContentPane().add(e4);
		board[4][4] = e4;
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,4,e4);
			}
		});
		
		f4.setIcon(new ImageIcon(""));
		f4.setBackground(new Color(160, 82, 45));
		f4.setToolTipText("");
		f4.setBounds(500, 400, 100, 100);
		frame.getContentPane().add(f4);
		board[4][5] = f4;
		f4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,5,f4);
			}
		});
		
		g4.setIcon(new ImageIcon(""));
		g4.setBackground(new Color(255, 255, 255));
		g4.setToolTipText("");
		g4.setBounds(600, 400, 100, 100);
		frame.getContentPane().add(g4);
		board[4][6] = g4;
		g4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,6,g4);
			}
		});
		
		h4.setIcon(new ImageIcon(""));
		h4.setBackground(new Color(160, 82, 45));
		h4.setToolTipText("");
		h4.setBounds(700, 400, 100, 100);
		frame.getContentPane().add(h4);
		board[4][7] = h4;
		h4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(4,7,h4);
			}
		});
		
		
		a3.setIcon(new ImageIcon(""));
		a3.setBackground(new Color(160, 82, 45));
		a3.setToolTipText("");
		a3.setBounds(0, 500, 100, 100);
		frame.getContentPane().add(a3);
		board[5][0] = a3;
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,0,a3);
			}
		});
		
		b3.setIcon(new ImageIcon(""));
		b3.setBackground(new Color(255, 255, 255));
		b3.setToolTipText("");
		b3.setBounds(100, 500, 100, 100);
		frame.getContentPane().add(b3);
		board[5][1] = b3;
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,1,b3);
			}
		});
		
		c3.setIcon(new ImageIcon(""));
		c3.setBackground(new Color(160, 82, 45));
		c3.setToolTipText("");
		c3.setBounds(200, 500, 100, 100);
		frame.getContentPane().add(c3);
		board[5][2] = c3;
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,2,c3);
			}
		});
		
		d3.setIcon(new ImageIcon(""));
		d3.setBackground(new Color(255, 255, 255));
		d3.setToolTipText("");
		d3.setBounds(300, 500, 100, 100);
		frame.getContentPane().add(d3);
		board[5][3] = d3;
		d3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,3,d3);
			}
		});
		
		e3.setIcon(new ImageIcon(""));
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,4,e3);
			}
		});
		e3.setBackground(new Color(160, 82, 45));
		e3.setToolTipText("");
		e3.setBounds(400, 500, 100, 100);
		frame.getContentPane().add(e3);
		board[5][4] = e3;
		
		f3.setIcon(new ImageIcon(""));
		f3.setBackground(new Color(255, 255, 255));
		f3.setToolTipText("");
		f3.setBounds(500, 500, 100, 100);
		frame.getContentPane().add(f3);
		board[5][5] = f3;
		f3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,5,f3);
			}
		});
		
		g3.setIcon(new ImageIcon(""));
		g3.setBackground(new Color(160, 82, 45));
		g3.setToolTipText("");
		g3.setBounds(600, 500, 100, 100);
		frame.getContentPane().add(g3);
		board[5][6] = g3;
		g3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,6,g3);
			}
		});
		
		h3.setIcon(new ImageIcon(""));
		h3.setBackground(new Color(255, 255, 255));
		h3.setToolTipText("");
		h3.setBounds(700, 500, 100, 100);
		frame.getContentPane().add(h3);
		board[5][7] = h3;
		h3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(5,7,h3);
			}
		});
		
		a2.setBackground(new Color(255, 255, 255));
		a2.setIcon(new ImageIcon(wP));
		a2.setToolTipText("");
		a2.setBounds(0, 600, 100, 100);
		frame.getContentPane().add(a2);
		board[6][0] = a2;
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,0,a2);
			}
		});
		
		
		
		b2.setIcon(new ImageIcon(wP));
		b2.setToolTipText("");
		b2.setBackground(new Color(160, 82, 45));
		b2.setBounds(100, 600, 100, 100);
		frame.getContentPane().add(b2);
		board[6][1] = b2;
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,1,b2);
			}
		});
		
		c2.setIcon(new ImageIcon(wP));
		c2.setToolTipText("");
		c2.setBackground(new Color(255, 255, 255));
		c2.setBounds(200, 600, 100, 100);
		frame.getContentPane().add(c2);
		board[6][2] = c2;
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,2,c2);
			}
		});
		
		
		d2.setIcon(new ImageIcon(wP));
		d2.setToolTipText("");
		d2.setBackground(new Color(160, 82, 45));
		d2.setBounds(300, 600, 100, 100);
		frame.getContentPane().add(d2);
		board[6][3] = d2;
		d2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,3,d2);
			}
		});
		
		
		e2.setIcon(new ImageIcon(wP));
		e2.setToolTipText("");
		e2.setBackground(new Color(255, 255, 255));
		e2.setBounds(400, 600, 100, 100);
		frame.getContentPane().add(e2);
		board[6][4] = e2;
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,4,e2);
			}
		});
		
		f2.setIcon(new ImageIcon(wP));
		f2.setToolTipText("");
		f2.setBackground(new Color(160, 82, 45));
		f2.setBounds(500, 600, 100, 100);
		frame.getContentPane().add(f2);
		board[6][5] = f2;
		f2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,5,f2);
			}
		});
		
		
		g2.setIcon(new ImageIcon(wP));
		g2.setToolTipText("");
		g2.setBackground(new Color(255, 255, 255));
		g2.setBounds(600, 600, 100, 100);
		frame.getContentPane().add(g2);
		board[6][6] = g2;
		g2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,6,g2);
			}
		});
		
		
		
		h2.setIcon(new ImageIcon(wP));
		h2.setToolTipText("");
		h2.setBackground(new Color(160, 82, 45));
		h2.setBounds(700, 600, 100, 100);
		frame.getContentPane().add(h2);
		board[6][7] = h2;
		h2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(6,7,h2);
			}
		});
		
		a1.setIcon(new ImageIcon(wR));
		a1.setToolTipText("");
		a1.setBackground(new Color(160, 82, 45));
		a1.setBounds(0, 700, 100, 100);
		frame.getContentPane().add(a1);
		board[7][0] = a1;
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,0,a1);
			}
		});
		
		b1.setIcon(new ImageIcon(wH));
		b1.setToolTipText("");
		b1.setBackground(new Color(255, 255, 255));
		b1.setBounds(100, 700, 100, 100);
		frame.getContentPane().add(b1);
		board[7][1] = b1;
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,1,b1);
			}
		});
		
		c1.setIcon(new ImageIcon(wB));
		c1.setToolTipText("");
		c1.setBackground(new Color(160, 82, 45));
		c1.setBounds(200, 700, 100, 100);
		frame.getContentPane().add(c1);
		board[7][2] = c1;
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,2,c1);
			}
		});
		
		d1.setIcon(new ImageIcon(wQ));
		d1.setToolTipText("");
		d1.setBackground(new Color(255, 255, 255));
		d1.setBounds(300, 700, 100, 100);
		frame.getContentPane().add(d1);
		board[7][3] = d1;
		d1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,3,d1);
			}
		});
		
		e1.setIcon(new ImageIcon(wK));
		e1.setToolTipText("");
		e1.setBackground(new Color(160, 82, 45));
		e1.setBounds(400, 700, 100, 100);
		frame.getContentPane().add(e1);
		board[7][4] = e1;
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,4,e1);
			}
		});
		
		f1.setIcon(new ImageIcon(wB));
		f1.setToolTipText("");
		f1.setBackground(new Color(255, 255, 255));
		f1.setBounds(500, 700, 100, 100);
		frame.getContentPane().add(f1);
		board[7][5] = f1;
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,5,f1);
			}
		});
		
		g1.setIcon(new ImageIcon(wH));
		g1.setToolTipText("");
		g1.setBackground(new Color(160, 82, 45));
		g1.setBounds(600, 700, 100, 100);
		frame.getContentPane().add(g1);
		board[7][6] = g1;
		g1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,6,g1);
			}
		});
		
		h1.setIcon(new ImageIcon(wR));
		h1.setToolTipText("");
		h1.setBackground(new Color(255, 255, 255));
		h1.setBounds(700, 700, 100, 100);
		frame.getContentPane().add(h1);
		frame.setBounds(10, 10, 810, 837);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		board[7][7] = h1;
		h1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				action(7,7,h1);
			}
		});	
	}

	@SuppressWarnings("unlikely-arg-type")
	public void action(int c, int d, JButton e)
	{
		if(pick == true && whitemove == true)
		{
			if(!e.getIcon().toString().equals(""))
			{
				temp = e;
				a = c;
				b=d; 
				pick =false;
				col = e.getBackground();
				e.setBackground(Color.CYAN.brighter().brighter().brighter());
			}
		}  
		else if(pick == false && whitemove == true)
		{
			valid = false;
			if(temp.getIcon().toString().equals(wP))
			{
				Move.movewP(temp,a,b,e,c,d);
			}
			else if(temp.getIcon().toString().equals(wH.toString()))
			{
				Move.movewH(temp,a,b,e,c,d);
			}
			else if(temp.getIcon().toString().equals(wB))
			{
				Move.movewB(temp,a,b,e,c,d);
			}
			else if(temp.getIcon().toString().equals(wR))
			{
				Move.movewR(temp,a,b,e,c,d);
			}
			else if(temp.getIcon().toString().equals(wQ))
			{
				Move.movewQ(temp,a,b,e,c,d);
			}
			else if(temp.getIcon().toString().equals(wK))  
			{
				Move.movewK(temp,a,b,e,c,d);
			}
			

			pick = true;

			temp.setBackground(col);
			if(valid ==true)
			{

				computer.Computer();
				valid = false;
			}
		}
		else if(pick == true && whitemove == false)
		{
				if(!e.getIcon().toString().equals(""))
				{
					temp = e;
					a = c;
					b=d; 
					pick =false;
					col = e.getBackground();
					e.setBackground(Color.CYAN.brighter().brighter().brighter());
				}
		}  
		else if(pick == false && whitemove == false)
		{	
				if(temp.getIcon().toString().equals(bP))
				{
					Move.movebP(temp,a,b,e,c,d);
				}
				else if(temp.getIcon().toString().equals(bH.toString()))
				{
					Move.movebH(temp,a,b,e,c,d);
				}
				else if(temp.getIcon().toString().equals(bB))
				{
					Move.movebB(temp,a,b,e,c,d);
				}
				else if(temp.getIcon().toString().equals(bR))
				{
					Move.movebR(temp,a,b,e,c,d);
				}
				else if(temp.getIcon().toString().equals(bQ))
				{
					Move.movebQ(temp,a,b,e,c,d);
				}
				else if(temp.getIcon().toString().equals(bK))  
				{
					Move.movebK(temp,a,b,e,c,d);
				}
				pick = true;

				temp.setBackground(col);
				if(valid ==true)
				{
					computer.Computer();
					valid = false;
				}
		}
	}
}
