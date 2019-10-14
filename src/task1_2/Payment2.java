package task1_2;

import java.util.ArrayList;
import java.util.List;

public class Payment2 {

    private String buyer;
    private List<String> details = new ArrayList<>();

    public static class Builder {
        private Payment2 newBuyer;
        private Payment2 newDetails;

        public Builder() {
            newBuyer = new Payment2();
            newDetails = new Payment2();
        }

        public Builder withBuer(String buer) {
            newBuyer.buyer = buer;
            return this;
        }

        public Payment2 build() {
            return newBuyer;
        }
    }


    public static void main(String[] args) {
        Payment2 myPayment = new Payment2.Builder()
                .withBuer("Jane")
                .build();
    }
}
