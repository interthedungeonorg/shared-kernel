import java.util.*;

public class EquippableModifier {
    public int value;
    public int opposingValue;
    public int dungeonUses;

    public CrystalCost crystalCost;
    public TaxonomyType taxonomy;
    public int capacity;
    public List<EquippableSlotType> equippableSlotTypes;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOpposingValue() {
        return this.opposingValue;
    }

    public void setOpposingValue(int opposingValue) {
        this.opposingValue = opposingValue;
    }

    public int getDungeonUses() {
        return this.dungeonUses;
    }

    public void setDungeonUses(int dungeonUses) {
        this.dungeonUses = dungeonUses;
    }

    public CrystalCost getCrystalCost() {
        return this.crystalCost;
    }

    public void setCrystalCost(CrystalCost crystalCost) {
        this.crystalCost = crystalCost;
    }

    public TaxonomyType getTaxonomy() {
        return this.taxonomy;
    }

    public void setTaxonomy(TaxonomyType taxonomy) {
        this.taxonomy = taxonomy;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<EquippableSlotType> getEquippableSlotTypes() {
        return this.equippableSlotTypes;
    }

    public void setEquippableSlotTypes(List<EquippableSlotType> equippableSlotTypes) {
        this.equippableSlotTypes = equippableSlotTypes;
    }
}
