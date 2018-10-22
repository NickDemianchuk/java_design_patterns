public class PriceableAdapterImpl implements PriceableAdapter {
    Priceable phone;

    public PriceableAdapterImpl(Priceable phone){
        this.phone = phone;
    }

    @Override
    public double getPrice() {
        return phone.getPrice() * 0.87;
    }
}
