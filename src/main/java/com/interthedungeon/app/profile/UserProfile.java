import java.util.*;

public class UserProfile {
    private String id;
    private String keycloaksubject;
    private String roninWalletAddress;
    private Boolean verified;
    private Date verifiedTime;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeycloaksubject() {
        return this.keycloaksubject;
    }

    public void setKeycloaksubject(String keycloaksubject) {
        this.keycloaksubject = keycloaksubject;
    }

    public String getRoninWalletAddress() {
        return this.roninWalletAddress;
    }

    public void setRoninWalletAddress(String roninWalletAddress) {
        this.roninWalletAddress = roninWalletAddress;
    }

    public Boolean isVerified() {
        return this.verified;
    }

    public Boolean getVerified() {
        return this.verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Date getVerifiedTime() {
        return this.verifiedTime;
    }

    public void setVerifiedTime(Date verifiedTime) {
        this.verifiedTime = verifiedTime;
    }
}
