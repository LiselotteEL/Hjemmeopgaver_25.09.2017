public class TestAktie {
    public static void main(String[] args) {

// Creating new stock with given parametres
            Aktie aktie = new Aktie("ORCL","Oracle Corporation");

// Setting previousClosingPrice and currentPrice as per given numbers
            aktie.previousClosingPrice = 34.5;
            aktie.currentPrice = 34.35;

// Displaying the symbol + name, the previous and current price and the price-change percentage
            System.out.println("Aktie: " + aktie.symbol + " (" + aktie.name + ")");
            System.out.println("Forrige slutkurs på aktien: " + aktie.previousClosingPrice);
            System.out.println("Nuværende pris: " + aktie.currentPrice);
            System.out.println("Forskel på forrige pris og nuværende pris: " + aktie.getChangePercentage());
    }
}
