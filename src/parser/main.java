package parser;

import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) {
	 Parser scan = new Parser();
	 try {
		scan.reader();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
