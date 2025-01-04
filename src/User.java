abstract class User {
    public int userId;
    public String name;
    public String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }
}
