import com.interthedungeon.app.media.*;
import com.interthedungeon.app.enumerations.*;
import java.util.*;

public class Card {
    private String id;
    private String name;
    private String nftAddress;
    private Media cardImage;
    private Media equippedImage;
    private String flavorText;
    private RarityType rarity;
    private CardType cardType;
    private TargetType target;
    private EquippableModifier equippableModifier;
    private NonEquippableModifier nonEquippableModifier;
    private List<SpecialAbility> specialAbilities;

    private String equipmentModifierType;
    private String lhEquipmentModifierType;
    private String rhEquipmentModifierType;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNftAddress() {
        return this.nftAddress;
    }

    public void setNftAddress(String nftAddress) {
        this.nftAddress = nftAddress;
    }

    public Media getCardImage() {
        return this.cardImage;
    }

    public void setCardImage(Media cardImage) {
        this.cardImage = cardImage;
    }

    public Media getEquippedImage() {
        return this.equippedImage;
    }

    public void setEquippedImage(Media equippedImage) {
        this.equippedImage = equippedImage;
    }

    public String getFlavorText() {
        return this.flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public RarityType getRarity() {
        return this.rarity;
    }

    public void setRarity(RarityType rarity) {
        this.rarity = rarity;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public TargetType getTarget() {
        return this.target;
    }

    public void setTarget(TargetType target) {
        this.target = target;
    }

    public EquippableModifier getEquippableModifier() {
        return this.equippableModifier;
    }

    public void setEquippableModifier(EquippableModifier equippableModifier) {
        this.equippableModifier = equippableModifier;
    }

    public NonEquippableModifier getNonEquippableModifier() {
        return this.nonEquippableModifier;
    }

    public void setNonEquippableModifier(NonEquippableModifier nonEquippableModifier) {
        this.nonEquippableModifier = nonEquippableModifier;
    }

    public List<SpecialAbility> getSpecialAbilities() {
        return this.specialAbilities;
    }

    public void setSpecialAbilities(List<SpecialAbility> specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public String getEquipmentModifierType() {
        return this.equipmentModifierType;
    }

    public void setEquipmentModifierType(String equipmentModifierType) {
        this.equipmentModifierType = equipmentModifierType;
    }

    public String getLhEquipmentModifierType() {
        return this.lhEquipmentModifierType;
    }

    public void setLhEquipmentModifierType(String lhEquipmentModifierType) {
        this.lhEquipmentModifierType = lhEquipmentModifierType;
    }

    public String getRhEquipmentModifierType() {
        return this.rhEquipmentModifierType;
    }

    public void setRhEquipmentModifierType(String rhEquipmentModifierType) {
        this.rhEquipmentModifierType = rhEquipmentModifierType;
    }
}
