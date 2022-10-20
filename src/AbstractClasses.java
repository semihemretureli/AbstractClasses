public class AbstractClasses {
    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator =new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalulators =new ManGameCalculator();
        gameCalulators.hesapla();

    }
}
