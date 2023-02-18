package SerializationAndDeserialization;

public class LoginResponse {
    String token;
    String userİd;
    String message;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserİd() {
        return userİd;
    }

    public void setUserİd(String userİd) {
        this.userİd = userİd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
