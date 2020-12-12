package creational.singleton;

public class Main {

    public static void main(String[] args) {

        UserInSystem user = UserInSystem.getInstance();
        System.out.println("Login: " + user.getLogin());

        // Zmiana loginu
        user.setLogin("krol1");

        // Dla sprawdzenia pobieramy ponownie instancje
        UserInSystem user2 = UserInSystem.getInstance();
        System.out.println("Login po zmianie: " + user2.getLogin());
    }
}
