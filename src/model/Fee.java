package model;

public class Fee {
    private double feeAmount;
    private Status paymentStatus;

    public Fee(double feeAmount, Status paymentStatus) {
        this.feeAmount = feeAmount;
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentStatus(Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
