package slides.debugging;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private String type;
    private Map<String, String> parameters;

    public Request(String type) {
        this.type = type;
        parameters = new HashMap();
    }

    public void addParameter(String name, String value) {
        parameters.put(name, value);
    }

    public String getParameter(String name) {
        return parameters.get(name);
    }

    public String getType() {
        return type;
    }
}
