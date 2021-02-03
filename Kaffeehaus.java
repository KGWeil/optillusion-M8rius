
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
       
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {background(255); //Hintergrund weiß
     int s; //Deklarieren: Erstellung Variable 
     s = 40; //Intitialisierung: Hat nun Wert 40
     int[] abstaende ={10,20,30,20,10,20,30,20,10};
     for(int i=0; i<10; i++)
     {
         line(0,i*s,640,i*s); //Parallelen zeichnen
         stroke(130);//Frabe grau der Parallelen 
     }
     for( int k=0; k<9; k++){
         fill(0);
         for(int i=0; i<8; i++)
            {rect(abstaende[k]+2*s*i,k*s,s,s);
            }
      stroke(100);
      
    }
        
        
     
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
