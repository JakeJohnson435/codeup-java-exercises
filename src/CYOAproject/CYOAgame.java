package CYOAproject;

import java.util.Scanner;
import java.util.Random;

public class CYOAgame extends Combat{


    public static void main(String[] args) {

        System.out.println("Welcome to the world of Merenthel. Are you ready to start your adventure? Yes or No");
        String beginGame;
        String playerClass;
        String playerHome;
        String playerName;
        String playerDirection;
        String firstJob;
        String startFirstJob;
        int playerHealth = 0;
        int playerDamage = 0;
        int playerArmor = 0;
        String classSpells = "";
        Scanner scBeginGame = new Scanner(System.in);
        beginGame = scBeginGame.nextLine();
        if (beginGame.equalsIgnoreCase("yes") || beginGame.equalsIgnoreCase("y")){
            System.out.println("Very well, what class are you?");
            String classChoice;
            do {
                System.out.println("Ranger | Wizard | Fighter | Rogue | Paladin");
                Scanner scPlayerClass = new Scanner(System.in);
                playerClass = scPlayerClass.nextLine();
                System.out.println("You chose " + playerClass + " Is this correct? Yes or No");
                Scanner scClassChoice = new Scanner(System.in);
                classChoice = scClassChoice.nextLine();
            } while (classChoice.equalsIgnoreCase("no") || classChoice.equalsIgnoreCase("n"));

            if (playerClass.equalsIgnoreCase("Ranger")){
                playerHealth = 20;
                playerDamage = 8;
                playerArmor = 6;
                classSpells = "Bow | Hail of Thorns | Hunter's Mark";
            } else if (playerClass.equalsIgnoreCase("Wizard")){
                playerHealth = 15;
                playerDamage = 6;
                playerArmor = 4;
                classSpells = "Fireball | Chain Lightning | Poison Spray | Earthquake | Freeze";
            } else if (playerClass.equalsIgnoreCase("Fighter")){
                playerHealth = 25;
                playerDamage = 10;
                playerArmor = 8;
                classSpells = "You're a Fighter not a magician. Get in there and hit them.";
            } else if (playerClass.equalsIgnoreCase("Rogue")){
                playerHealth = 20;
                playerDamage = 6;
                playerArmor = 6;
                classSpells = "Vanish | Poison Dart | Smoke Bomb";
            } else if (playerClass.equalsIgnoreCase("Paladin")){
                playerHealth = 30;
                playerDamage = 8;
                playerArmor = 10;
                classSpells = "Heal | Smite | Magic Weapon";
            }

            System.out.println("What is your name?");
            Scanner scPlayerName = new Scanner(System.in);
            playerName = scPlayerName.nextLine();
            System.out.println("Nice to meet you " + playerName + ", I am Guild Master Murdoc. Where are you from??");
            Scanner scPlayerHome = new Scanner(System.in);
            playerHome = scPlayerHome.nextLine();
            System.out.println("Ah, I haven't heard of "+ playerHome + ". Where is it located?");
            System.out.println("The North | The East | The South | The West");
            Scanner scPlayerDirection = new Scanner(System.in);
            playerDirection = scPlayerDirection.nextLine();

            if (playerDirection.equalsIgnoreCase("The North") || playerDirection.equalsIgnoreCase("North")){
                System.out.println("Yes that does sound like a village from the North now that you mention it.");
            } else if (playerDirection.equalsIgnoreCase("The South") || playerDirection.equalsIgnoreCase("South")) {
                System.out.println("Yes that does sound like a Southern village now that you mention it.");
            } else if (playerDirection.equalsIgnoreCase("The East") || playerDirection.equalsIgnoreCase("East")) {
                System.out.println("Oh you're from the East then? Hmm...");
            } else if (playerDirection.equalsIgnoreCase("The West") || playerDirection.equalsIgnoreCase("West")) {
                System.out.println("Westerner huh. I don't know how I didn't catch your accent earlier.");
            } else {
                System.out.println("Whatever you say then...");
            }

            System.out.println("Well to get started I have a few jobs that you could do. Which one do you want to hear about?");
            String firstChoice;
            do {
                System.out.println("Deliver a Message | Clear a Camp of Monsters | Guard a Prisoner Transfer");
                Scanner scFirstJob = new Scanner(System.in);
                firstJob = scFirstJob.nextLine();

                if (firstJob.equalsIgnoreCase("Deliver a Message")) {
                    System.out.println("I have a message that needs to be delivered to the Duke of the land. \nI can pay you a small amount upfront, but I'm sure the Duke will have more need for you after.");
                }

                if (firstJob.equalsIgnoreCase("Clear a camp of monsters")){
                    System.out.println("There have been rumors of a group of goblins sighted in the nearby canyon. \nThe Duke has put up a bounty for proof of the camp being taken care of.");
                }

                if (firstJob.equalsIgnoreCase("Guard a prisoner transfer")){
                    System.out.println("We have captured the local bandit lord Scaldren and he is being taken to the capital. \nThe guards fear a retaliatory attack and have requested aid.");
                }
                System.out.println("Is this the job you want?:");
                Scanner scFirstChoice = new Scanner(System.in);
                firstChoice = scFirstChoice.nextLine();

            } while (firstChoice.equalsIgnoreCase("no") || firstChoice.equalsIgnoreCase("n"));


            System.out.println("So you're going to take on the job of " + firstJob + " huh. Here are all the things you'll need now, get on your way!");

            if (playerClass.equalsIgnoreCase("paladin")) {
                System.out.println("You have received some plate armor, a shield, a mace and a book devoted to your gods");
            }

            if (playerClass.equalsIgnoreCase("ranger")) {
                System.out.println("You have received some leather armor, a short bow with 20 arrows, a short sword and a hunting knife");
            }

            if (playerClass.equalsIgnoreCase("rogue")) {
                System.out.println("You have received some leather armor, a short sword, two daggers and a lockpick");
            }

            if (playerClass.equalsIgnoreCase("fighter")) {
                System.out.println("You have received some chain mail armor, a spear, a shield, a short sword and a dagger");
            }

            if (playerClass.equalsIgnoreCase("wizard")) {
                System.out.println("You have received a set of magic robes, a staff, a spell book and regents needed to cast your spells");
            }

            do {
                System.out.println("You walk out into the light of the busy street and take a look around. \nAre you ready to start the job or would you like to look around town? Yes or Explore Town");
                Scanner scFirstTown = new Scanner(System.in);
                startFirstJob = scFirstTown.nextLine();

                if (startFirstJob.equalsIgnoreCase("Explore") || startFirstJob.equalsIgnoreCase("explore town")) {
                    System.out.println("Where would you like to go?");
                    System.out.println("Tavern | Guild Hall | Blacksmith");
                    Scanner scTownVisit = new Scanner(System.in);
                    String visitShops = scTownVisit.nextLine();

                    if (visitShops.equalsIgnoreCase("tavern")) {
                        System.out.println("You head towards the tavern looking for a drink and some information.");
                    }

                    if (visitShops.equalsIgnoreCase("Guild Hall") || visitShops.equalsIgnoreCase("Guild") || visitShops.equalsIgnoreCase("hall")) {
                        System.out.println("You head towards the Guild Hall hoping to find some information and maybe an ally");
                    }

                    if (visitShops.equalsIgnoreCase("Blacksmith")) {
                        System.out.println("You head towards the blacksmith. Maybe you can pick up some upgraded gear?");
                    }
                }

            } while (startFirstJob.equalsIgnoreCase("explore") || startFirstJob.equalsIgnoreCase("explore town"));

            System.out.println("You grab hold of your belongings and head towards your destination.");

//            if the player chose to deliver a message:

            if (firstJob.equalsIgnoreCase("deliver a message")){
                String openLetter;
                String woodsChoice;
                String firstFight;

                System.out.println("With letter in hand you start heading East towards MacCresh, the seat of power for " +
                        "\nthe Duke of Lowfeld.  As you leave the walled village you see what seems like a sea of wheat\n" +
                        "fields from all the nearby farms. You pass a few traveling merchants and some city guards dealing\n" +
                        "with what you assume is the prisoner you could have helped deliver but all that matters to you is the\n" +
                        "letter in your pocket. Strangely, now that it is in your thoughts you notice it has a weight to it\n" +
                        "making you believe there is more than just paper inside");
                Scanner scOpenLetter = new Scanner(System.in);
                System.out.println("Do you want to open the letter?");
                openLetter = scOpenLetter.nextLine();
                Scanner scWoodsChoice = new Scanner(System.in);
                Scanner scFirstFight = new Scanner(System.in);


                    if (openLetter.equalsIgnoreCase("yes") || openLetter.equalsIgnoreCase("y")){
                        System.out.println("You reach into your pocket and grab hold of the envelope. After taking a moment to look around\n" +
                                "to make sure there is no one watching you slip your knife under the seal and break it open");
                        System.out.println("As you unseal the letter and start reading what is written you get a feeling of being watched.\n" +
                                "You take a look around again and still see no one paying any attention to you on the road. The letter itself\n" +
                                "also feels much lighter than it did when it was in your pocket. You look down expecting to find an item that had\n" +
                                "dropped but see nothing. ");
                    } else {

                        System.out.println("You examine the letter and notice that there is a seal covering it. You decide it would be\n" +
                                "best to leave the seal unbroken and do the job you were paid to do.");
                        System.out.println("After a few hours of travel, wishing you had a horse or bought a carriage ride, you enter into\n" +
                                "a wooded area that you recognize from the maps as being just on the outskirts of Lowfeld. You get an uneasy feeling\n" +
                                "as night is beginning to fall. Should you risk going through the woods and trying to make it before it becomes too dark\n" +
                                "to safely travel or should you do something else?");
                        System.out.println("Continue on through the woods | Make camp for the night | Head around the woods");
                        woodsChoice = scWoodsChoice.nextLine();

                        if (woodsChoice.equalsIgnoreCase("continue") || woodsChoice.equalsIgnoreCase("continue through the woods")){
                            System.out.println("You place your hand on your weapon and make your way into the woods. Not long after you come across a bandit ambush. \n" +
                                    "Prepare for combat!");

                            System.out.println("The bandit drops in front of you from a low branch and draws his dagger");
                            System.out.println();
                            System.out.println("Hand over your belongings and I'll let you go home to see your family tonight");
                            System.out.println();
                            System.out.println("What do you do?");
                            System.out.println("Talk to him | Hand over my stuff | Run back out of the woods | Attack");
                            firstFight = scFirstFight.nextLine();

                            if (firstFight.equalsIgnoreCase("attack")){
                                System.out.println("You draw your weapon, ready to face the bandit");
                                int enemyHealth = 15;
                                int enemyDamage = 6;
                                String enemyCondition = "";
                                String combat;
                                Scanner scCombat = new Scanner(System.in);
                                String spell;
                                Scanner scSpell = new Scanner(System.in);

                                do {
                                    System.out.println("What do you want to do?");
                                    System.out.println("Melee | Cast a Spell | Defend | Flee");
                                    combat = scCombat.nextLine();


                                    if (combat.equalsIgnoreCase("Melee")){
                                        System.out.println("You make a melee attack.");
                                        enemyHealth = meleeCombat(playerDamage, enemyHealth);
                                        System.out.println();
                                        if (enemyHealth <= 0){
                                            break;
                                        }
                                        if (playerHealth <= 0){
                                            break;
                                        }
                                        playerHealth = enemyTurn(enemyDamage, playerHealth);
                                        System.out.println("You have " + playerHealth + " HP remaining.");
                                        System.out.println();
                                    } else if (combat.equalsIgnoreCase("Cast a Spell")){
                                        System.out.println("Choose a Spell: ");
                                        System.out.println(classSpells);
                                        spell = scSpell.nextLine();
                                        if (spell.equalsIgnoreCase("heal")){
                                            playerHealth = heal(playerHealth);
                                        } else if (spell.equalsIgnoreCase("magic weapon") || spell.equalsIgnoreCase("hunters mark") || spell.equalsIgnoreCase("hunter's mark")){
                                            playerDamage = buff(spell, playerDamage);
                                        } else {
                                            enemyHealth = spell(spell, enemyHealth);
                                            if (spell.equalsIgnoreCase("fireball")){
                                                enemyCondition = "burning";
                                            }

                                            if (spell.equalsIgnoreCase("poison dart") || spell.equalsIgnoreCase("poison spray")){
                                                enemyCondition = "poisoned";
                                            }
                                        }
                                        System.out.println();
                                        if (enemyHealth <= 0){
                                            break;
                                        }
                                        if (playerHealth <= 0){
                                            break;
                                        }
                                        playerHealth = enemyTurn(enemyDamage, playerHealth);
                                        System.out.println("You have " + playerHealth + " HP remaining.");
                                        System.out.println();
                                    } else if (combat.equalsIgnoreCase("Defend")){
                                        System.out.println("You attempt to defend yourself from the incoming attack.");
                                        playerHealth = defend(playerHealth, playerArmor, enemyDamage);
                                        System.out.println("You have " + playerHealth + " HP remaining.");
                                        System.out.println();
                                        if (playerHealth <= 0){
                                            break;
                                        }
                                    } else if (combat.equalsIgnoreCase("flee")){
                                        flee();
                                        if (flee == true){
                                            System.out.println();
                                            break;
                                        } else {
                                            playerHealth = enemyTurn(enemyDamage, playerHealth);
                                            System.out.println("You have " + playerHealth + " HP remaining.");
                                            }
                                            System.out.println();
                                        }

                                        if (!"".equalsIgnoreCase(enemyCondition)){
                                            enemyHealth = condition(enemyCondition, enemyHealth);
                                            if (enemyHealth <= 0){
                                                System.out.println("Your enemy has died to the effects of your spell");
                                                break;
                                            }
                                        }
                                } while (enemyHealth > 0 || playerHealth >0);



                                if (playerHealth>0) {
                                    System.out.println("You have survived the fight against the bandit and decide to run through the rest of the woods\n" +
                                            "before anything else can happen. After several minutes you end up on the trail on the other side of the trees\n" +
                                            "looking up towards the city surrounding Lowfeld Castle. Now to deliver that letter");
                                } else {
                                    System.out.println("Here lies " + playerName + ", the one who thought he was a hero");
                                    System.out.println("      _______     ");
                                    System.out.println("     /       \\   ");
                                    System.out.println("    /         \\  ");
                                    System.out.println("   |           |  ");
                                    System.out.println("   |   " + playerName + "    |");
                                    System.out.println("   |           |  ");
                                    System.out.println("   |           |  ");
                                    System.out.println("   |           |  ");
                                }

                            }
                        }
                    }

            }

//            if the player chose to clear the camp of monsters:

//            if the player chose to guard a prisoner:


        }
            System.out.println("Game Over");
        }
    }
