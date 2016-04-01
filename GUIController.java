package Tetris;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import As33.RecursiveTreePainting;

public class GUIController extends  JPanel implements KeyListener{

	//get the Timer 
	/** create class variables**/
    private Timer timer;
    private int counter = 10; // the duration
    private int delay = 1000; // every 1 second
    private static final long serialVersionUID = 1L;
	private TetrisGame game;
	private GUIView view;
	public  static  String words1;
	public  static  String words2; 
	
	private JTextArea linesCleared = new JTextArea();
	private JTextArea TCleared = new JTextArea();
	private JPanel score;

	
	/** the constructor that creates new layout, listener,game,view and different components**/
	public  GUIController()
	{
		super( new BorderLayout() );
		setFocusable(true);
		addKeyListener(this);
		setupTimer();
		game = new TetrisGame();
		
		score = new JPanel();
		words1= "Lines cleared:          " + game.getlinesCleared();
		words2= "Tetrises cleared:         " + game.gettetrisesCleared();
		
//		linesCleared = new JLabel(words1);
//	    TCleared = new JLabel(words2);
	    
	    score.setLayout(new GridLayout(2,1));
	    score.add(linesCleared);
	    score.add(TCleared);
	    
        add( score, BorderLayout.NORTH );
        //keyPressed(e);
        view = new GUIView();
        add(view , BorderLayout.CENTER );
 
		// use the rest of the panel for a TreePainting object
		//add(view, BorderLayout.CENTER );	
		
	}
	
	/** set the time for every second call the function move down and refresh the linesCleared and TCleared**/
	 private void setupTimer() 
	 {
            //int a =0;
	        ActionListener action = new ActionListener()
	        {   
	     
              
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					game.attemptMove(4);
					view.setTetrisBoard(game.getTetrisBoard());
					linesCleared.setText("Lines cleared:         "
							+ " " + game.getlinesCleared());
					TCleared.setText("Tetrises cleared:        "
							+ " " + game.gettetrisesCleared());
				
					repaint() ;
				}
	        };

	        timer = new Timer(1000, action);
	        timer.start();
	    }
	
	
	
	 /**Handle the key-released event.**/
	 public void	keyReleased(java.awt.event.KeyEvent e)
	 {
		 
	 }
	 
	 
	 /**Handle the key-typed event.**/
	 public void	keyTyped(java.awt.event.KeyEvent e)
	 {
		 
	 }
	 
	 
	 /** return the game**/
	 public TetrisGame getGame()
	 {
		 return game;
	 }
	 
	 
	
	
	/**Handle the key-pressed event.**/
	public void keyPressed(KeyEvent e) {

		System.out.println("Key down is pressed.");
		
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		
		case KeyEvent.VK_DOWN:
			
				{
					game.attemptMove(4);
				}
			break;
		case KeyEvent.VK_LEFT:
				game.attemptMove(5);
			break;
		case KeyEvent.VK_RIGHT:
				game.attemptMove(1);
			break;
			
		case KeyEvent.VK_Z:
			
			game.attemptMove(2);
		break;
		
		case KeyEvent.VK_X:
			
			game.attemptMove(3);
		break;
		}
//		game.display();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

