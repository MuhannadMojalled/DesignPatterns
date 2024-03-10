public class DBConnection {
    private static DBConnection db;
    private String host;
    private int port;

    private DBConnection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    // Add the word Synchronized to make it Thread-safe.
    public static DBConnection getInstance(String host, int port) {
        if (db == null) {
            db = new DBConnection(host, port);
        }
        return db;
    }

}