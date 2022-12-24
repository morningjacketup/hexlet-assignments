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

    public void getCurrentState() {
        if (connection.getClass().equals(Connected.class)) {
            System.out.println("connected");
        }
        if (connection.getClass().equals(Disconnected.class)) {
            System.out.println("disconnected");
        }

    }

    public void connect() {
        if (connection.getClass().equals(Connected.class)) {
            System.out.println("ERROR ! Connection is already connected");
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
        this.data = text;
    }

    private void changeStateTo(Connection newConnection) {
        this.connection = newConnection;
    }
}
// END
