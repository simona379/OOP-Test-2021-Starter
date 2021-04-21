// C19343861
// Simona Petrauskaite
// DT228/2

package ie.tudublin;

public class Main
{
    public void helloProcessing1()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ScoreDisplay());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.helloProcessing1();
    }
} 