package slides.debugging;

public class Example {

    public static void main(String[] args) {

        Request request = new Request("add-new-user");
        request.addParameter("user-name", "alexsanzdev");
        request.addParameter("first-name", "Alex");
        request.addParameter("last-name", "Sanchez");
        request.addParameter("admin", "true");

        try {
            getRequestHandler().handle(request);
        } catch (RequestException re) {
            System.err.println("Request was aborted due to an exception.");
            re.printStackTrace();
        }
    }

    private static RequestHandler getRequestHandler() {
        return new RequestHandler(
                new UserController(
                        new InMemoryUserDatabase()
                )
        );
    }
}
