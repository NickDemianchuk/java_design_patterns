public class AdapterDemo {
    public static void main(String[] args) {
        Priceable iPhoneXS = new iPhoneXS();
        PriceableAdapter USDToEUR = new PriceableAdapterImpl(iPhoneXS);
        System.out.println("iPhone XS in USD: " + iPhoneXS.getPrice());
        System.out.println("iPhone XS in EUR: " + USDToEUR.getPrice());
    }
}
