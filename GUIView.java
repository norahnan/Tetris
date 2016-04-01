package Tetris;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Assignment2Part2.TreePainting;

public class GUIView extends JComponent{
	/** create class variable**/
	private JPanel mainPanel;
	//private TetrisGame game = new TetrisGame();
	
	
	/** the constructor**/
	public GUIView()
	{
		//board = new Board();
		//Graphics g;
		super.setLayout( new BorderLayout() );
		//paint(g);
		repaint();

		//controller.getgame
		
		
		mainPanel = new JPanel();
		//mainPanel.setLayout(new GridLayout(3,1));
		
		mainPanel.add( new Board());
		
		add(mainPanel, BorderLayout.CENTER );
		
	}
	
	private Board board;
	/**Compute the best block size for the current width and height.**/
	private int computeBlockSize(int width)
	{
		return width/board.NUM_COL;
	}
	
	/**Paint the game.**/
	public void paint(Graphics g)
	{
		
		g.setColor(Color.WHITE);
		g.fillRect(0,0,GUIApplication.WIDTH,GUIApplication.HEIGHT);
		g.setColor(Color.BLACK);
		g.drawRect(0,0,GUIApplication.WIDTH,GUIApplication.HEIGHT);
		int block = computeBlockSize(GUIApplication.WIDTH);
		//paintBoardOutline(g,block);
		
		paintBlock(g,block);
		System.out.println("I should print multiple times.");
	}
	
	
	
	/** paint the blocks**/
	private void paintBlock(Graphics g,int blockSize)
	{					//System.out.println("this is block size" +blockSize );

		for (int i = 0; i<Board.NUM_ROW; i++)
		{
			for (int j = 0; j<Board.NUM_COL; j++)
			{
				if(board.hasBlock(i, j))
				{
					
					 g.setColor(Color.RED);
					 System.out.println(i+"location where there is piece"+j);
					//g.drawRect(i*blockSize, j*blockSize, blockSize, blockSize);
					g.fillRect(j*blockSize, i*blockSize, blockSize, blockSize);
					//System.out.println("this is where the left up corner"+j*blockSize);
					g.setColor(Color.BLACK);
					g.drawRect(j*blockSize, i*blockSize, blockSize, blockSize);
				}
				
			}
		
		}
	}

	/** set the board to the updated one**/
	public void setTetrisBoard(Board b) 
	{
		board = b;
	}
	
	   
}
