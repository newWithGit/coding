package java8;

public class TryWithoutCatch {
    public static void main(String[] args) {
        try(Resources r = new Resources()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Resources implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}
