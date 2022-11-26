public class SpecialAbility {
    public String id;
    public String name;
    public String image;
    public int lootPercentModifier;
    public SpecialAbilityTypes type;

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

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLootPercentModifier() {
        return this.lootPercentModifier;
    }

    public void setLootPercentModifier(int lootPercentModifier) {
        this.lootPercentModifier = lootPercentModifier;
    }

    public SpecialAbilityTypes getType() {
        return this.type;
    }

    public void setType(SpecialAbilityTypes type) {
        this.type = type;
    }
}
