import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerCardWrapper {
    private PlayerCard data;

    public PlayerCard getData() {
        return this.data;
    }

    public void setData(PlayerCard data) {
        this.data = data;
    }
}
