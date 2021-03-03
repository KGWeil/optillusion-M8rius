
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{   int s; //erstelle Variable s  
    int r; //erstele Variable r
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    
    public void settings()
    {
        size(500,500);

    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(0xFAA317);
        // Zeichnen der optischen Täuschung
        alleQuadrate();
        
        s = 50; //Variable s hat nun diesen Wert
        zeichneQuadrat(50,50,255,true);
    }

    int farbwechsel (int farbe) {
        if (farbe==255)  //Farbe ist weiß
            farbe=0; 
        else  //Farbe ist nicht weiß
            farbe=255;
        return farbe;
    }

    /**
     * Zeichnet ein Quadrat der optischen Illusion
     * @param    x=0   x-Koordinate Quadrat
     * @param    y=0   y-Koordinate Quadrat
     * @param    farbe    Füllfarbe des Quadrats
     * @param    links    Falls links true ist: Kreise links; falls links false ist: Kreise rechts
     */

    public void zeichneQuadrat(int x, int y, int farbe, boolean links)
    {
        ellipseMode(CORNER);  // Set ellipseMode is CORNER
        fill(255);
        rect(x,y,s,s);
        
        fill(farbwechsel(farbe)); 

        int r = s/10; //Radius des 
        if(links)
        {
            ellipse(x,y,2*r,2*r); //zeichnet Kreise links oben im Quadrat
            ellipse(x,y+r*8,2*r,r*2); //zeichnet Kreise links unten im Quadrat
        }  
        else
        {
            ellipse(x+r*8,y,x+s,y+r*2);  //zeichnet Kreise rechts oben im Quadrat
            ellipse(x+r*8,y+r*8,x+s,y+s); //zeichnet Kreise rechts unten im Quadrat

        }  
    }

    public void alleQuadrate(){  
        noStroke();
        int aktuelleFarbe = 255; // Farbe 1. Quadrat weiß
        boolean pos_aktuell = true; // Kreise zunächst links
        for (int j=0; j<=3; j++) {
            for (int i=0; i<=7; i++) {
                zeichneQuadrat(i*s,0,aktuelleFarbe,true);
                // Farbwechsel für nächstes Quadrat
                if (aktuelleFarbe == 255) {
                    aktuelleFarbe = 0;
                } else {
                    aktuelleFarbe = 255;
                }
            } // end Zeichnen einer Reihe
            // Farbwechsel für nächstes Quadrat
            if (aktuelleFarbe == 255) {
                aktuelleFarbe = 0;
            } else {
                aktuelleFarbe = 255;
            }
            // Wechsel Position der Kreise
            if (pos_aktuell == true) {
                pos_aktuell = false;
            } else {
                pos_aktuell = true;
            }
        }
    }

    /** 
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() } ); {
        } 
    }  
}