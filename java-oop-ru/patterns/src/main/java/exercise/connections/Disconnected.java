package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {

    private final TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }
}
// END
