public class DependenciesInversion {
    static class NotificationService {
        public void sendNotification(MessageSender messageSender) {
            messageSender.sendMessage("hello world");
        }
    }

    static class EmailService implements MessageSender {
        
        @Override
        public void sendMessage(String message) {
            System.out.println("send email");
        }
    }

    static interface MessageSender {
        void sendMessage(String message);
    }

    static class SMSService implements MessageSender {
        @Override
        public void sendMessage(String message) {
            System.out.println("send sms");
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();

        notificationService.sendNotification(emailService);
        notificationService.sendNotification(smsService);
    }

}
