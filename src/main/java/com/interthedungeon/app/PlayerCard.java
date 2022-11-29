import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerCard {
    private String id;
    private String dungeonId;

    private Card card;

    private Player player;
    private int dungeonUsesRemaining;
    private int battleUsesRemaining;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Card getCard() {
        return this.card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getDungeonUsesRemaining() {
        return this.dungeonUsesRemaining;
    }

    public void setDungeonUsesRemaining(int dungeonUsesRemaining) {
        this.dungeonUsesRemaining = dungeonUsesRemaining;
    }

    public int getBattleUsesRemaining() {
        return this.battleUsesRemaining;
    }

    public void setBattleUsesRemaining(int battleUsesRemaining) {
        this.battleUsesRemaining = battleUsesRemaining;
    }

    public String getDungeonId() {
        return this.dungeonId;
    }

    public void setDungeonId(String dungeonId) {
        this.dungeonId = dungeonId;
    }
}
