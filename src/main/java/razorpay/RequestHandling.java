package razorpay;

import java.util.LinkedHashSet;
import java.util.Set;

// request has to always go to s1 first, then s3, then s2
// if doesn't falls under any of them, return please retry

public class RequestHandling {

    private static Set<Server> servers = new LinkedHashSet<>();

    static {
        Server s1 = new Server("S1", 8080, 0.9d);
        Server s2 = new Server("S2", 8081, 0.8d);
        Server s3 = new Server("S3", 8082, 0.5d);

        servers.add(s1);
        servers.add(s3);
        servers.add(s2);

    }


    public String handleRequest() {
        String serviceHandledBy = "Service was handled by ";
        for (Server server: servers) {
            double randomNum = getRequestProbability();
            if (randomNum >= server.getSuccessProbability()) {
                System.out.println(randomNum);
                return serviceHandledBy + server.getName() + " with request Success Probability: " + server.getSuccessProbability();
            }
            System.out.println(randomNum);
        }
        return "Please retry";
    }

    private double getRequestProbability() {
        return Math.random();
    }

}
