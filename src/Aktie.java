public class Aktie {
    String symbol;
    String name;
    //
    double previousClosingPrice;
    double currentPrice;

    //Constructor that creates a stock with the specified symbol and name
    Aktie(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
            }

    //Method that returns then percentage changed from previousClosingPrice to currentPrice
    double getChangePercentage() {
        return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
    }
}
