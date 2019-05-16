package razorpay;

import java.util.Objects;

public class Server {

    private String name;
    private int port;
    private double successProbability;

    public Server(String name, int port, double successProbability) {
        this.name = name;
        this.port = port;
        this.successProbability = successProbability;
    }

    public Server() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public double getSuccessProbability() {
        return successProbability;
    }

    public void setSuccessProbability(double successProbability) {
        this.successProbability = successProbability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Server)) return false;
        Server server = (Server) o;
        return getPort() == server.getPort() &&
                Double.compare(server.getSuccessProbability(), getSuccessProbability()) == 0 &&
                Objects.equals(getName(), server.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPort(), getSuccessProbability());
    }
}
