package SingleResponsibilty;

import java.time.LocalDateTime;

class SingleResponsibitlity_AntiPattern {
    static class Invoice {
        public int price;
        public LocalDateTime dateTime;

        public void calculateTotal() {

        }

        public void printInvoice() {

        }

        public void saveToFile() {

        }
    }
    // this is anti pattern

}