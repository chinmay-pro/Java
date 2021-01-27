package Projects;

import java.util.Scanner;

public class RPS {
    final static int ROCK = 1, PAPER = 2, SCISSOR = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: 1)Rock 2)PAPER 3)SCISSORS");
        int player1 = sc.nextInt();
        System.out.println("Player 2: 1)Rock 2)PAPER 3)SCISSORS");
        int player2 = sc.nextInt();
        if (player1 == player2) {
            System.out.println("It's a tie");
        } else {
            switch (player1) {
                case ROCK -> {
                    if (player2 == SCISSOR) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("Player 2 wins");
                    }
                }
                case SCISSOR -> {
                    if (player2 == PAPER) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("Player 2 wins");
                    }
                }
                case PAPER -> {
                    if (player2 == ROCK) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("player 2 wins");
                    }
                }
            }
            }
        }
    }
