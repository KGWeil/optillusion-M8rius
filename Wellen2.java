
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{   int s; //Seitenlänge 
    int farbe; //Farbe des Qudrates 
    int grün; //Grüne Farbe
    int weiß; //Weiße Farbe 
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */

    public void settings()
    {
        size(600,600);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(255);
        s=50;
        grün=color(0,255,0); 
        weiß=color(255,255,255);
        alleQuadrate();

    }

    /**
     * Methode zeichneQuadrat
     *
     * @param x - x-Koordinate
     * @param y - y-Koordinate
     * s - seitenlänge 
     */
    public void zeichneQuadrat(int x, int y, int s)
    {
        rect(x,y,s,s);
    }

    public void alleQuadrate(){
        farbe=grün;
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i <= 10; i ++) {
                fill (farbe);
                stroke(farbe);
                strokeWeight(1);
                zeichneQuadrat(i*s+25,j*s+25,s);
                if (farbe==grün){
                    farbe=weiß;}
                else{
                    farbe=grün;}
                fill (farbe);
                stroke(farbe);
                strokeWeight(1);
                zeichneQuadrat(i*s+25+9/2,j*s+25+8/2,s-9);
            }
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
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
