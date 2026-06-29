package oops_practice.gcr_codebase.Java_Polymorphism;
class GameCharacter {

    String characterName;

    GameCharacter(String name) {
        characterName = name;
    }

    void performAttack() {
        System.out.println("Character attacks");
    }
}

class Warrior extends GameCharacter {

    Warrior(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with Sword");
    }
}

class Mage extends GameCharacter {

    Mage(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts Fireball");
    }
}

class Archer extends GameCharacter {

    Archer(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots Arrow");
    }
}

public class GameDemo {

    static void startBattle(GameCharacter[] characters) {

        int warrior = 0;
        int mage = 0;
        int archer = 0;

        System.out.println("Battle Starts\n");

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warrior++;
            else if (c instanceof Mage)
                mage++;
            else if (c instanceof Archer)
                archer++;
        }

        System.out.println("\nParticipants");
        System.out.println("Warriors : " + warrior);
        System.out.println("Mages    : " + mage);
        System.out.println("Archers  : " + archer);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {

                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon"),
                new Mage("Harry")
        };

        startBattle(characters);
    }
}