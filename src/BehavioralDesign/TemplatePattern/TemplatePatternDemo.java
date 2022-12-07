package BehavioralDesign.TemplatePattern;

//This is a class.
public class TemplatePatternDemo {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class c=Class.forName("BehavioralDesign.TemplatePattern.Chess");
        Game game=(Game) c.newInstance();
        game.play();
    }
}// End of the Soccer class.