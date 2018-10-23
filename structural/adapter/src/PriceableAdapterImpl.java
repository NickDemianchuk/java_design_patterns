public class PriceableAdapterImpl implements PriceableAdapter {
    private Priceable priceable;

    public PriceableAdapterImpl(Priceable priceable) {
        this.priceable = priceable;
    }

    @Override
    public double getPriceInEUR() {
        return priceable.getPrice() * 0.85;
    }
}
