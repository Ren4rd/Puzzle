package puzzle;

public class Board {
	public Piece[][] plateauTab;

	public Board(Piece[][] plateauTab) {
		super();
		this.plateauTab = plateauTab;
	}
	public boolean possible(Piece piece,int i, int j){
		
		if (i!=0){
		if (piece.getValTab()[0]+plateauTab[i-1][j].getValTab()[2]!=0){
			return(false);	
			}
		}
		
		if (j!=0){
		if (piece.getValTab()[3]+plateauTab[i][j-1].getValTab()[1]!=0){
			return(false);	
			}
		}
		return true;
		
	}
	
	public void afficheBoard(Piece piece){
	
		for (int i=0;i<plateauTab.length; i++ ){
	      System.out.print("+--------------");
		}
		System.out.println("+");
		
		for (int i=0;i<plateauTab.length; i++ ){
			for (int j=0;j<plateauTab.length; j++){
			System.out.print("|    "+plateauTab[i][j].valTab[0]+"    ");
			}
			System.out.print("|");
			
			for (int j=0;j<plateauTab.length; j++){
			System.out.println("|  "+this.plateauTab[i][j].valTab[3]+" ["+this.etiquette+this.indiceRota+"] "+this.plateauTab[i][j].valTab[1]+"  ");
		    }
		for (int i=0;i<plateauTab.length; i++ ){
		  System.out.println("+--------------");
		}
		System.out.println("+");
	}


	

}
