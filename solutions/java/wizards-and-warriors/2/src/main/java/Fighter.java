class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    boolean isVulnerable() {
        return false;
    }
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean has_prepared_spell = false;

    boolean isVulnerable() {
        return !has_prepared_spell;
    }
    
    void prepareSpell() {
        this.has_prepared_spell = true;
    }

    int getDamagePoints(Fighter fighter) {
        return has_prepared_spell ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}