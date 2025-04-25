package hafta2.oop.banking_system;

public enum CurrencyType {

    TL("₺"),
    DOLAR("$"),
    EURO("€"),
    GOLD("G");

    private final String symbol;

    CurrencyType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
