package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

// BEGIN
public class TcpConnection {
    private final String ip;
    private final int port;
    private Connection connection;
    private String data;
    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        connection = new Disconnected(this);
    }

    public String getCurrentState() {
        return connection.getCurrentState();
    }

    public void connect() {
        if (connection.getClass().equals(Connected.class)) {
            System.out.println("Error! Connection is already connected");
        }
        changeStateTo(new Connected(this));
    }

    public void disconnect() {
        if (connection.getClass().equals(Disconnected.class)) {
            System.out.println("Error! Connection is already disconnected");
        }
        changeStateTo(new Disconnected(this));
    }

    public void write(String text) {
        if (connection.getClass().equals(Disconnected.class)) {
            System.out.println("Error! Connection is disconnected");
        }
        this.data = text;
    }

    private void changeStateTo(Connection newConnection) {
        this.connection = newConnection;
    }
}
// END
