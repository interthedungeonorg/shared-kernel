import com.interthedungeon.app.modifiers.*;

public class Player {
    private String id;
    private String subject;

    private EquipmentSlot bothFeetEquipmentSlot;
    private EquipmentSlot bothHandsEquipmentSlot;
    private EquipmentSlot headEquipmentSlot;
    private EquipmentSlot leftFootEquipmentSlot;
    private EquipmentSlot leftHandEquipmentSlot;
    private EquipmentSlot rightFootEquipmentSlot;
    private EquipmentSlot rightHandEquipmentSlot;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public EquipmentSlot getBothFeetEquipmentSlot() {
        return this.bothFeetEquipmentSlot;
    }

    public void setBothFeetEquipmentSlot(EquipmentSlot bothFeetEquipmentSlot) {
        this.bothFeetEquipmentSlot = bothFeetEquipmentSlot;
    }

    public EquipmentSlot getBothHandsEquipmentSlot() {
        return this.bothHandsEquipmentSlot;
    }

    public void setBothHandsEquipmentSlot(EquipmentSlot bothHandsEquipmentSlot) {
        this.bothHandsEquipmentSlot = bothHandsEquipmentSlot;
    }

    public EquipmentSlot getHeadEquipmentSlot() {
        return this.headEquipmentSlot;
    }

    public void setHeadEquipmentSlot(EquipmentSlot headEquipmentSlot) {
        this.headEquipmentSlot = headEquipmentSlot;
    }

    public EquipmentSlot getLeftFootEquipmentSlot() {
        return this.leftFootEquipmentSlot;
    }

    public void setLeftFootEquipmentSlot(EquipmentSlot leftFootEquipmentSlot) {
        this.leftFootEquipmentSlot = leftFootEquipmentSlot;
    }

    public EquipmentSlot getLeftHandEquipmentSlot() {
        return this.leftHandEquipmentSlot;
    }

    public void setLeftHandEquipmentSlot(EquipmentSlot leftHandEquipmentSlot) {
        this.leftHandEquipmentSlot = leftHandEquipmentSlot;
    }

    public EquipmentSlot getRightFootEquipmentSlot() {
        return this.rightFootEquipmentSlot;
    }

    public void setRightFootEquipmentSlot(EquipmentSlot rightFootEquipmentSlot) {
        this.rightFootEquipmentSlot = rightFootEquipmentSlot;
    }

    public EquipmentSlot getRightHandEquipmentSlot() {
        return this.rightHandEquipmentSlot;
    }

    public void setRightHandEquipmentSlot(EquipmentSlot rightHandEquipmentSlot) {
        this.rightHandEquipmentSlot = rightHandEquipmentSlot;
    }
}
