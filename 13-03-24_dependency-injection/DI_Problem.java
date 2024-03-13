class DI_Problem {

    static class NotificationService {
        public void pushNotification() {
            SMSService service = new SMSService();
            service.sendSMS();
        }
    }

    static class SMSService {
        public void sendSMS() {
            System.out.println("sms");
        }
    }

    static class EmailService {
        public void sendEmail() {
            System.out.println("email");

        }
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.pushNotification();
    }
}