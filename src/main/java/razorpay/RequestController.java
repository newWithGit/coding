package razorpay;

public class RequestController {




    public void serveRequest() {
        RequestHandling requestHandler = new RequestHandling();
        int i = 0;
        while (i < 2) {
            System.out.println(requestHandler.handleRequest());
            i++;
        }
    }

    public static void main(String[] args) {
        new RequestController().serveRequest();
    }

}
