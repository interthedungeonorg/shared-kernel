public class NonEquippableModifier {
    public int value;
    public int opposingValue;
    public int battleUses;

    public CrystalCost crystalCost;
    public TaxonomyType taxonomy;

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

    public int getBattleUses() {
        return this.battleUses;
    }

    public void setBattleUses(int battleUses) {
        this.battleUses = battleUses;
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
}
