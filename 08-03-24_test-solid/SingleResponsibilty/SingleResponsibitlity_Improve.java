package SingleResponsibilty;

import java.time.LocalDateTime;

class SingleResponsibitlity_Improve {
    static class Invoice {
        public int price;
        public LocalDateTime dateTime;

        public void calculateTotal() {

        }
    }

    static class InvoicePrinter {
        public void print(Invoice invoice) {

        }
    }

    static class InvoiceStorage {
        public void saveToFile(Invoice invoice) {

        }
    }
    // this is anti pattern

}