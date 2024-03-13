public class DI_Solution {
    static class NotificationService {

        private MessageService messageService;

        public NotificationService(DI_Solution.MessageService messageService) {
            this.messageService = messageService;
        }

        public void pushNotification() {
            messageService.sendMessage();
        }
    }

    interface MessageService {
        void sendMessage();
    }

    static class SMSService implements MessageService{
        @Override
        public void sendMessage() {
            System.out.println("sms");
        }
    }

    static class EmailService implements MessageService{
        @Override
        public void sendMessage() {
            System.out.println("email");

        }
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.pushNotification();
    }
}
