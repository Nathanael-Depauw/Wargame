package vue;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.util.Arrays;

public class MouseListen extends MouseAdapter {

	public Dessin_polygone plateau;

	public MouseListen(Dessin_polygone plateau) {
		this.plateau = plateau;

	}
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.plateau.row = this.plateau.col = -1;

//       System.out.println(x+"<-x et y->"+y);
//       System.out.println("before tri_hexa = "+this.plateau.tri_hexa);
	   
        for (int i = 0; i < this.plateau.tri_1.length; i++)
            for (int j = 0; j <  this.plateau.tri_1.length; j++)
                if (this.plateau.tri_1[i][j].getDessin_hexa().contains(x, y) || this.plateau.tri_2[i][j].getDessin_hexa().contains(x, y)) {
                	if ( this.plateau.tri_2[i][j].getDessin_hexa().contains(x, y)) {
                		this.plateau.row = i;
                		this.plateau.col = j;
                		this.plateau.tri_hexa= false;
                	}else {
                		this.plateau.row = i;
                		this.plateau.col = j;
                		this.plateau.tri_hexa= true;
                	}
//					System.out.println(i+"<-i et j->"+j);
//					System.out.println(i+"<-i et j->"+j);
//					 System.out.println("coord = " + this.plateau.tri_2[i][j].getDessin_hexa().getBounds());
					// System.out.println("coord = " + Arrays.toString(this.plateau.tri_2[i][j].getY_coord()));
                }
        this.plateau.repaint();

//		System.out.println("------------------");


    }
}
