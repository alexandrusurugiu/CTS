package api.clase;

public class APIProxy implements APIExtern {
    private Api api;
    private static final int LIMIT = 100;
    private int accessTimes = 0;

    @Override
    public String obtineDate(String parametru) {
        if (accessTimes < LIMIT) {
            if (api == null) {
                api = new Api();
            }
            accessTimes++;
            return api.obtineDate(parametru);
        } else {
            throw new RuntimeException("Message limit reached!");
        }
    }
}
