package creational.singleton;

public class UserInSystem {

    private String login;

    // statyczne pole
    private static UserInSystem instance;

    // prywatny konstruktor
    private UserInSystem(String login) {
        this.login = login;
    }

    // statyczna metoda getInstance()
    public static UserInSystem getInstance() {
        if(instance == null) {
            instance = new UserInSystem("nieznay");
        }
        return instance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
