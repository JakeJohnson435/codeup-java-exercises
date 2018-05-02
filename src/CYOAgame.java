import java.util.Scanner;
import java.util.Random;

public class CYOAgame {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Merenthel. Are you ready to start your adventure? Yes or No");
        String beginGame;
        String playerClass;
        String playerHome;
        String playerDirection;
        String firstJob;
        String startFirstJob;
        int fighterHealth = 25;
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

            System.out.println("Where were you born?");
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
                                System.out.println("You draw your weapon ready to face the bandit");
                                int damage;
                                int enemyDamage;
                                int banditHealth = 15;
                                Random rand = new Random();
                                Random rand2 = new Random();

                                if (playerClass.equalsIgnoreCase("fighter")) {
                                    do {
                                        damage = rand.nextInt(8) + 1;
                                        System.out.println("You attack does " + damage + " to the bandit!");
                                        enemyDamage = rand2.nextInt(6) + 1;
                                        System.out.println("The bandit attacks back dealing " + enemyDamage + " back to you.");
                                        banditHealth = banditHealth - damage;
                                        fighterHealth = fighterHealth - enemyDamage;
                                        System.out.println();
                                        if (banditHealth <= 0) {
                                            System.out.println("Congratulations, you won the fight!");
                                            break;
                                        } else if (fighterHealth <= 0) {
                                            System.out.println("Looks like you lost...");
                                            break;
                                        }
                                        System.out.println();

                                    } while (true);
                                }

                                if (fighterHealth>0) {
                                    System.out.println("You have won the fight against the bandit and decide to run through the rest of the woods\n" +
                                            "before anything else can happen. After several minutes you end up on the trail on the other side of the trees\n" +
                                            "looking up towards the city surrounding Lowfeld Castle. Now to deliver that letter");
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
