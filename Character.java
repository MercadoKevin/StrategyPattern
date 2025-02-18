public class Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
        }
    }
}
