public final class User {

    private static User user;

    private User() {
    }


    public static synchronized User getUser() {

        if (user == null) {

            user = new User();
            System.out.println("New user is elected for your team");

        } else {

            System.out.println("Your team already has a user");
        }

        return user;
    }
}