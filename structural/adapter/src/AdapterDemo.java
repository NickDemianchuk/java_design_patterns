public class AdapterDemo {
    public static void main(String[] args) {
        Priceable iPhoneXS = new IPhoneXS();
        PriceableAdapter adapter = new PriceableAdapterImpl(iPhoneXS);
        System.out.println(adapter.getPriceInEUR());
    }
}
