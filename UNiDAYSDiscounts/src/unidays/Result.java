package unidays;

public class Result {
    private double total;
    private double deliveryCharge;

    /**
     * @param total
     * @param deliveryCharge
     */
    public Result(double total, double deliveryCharge){
        this.total = total;
        this.deliveryCharge = deliveryCharge;
    }

    /**
     * @return total price
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return delivery charge price
     */
    public double getDeliveryCharge() {
        return deliveryCharge;
    }
}
