import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileWrapper {
    private UserProfile data;

    public UserProfile getData() {
        return this.data;
    }

    public void setData(UserProfile data) {
        this.data = data;
    }
}