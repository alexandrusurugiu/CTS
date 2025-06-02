package api.clase;

public class Api implements APIExtern {
    @Override
    public String obtineDate(String parametru) {
        return "Data from the API: " + parametru;
    }
}
