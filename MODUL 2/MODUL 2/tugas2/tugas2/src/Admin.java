class Admin {
    String username = "admin189";
    String password = "password189";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
    public void displayInfo() {
        System.out.println("Login Admin Berhasil!");
    }
}