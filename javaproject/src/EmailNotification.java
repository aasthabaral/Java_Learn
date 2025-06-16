public class EmailNotification {
    public static void sendEmail(String subject, String... recipients) {
            if (recipients.length == 0) {
                System.out.println(" No recipients provided. Cannot send email.");
                return;
            }
            System.out.println(" Sending Email");
            System.out.println("Subject: " + subject);
            System.out.println("Recipients:");

            for (String email : recipients) {
                System.out.println("xyz " + email);
            }

            System.out.println("Email sent successfully to " + recipients.length + " recipient(s).\n");
        }
        public static void main(String[] args) {
            sendEmail("Meeting Reminder", "xyz@example.com");
            sendEmail("Weekly Report", "abc@example.com", "cvb@example.com", "rty@example.com");
            sendEmail("System Alert");
        }
    }


