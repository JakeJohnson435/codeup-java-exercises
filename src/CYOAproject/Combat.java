package CYOAproject;

import java.util.Scanner;
import java.util.Random;

public class Combat {

    static int damage;
    static int block;
    static int fleeChance;
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

    public static int

}
