class MusicPlayer extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("🎵 Playing music...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // handle exception
            }
        }
    }
}

class ChatApp extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("💬 Sending message...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class MultithreadEg {
    public static void main(String[] args) {
        MusicPlayer music = new MusicPlayer();
        ChatApp chat = new ChatApp();

        music.start();
        chat.start();

        System.out.println("📱 App is running...");
    }
}
