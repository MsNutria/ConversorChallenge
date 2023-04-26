import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> rates;
    
    public CurrencyConverter() {
        // Inicializamos el mapa de tasas de cambio con las tasas actuales.
        // Las tasas de cambio se obtienen de una fuente externa, como un servicio web o una base de datos.
        rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.821763);
        rates.put("JPY", 109.1726);
        rates.put("GBP", 0.721512);
        rates.put("CAD", 1.253573);
        rates.put("AUD", 1.308514);
        rates.put("COP", 3849.69); // Tasa de cambio COP/USD al 26 de abril de 2023.
    }
    
    public double convert(double amount, Currency from, Currency to) {
        double fromRate = rates.get(from.getCode());
        double toRate = rates.get(to.getCode());
        return (amount / fromRate) * toRate;
    }
}