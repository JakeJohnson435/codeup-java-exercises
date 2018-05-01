import java.util.Scanner;

public class CYOAgame {
    public static void main(String[] args) {
        System.out.println("Welcome to the world of Merenthel. Are you ready to start your adventure? Yes or No");
        String beginGame;
        String playerClass;
        String playerHome;
        String playerDirection;
        String firstJob;
        String startFirstJob;
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

            System.out.println("You walk out into the light of the busy street and take a look around. \nAre you ready to start the job or would you like to look around town? Yes or Explore Town");
            Scanner scFirstTown = new Scanner(System.in);
            startFirstJob = scFirstTown.nextLine();
                if (startFirstJob.equalsIgnoreCase("Explore") || startFirstJob.equalsIgnoreCase("explore town")) {
                    System.out.println("Where would you like to go?");
                    System.out.println("Tavern | Guild Hall | Blacksmith");
                    Scanner scTownVisit = new Scanner (System.in);
                    String visitShops = scTownVisit.nextLine();

                    if (visitShops.equalsIgnoreCase("tavern")){
                        System.out.println("You head towards the tavern looking for a drink and some information.");
                    }

                    if (visitShops.equalsIgnoreCase("Guild Hall") || visitShops.equalsIgnoreCase("Guild") || visitShops.equalsIgnoreCase("hall")){
                        System.out.println("You head towards the Guild Hall hoping to find some information and maybe an ally");
                    }

                    if (visitShops.equalsIgnoreCase("Blacksmith")){
                        System.out.println("You head towards the blacksmith. Maybe you can pick up some upgraded gear?");
                    }

                } else {
                    System.out.println("You grab your bag and make your way to your destination.");
                }
            }
            System.out.println("Game Over");
        }
    }
