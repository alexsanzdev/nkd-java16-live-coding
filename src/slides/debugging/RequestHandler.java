package slides.debugging;

public class RequestHandler {

    private UserController userController;

    public RequestHandler(UserController userController) {
        this.userController = userController;
    }

    public void handle(Request request) {
        System.out.println("Handling request: " + request.getType());
        try {
            switch (request.getType()) {
                case "add-new-user":
                    userController.addNewUser(
                            request.getParameter("user-name"),
                            request.getParameter("first-name"),
                            request.getParameter("last-name"),
                            Boolean.valueOf(request.getParameter("admin"))
                    );
                    break;
                default:
                    throw new IllegalArgumentException("Unknown request type: " + request.getType());
            }
        } catch (Exception e) {
            throw new RequestException(request.getType(), e);
        }
    }
}
