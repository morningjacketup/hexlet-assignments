package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {

    private final TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
