package template;

import java.util.*;

public class MemoryGame extends Game {
    private int playerAmount;
    private int currentPlayer;
    private List<String> playerNames;
    private int pairsLeft;
    private boolean gameEnded;
    private HashMap<String, Integer> players = new HashMap<>();
    private static final int NUMBER_OF_PAIRS = 4;
    private List<Integer> cardDeck;
    private Scanner scanner = new Scanner(System.in);

    public MemoryGame() {
        this.playerNames = new ArrayList<>();
        this.cardDeck = new ArrayList<>();
    }

    @Override
    public void initializeGame(int numberOfPlayers) {
        this.playerAmount = numberOfPlayers;
        this.currentPlayer = 0;
        this.pairsLeft = NUMBER_OF_PAIRS;
        this.gameEnded = false;

        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Enter name for player " + i + ": ");
            String playerName = scanner.nextLine();
            playerNames.add(playerName);
            players.put(playerName, 0);
        }

        for (int i = 1; i <= NUMBER_OF_PAIRS; i++) {
            cardDeck.add(i);
            cardDeck.add(i);
        }
        Collections.shuffle(cardDeck);

        System.out.println("Game initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        return pairsLeft == 0;
    }

    @Override
    public void playSingleTurn(int player) {
        String playerName = playerNames.get(player);
        System.out.println(playerName + "'s turn.");

        int firstCard = getCardInput("Enter the position of the first card (0-" + (cardDeck.size() - 1) + "): ");
        int secondCard = getCardInput("Enter the position of the second card (0-" + (cardDeck.size() - 1) + "): ");

        if (firstCard != secondCard && cardDeck.get(firstCard).equals(cardDeck.get(secondCard))) {
            System.out.println("It's a pair! The cards are both " + cardDeck.get(firstCard));
            players.put(playerName, players.get(playerName) + 1);
            pairsLeft--;
        } else {
            System.out.println("Not a pair. The cards were " + cardDeck.get(firstCard) + " and " + cardDeck.get(secondCard));
        }

        gameEnded = endOfGame();
        currentPlayer = ++currentPlayer % playerAmount;
    }

    @Override
    public void displayWinner() {
        String winner = "";
        int highestScore = 0;
        boolean isTie = false;

        for (String player : playerNames) {
            int score = players.get(player);
            if (score > highestScore) {
                highestScore = score;
                winner = player;
                isTie = false;
            } else if (score == highestScore) {
                isTie = true;
            }
        }

        if (isTie) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("The winner is " + winner + " with " + highestScore + " points!");
        }
    }

    private int getCardInput(String prompt) {
        System.out.print(prompt);
        int cardIndex = scanner.nextInt();
        while (cardIndex < 0 || cardIndex >= cardDeck.size()) {
            System.out.print("Invalid input. " + prompt);
            cardIndex = scanner.nextInt();
        }
        return cardIndex;
    }

    public void startGame() {
        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        play(numberOfPlayers);
    }
}
