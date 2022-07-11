public class ClientSingleton {

    public static void main(String[] args) {

        User user1 = User.getUser();

        User user2 = User.getUser();

        if (user1 == user2) {

            System.out.println("user1 and user2 are same instance");
        }

    }
}