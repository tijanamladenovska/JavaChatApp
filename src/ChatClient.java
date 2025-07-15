import java.io.*;
import java.net.*;
import java.util.function.Consumer;

public class ChatClient {
  private final Socket socket;
  private final BufferedReader in;
  private final PrintWriter out;
  private final Consumer<String> onMessageReceived;

  public ChatClient(String serverAddress, int serverPort, Consumer<String> onMessageReceived) throws IOException {
      this.socket = new Socket(serverAddress, serverPort);
      this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      this.out = new PrintWriter(socket.getOutputStream(), true);
      this.onMessageReceived = onMessageReceived;
  }

  public void sendMessage(String msg) {
      out.println(msg);
  }

  public void startClient() {
      new Thread(() -> {
          try {
              String line;
              while ((line = in.readLine()) != null) {
                  onMessageReceived.accept(line);
              }
          } catch (IOException e) {
              System.err.println("Error in client: " + e.getMessage());
          }
      }).start();
  }
}