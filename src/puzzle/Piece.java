package puzzle;

public class Piece {
	private int[] valTab; 
	private String etiquette;
	private int indiceRota;
	
	public Piece(int[]valTab,String etiquette){
		this.valTab=valTab;
		this.etiquette=etiquette;
		this.indiceRota=0;
		
	}
	
	public int[] getValTab(){
		return this.valTab;
	}
	
	public void setValTab(int [] valTab){
		this.valTab=valTab;
	}

	public String getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}

	public int getIndiceRota() {
		return indiceRota;
	}

	public void setIndiceRota(int indiceRota) {
		this.indiceRota = indiceRota;
	}
	
	public void rotation(){
		int a=valTab[0];
		valTab[0]=valTab[3];
		valTab[3]=valTab[2];
		valTab[2]=valTab[1];
		valTab[1]=a;
		indiceRota=(indiceRota+1) % 4 ;
	}
	
	public void affichage(){
		System.out.println("+--------------+");
		System.out.println("|    "+this.valTab[0]+"    |");
		System.out.println("|  "+this.valTab[3]+" ["+this.etiquette+"] "+this.valTab[1]+"  |");
		System.out.println("|    "+this.valTab[2]+"    |");
		
	}
}
