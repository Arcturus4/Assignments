
import java.math.*;
import java.util.ArrayList;
  //An abstract class that is common to several games in
  //which players play against the others, but only one is
  //playing at a given time.
import java.util.Scanner;
 
 abstract class Game {
 
     protected int playersCount;
 
     abstract void initializeGame();
 
     abstract void makePlay(int player);
 
     abstract boolean endOfGame();
 
     abstract void printWinner();
 
     // A template method : /
     public final void playOneGame(int playersCount) {
         this.playersCount = playersCount;
         initializeGame();
         int j = 0;
         while (!endOfGame()){
             makePlay(j);
             j = (j + 1) % playersCount;
            
         }
         printWinner();
     }
 }
 
 //Now we can extend this class in order to implement actual games:
 
 class Arvaus extends Game {
	 
	 
	 
	 public void newNums(ArrayList<Integer> nums) {
		 
		 int max = 20; 
	        int min = 1; 
	        int range = max - min + 1; 
	  
	        for (int i = 0; i < 20; i++) { 
	            int rand = (int)(Math.random() * range) + min;
	            nums.add(i, rand);
	  
	            // Output is different everytime this code is executed 
	            //System.out.println(rand); 
	        }
	 }
	 
	 // / Implementation of necessary concrete methods /
 
     void initializeGame() {
         // ...
    	 ArrayList<Integer> nums = new ArrayList<>();
    	 newNums(nums);
    	 Scanner sc = new Scanner(System.in);
    	 
    	 
     }
    	 
    	 
    	  void gameloop() {
    		 ArrayList<Integer> nums = new ArrayList<>();
    		 Scanner sc = new Scanner(System.in);
    		 newNums(nums);
    		 System.out.println("Guess a number between 1 and 20");
        	 String ans = sc.next();
        	 int ansint = Integer.parseInt(ans);
        	 int correct = nums.indexOf(10);
        	 //System.out.println("\n correct is " + correct);
        	 
        	 if(ansint == correct) {
        		 endOfGame();
        	 }else {
        		 System.out.println("\n Try again... \n");
        		 
        		 gameloop();
        	 }
        	 
    	 }
    	 
    	 
    	 
    	
     
 
     void makePlay(int player) {
         // ...
     }
 
     boolean endOfGame() {
    	 System.out.println("Correct!! you won!");
    	 return true;
     }
 
     void printWinner() {
         // ...
     }
 
     /// Specific declarations for the Monopoly game. /
 
 }
 
 class Chess extends Game {
 
	 /// Implementation of necessary concrete methods /
 
     void initializeGame() {
         // ...
     }
 
     void makePlay(int player) {
         // ...
     }
 
     boolean endOfGame() {
		return false;
     }
 
     void printWinner() {
         // ...
     }
 
     //Specific declarations for the chess game. */
 
 }
