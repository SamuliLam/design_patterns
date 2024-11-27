package facade;

public class Client {

    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();
        String joke = apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
        String exchangeRate = apiFacade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "rates.EUR");
        System.out.println(joke);
        System.out.println(exchangeRate);

    }
}