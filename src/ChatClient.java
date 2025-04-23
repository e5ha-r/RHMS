public class ChatClient {
    private String username;
    private ChatServer server;

    public ChatClient(String username, ChatServer server) {
        this.username = username;
        this.server = server;
    }

    public void sendMessage(String to, String message) {
        server.sendMessage(username, to, message);
    }
}
