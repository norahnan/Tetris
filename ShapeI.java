package Tetris;

public class ShapeI extends Piece {

	
	public  boolean WR[][][]= {
			{
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false},
			},
			{
				{false, false, false, false},
				{true, true, true, true},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false},
			},
			{
				{false, false, false, false},
				{true, true, true, true},
				{false, false, false, false},
				{false, false, false, false},
			},
		};
	/** override the original withroatation 
	 * array in the piece to the shape's format**/
	public ShapeI()
	{
		super();
		withRoatation = WR;

	}
	
//	private boolean[][][] withRoatation = new boolean[4][4][4];
//
//	public static final int NUM = 4;
//	private boolean[][] shape0 = new boolean[NUM][NUM];
//	private boolean[][] shape90 = new boolean[NUM][NUM];
//	private boolean[][] shape180 = new boolean[NUM][NUM];
//	private boolean[][] shape270 = new boolean[NUM][NUM];
//	
//	shape0 = super.pieceArray;
//	shape90 = super.pieceArray;
//	
//	
//	/** record what the shape would look like after rotation **/
//	
//	shape0[0][1] = true;
//	shape0[1][1] = true;
//	shape0[2][1] = true;
//	shape0[3][1] = true;//yes
//	
//	shape90[1][0] = true;
//	shape90[1][1] = true;
//	shape90[1][2] = true;
//	shape90[1][3] = true;//yes
//	
//
//	shape180 = shape0;
//	shape270 = shape90;
//	
//	withRoatation[0]= shape0;
//	withRoatation[1]= shape90;
//	withRoatation[2]= shape180;
//	withRoatation[3]= shape270;
//	
////	/**get the piece 3D array after a rotation cw **/
////	public boolean[][] afterRoteCW(boolean[][][] withRoatatio, int m)
////	{
////		boolean[][] arrayNow = new boolean [4][4];
////		arrayNow = withRoatatio[(m+1)%4];
////		
////		return arrayNow;
////	}
////	
////	/**get the piece 3D array after a rotation ccw **/
////	public boolean[][] afterRoteCCW(boolean[][][] withRoatatio, int m)
////	{
////		boolean[][] arrayNow = new boolean [4][4];
////
////		arrayNow = withRoatation[(m+1)%4];
////		
////		return arrayNow;
////	}
	
	
}
