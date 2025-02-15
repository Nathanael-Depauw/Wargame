package vue;

//import java.awt.EventQueue;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
//import java.awt.Polygon;

// import javax.swing.JComponent;
//import javax.swing.JFrame;

// Classe principale du plateau de jeu � excuter pour l'affichage du graphisme 

// public class Plateau extends JComponent  {
// public class Plateau extends JFrame{
public class Plateau{

//	private static final long serialVersionUID = 1L;
	
	boolean etat;
	int size;	
    public Dessin_polygone carte;
	public Hexagone[][] tri_1 = new Hexagone[9][9];
	public Hexagone[][] tri_2 = new Hexagone[9][9];
	public int row = -1;
	public int col = -1;
	public boolean tri_hexa;
    int x_init[] = { 0, 20, 50, 70, 50, 20 };
    int y_init[] = { 30, 0, 0, 30, 60, 60 };
    int x_init_2[] = { 50, 70, 100, 120, 100, 70 };
    int y_init_2[] = { 60, 30, 30, 60, 90, 90 };
	
	public Plateau() {
		initPolygone();
    }

    // Initialisation du tableau de hexagone avec leurs differents types d'hexagone et coordonées
    
    private void initPolygone() {
        for (int x = 0; x < this.tri_1.length; x++) {
            for (int y = 0; y <  this.tri_1.length; y++) {

                if (x == 2 && (y == 6 || y == 5) ) {
            		this.tri_1[x][y] = new Colline(x_init, y_init);
            		this.tri_2[x][y] =  new Colline(x_init_2, y_init_2);
            	}else if (x == 4 &&(y == 2 || y == 3) ) {
            		this.tri_1[x][y] = new Village(x_init, y_init);
            		this.tri_2[x][y] =  new Village(x_init_2, y_init_2);
            	}else if (x == 6 && (y == 7 || y == 8)) {
            		this.tri_1[x][y] = new Montagne(x_init, y_init);
            		this.tri_2[x][y] =  new Montagne(x_init_2, y_init_2);
            	}else if ((x == 7 || x == 8) && (y == 4 || y == 5)) {
            		this.tri_1[x][y] = new Plaine(x_init, y_init);
            		this.tri_2[x][y] =  new Plaine(x_init_2, y_init_2);
            	}else {
            		this.tri_1[x][y] = new Foret(x_init, y_init);
            		this.tri_2[x][y] =  new Foret(x_init_2, y_init_2);
            	}

                for (int j = 0; j < x_init.length; j++) {
                    x_init[j] += 100;
                    x_init_2[j] += 100;
                }
            }
            x_init[0] = 0;
            x_init[1] = 20;
            x_init[2] = 50;
            x_init[3] = 70;
            x_init[4] = 50;
            x_init[5] = 20;
            x_init_2[0] = 50;
            x_init_2[1] = 70;
            x_init_2[2] = 100;
            x_init_2[3] = 120;
            x_init_2[4] = 100;
            x_init_2[5] = 70;
            for (int j_x = 0; j_x < y_init.length; j_x++) {
                y_init[j_x] += 60;
                y_init_2[j_x] += 60;
            }
        }
    }

  
//    public static void main(String[] args) {
		// EventQueue.invokeLater(new Runnable() {
		// 	public void run() {
		// 		try {
		// 			Plateau frame = new Plateau();
		// 			frame.setVisible(true);
                    
        //             Dessin_polygone carte = new Dessin_polygone(frame.tri_1, frame.tri_2, frame.row, frame.col, frame.tri_hexa);
                    
        //             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //             frame.add(carte);
        //             frame.setSize(860, 600);
                    
		// 			// Hexagone carte = InitPolygone();
		// 	        // frame.add(carte);
		// 	        carte.addMouseListener(new MouseListen(carte));
		// 		} catch (Exception e) {
		// 			e.printStackTrace();
		// 		}
		// 	}
		// });
//    	new Plateau();
//    }
	 
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
}
