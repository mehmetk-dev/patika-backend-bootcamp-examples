package Hafta2.OOP.BankingSystem;

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
