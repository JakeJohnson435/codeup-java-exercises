package CYOAproject;

import java.util.Scanner;
import java.util.Random;

public class Combat {

    static int damage;
    static int damage2;
    static int block;
    static int fleeChance;
    static int heal;
    static boolean flee;
    static Random rand = new Random();
    static Random rand2 = new Random();


    public static int meleeCombat(int playerDamage, int enemyHealth){
        damage = rand.nextInt(playerDamage) + 1;
        System.out.println("Your attack does " + damage + " to the target.");
        enemyHealth = enemyHealth - damage;
        System.out.println();
        return enemyHealth;
    }

    public static int enemyTurn(int enemyDamage, int playerHealth){
        damage = rand.nextInt(enemyDamage) + 1;
        System.out.println("The enemy does " + damage + " to you.");
        playerHealth = playerHealth - damage;
        System.out.println();
        return playerHealth;
    }

    public static int defend(int playerHealth, int playerArmor, int enemyDamage){
        block = rand.nextInt(playerArmor) + 1;
        damage = rand2.nextInt(enemyDamage) + 1;
        int damageAfterBlock = 0;

        if (block >= damage){
            System.out.println("You were able to successfully block the attack.");
        } else {
            System.out.println("Your attempted defend managed to block " + block + " damage. You took " + (damage - block) + " damage.");
            damageAfterBlock = (damage - block);
        }
        playerHealth = playerHealth - damageAfterBlock;
        return playerHealth;
    }

    public static boolean flee(){
        fleeChance = rand.nextInt(10) + 1;
        if (fleeChance % 2 == 0) {
            System.out.println("You escape from the battle.");
            flee = true;
        } else {
            System.out.println("The enemy blocks your way keeping you in the fight.");
            flee = false;
        }
        return flee;
    }

    public static int spell(String playerSpell, int enemyHealth){
        if (playerSpell.equalsIgnoreCase("fireball")){
            damage = rand.nextInt(20 - 10 + 1) + 10;
            System.out.println("Your Fireball blasts against the target dealing " + damage + " damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("chain lightning") || playerSpell.equalsIgnoreCase("lightning")){
            damage = rand.nextInt(15 - 5 + 1) + 5;
            System.out.println("Your Chain Lightning cuts through the target dealing " + damage + " damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("poison spray")){
            damage = rand.nextInt(10 - 5 + 1) + 5;
            System.out.println("Your Poison Spray splashes into the target's face dealing " + damage + " damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("earthquake")){
            damage = rand.nextInt(20 - 10 + 1) + 10;
            System.out.println("An Earthquake ripples through the ground dealing " + damage + " damage to your enemies.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("freeze")){
            damage = rand.nextInt(15 - 10 + 1) + 10;
            System.out.println("You manifest a spear of ice hurling it at your target. It pierces them for " + damage + " damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("smite")){
            damage = rand.nextInt(8 - 5 + 1) + 5;
            System.out.println("Holy light crashes from the heavens smiting your enemy for " + damage + " damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (playerSpell.equalsIgnoreCase("hail of thorns")){
            damage = rand.nextInt(5 - 2 + 1) + 2;
            damage2 = rand.nextInt(5 - 2 + 1) + 2;
            System.out.println("You hit the enemy twice for " + damage + "and " + damage2 + " damage.");
            enemyHealth = enemyHealth - (damage + damage2);
        }

        return enemyHealth;
    }

    public static int condition(String enemyCondition, int enemyHealth){
        if (enemyCondition.equalsIgnoreCase("burning")){
            damage = rand.nextInt(5)+1;
            System.out.println("Your Fireball has set the enemy ablaze. They take " + damage + " burning damage.");
            enemyHealth = enemyHealth - damage;
        }

        if (enemyCondition.equalsIgnoreCase("poisoned")){
            damage = rand.nextInt(5)+1;
            System.out.println("Your poison is affecting your enemy. They take " + damage + " poison damage.");
            enemyHealth = enemyHealth - damage;
        }

        return enemyHealth;
    }

    public static int heal(int playerHealth){
        heal = rand.nextInt(8) + 1;
        playerHealth = playerHealth + heal;
        System.out.println("You heal yourself for " + heal + " hit points. You know have " + playerHealth);
        return playerHealth;
    }

    public static int buff(String playerSpell, int playerDamage){
    if (playerSpell.equalsIgnoreCase("Magic weapon") || playerSpell.equalsIgnoreCase("hunter's mark") || playerSpell.equalsIgnoreCase("hunters mark")){
        playerDamage = playerDamage + 1;
        System.out.println("You have buffed your damage for the time being");
    }
        return playerDamage;
    }

}
