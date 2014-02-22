package puzzle;


public class Pool {
	public Piece[] pieceTab;
	public boolean[] utiliseTab;
	int i=0;
	
	public boolean toutParfait(){
	while (pieceTab[i].parfait() && i< pieceTab.length){
		i++;
		}
	return(i==pieceTab.length);
	}


}
