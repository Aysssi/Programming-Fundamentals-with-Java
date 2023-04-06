package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new LinkedHashMap<>();


        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int hero = 1; hero <=  n; hero++) {
            String [] heroDataArr =scanner.nextLine() .split("\\s+");
            String heroName = heroDataArr[0];
            int hp = Integer.parseInt(heroDataArr[1]);
            int mp = Integer.parseInt(heroDataArr[2]);

            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }

            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }


        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("CastSpell")) {

                String heroName = command.split("\\s+-\\s+")[1];
                int mpNeeded = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String spellName = command.split("\\s+-\\s+")[3];

                int currentMP = heroesMP.get(heroName);

                if(currentMP >= mpNeeded) {
                    int mpLeft = currentMP - mpNeeded;
                    heroesMP.put(heroName, mpLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }
            } else if (command.contains("TakeDamage")) {

                String heroName = command.split("\\s+-\\s+")[1];
                int damage = Integer.parseInt(command.split("\\s+-\\s+")[2]);
                String attacker = command.split("\\s+-\\s+")[3];

                int currentHP = heroesHP.get(heroName);

                currentHP -= damage;

                if (currentHP > 0) {
                    //жив
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    heroesHP.put(heroName, currentHP);
                } else {
                    //умрял
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    heroesHP.remove(heroName);
                    heroesMP.remove(heroName);
                }

            } else if (command.contains("Recharge")) {

                String heroName = command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);

                int currentMP = heroesMP.get(heroName);

                currentMP += amount;

                if (currentMP > 200) {
                    currentMP = 200;
                }

                //с колко се е увеличило: увеличеното - първоначалното
                System.out.printf("%s recharged for %d MP!%n", heroName, currentMP - heroesMP.get(heroName));
                heroesMP.put(heroName, currentMP);

            } else if (command.contains("Heal")) {

                String heroName = command.split("\\s+-\\s+")[1];
                int amount = Integer.parseInt(command.split("\\s+-\\s+")[2]);

                int currentHP = heroesHP.get(heroName);
                //възстановявам
                currentHP += amount;

                if (currentHP > 100) {
                    currentHP = 100;
                }

                //с колко се е увеличило: увеличеното - първоначалното
                System.out.printf("%s healed for %d HP!%n", heroName, currentHP - heroesHP.get(heroName));
                heroesHP.put(heroName, currentHP);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : heroesHP.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(" HP: " + entry.getValue());
            System.out.println(" MP: " + heroesMP.get(entry.getKey()));

        }



    }
}



