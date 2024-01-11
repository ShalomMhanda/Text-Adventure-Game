import java.util.*;
import com.google.common.graph.*;
/**
 *  Class to play the game
 *  @author Shalom Mhanda, Annie Karitonze, Karen Shokobishi
 *  @version Spring 2022
 */
public class Adventure {
  /** 
   *  Removes an item from the place inventory and puts it into the user inventory
   *  @param placeInventory
   *  @param userInventory
   */
  public static void pickObject(ArrayList<String> placeInventory, ArrayList<String> userInventory) {
	  for (int i = 0; i < placeInventory.size(); i++) {
      userInventory.add(placeInventory.get(i));
    }
  }
  /** 
   *  Removes an item from the user inventory and puts it into the place inventory
   *  @param placeInventory
   *  @param userInventory
   *  @param answer
   */
  public static void dropObject(ArrayList<String> placeInventory, ArrayList<String> userInventory, String answer) {
    placeInventory.add(userInventory.remove(userInventory.indexOf(answer)));
  }
  /** Interacts with the user playing the game */
  public static void main(String[] args) {
  
    ArrayList<String> userInventory = new ArrayList<>();
    
    Integer[] intArray = new Integer[]{119,120,205,318,505,815,1320,2125,3416,5505};
    ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(intArray));
    ArrayList<String> lettersFound = new ArrayList<String>();
    ArrayList<String> numbers = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    Exit myExit = new Exit();
    /** Sets up the places and their connections using a graph */
    ImmutableGraph<Place> graph = myExit.setUp();
    
    Iterator<Place> value = graph.nodes().iterator();
    /** Put the places into a hashmap for easy access using their name attribute*/
    HashMap<String, Place> myHash = new HashMap<String, Place>();
    while (value.hasNext()) {
      Place currPlace = value.next();
      myHash.put(currPlace.getName(), currPlace);
    }
    
    System.out.println();
    System.out.println("Welcome to the mysterious Dzimba Dzemabwe. You are standing in the hallway of a giant house. You look around and see three different doors that lead to three rooms. From one room, you hear cackles(witches room). From the other room, sounds of animals protrude (jungle). From the other room, you hear a whisper calling you (Okoye). You have to collect a key from each room to exit this mysterious house and get back to your life.");
    System.out.println();
    /** You start in the hallway */
    Place currentLocation = myHash.get("hallWay");
    System.out.println(currentLocation.getRiddle());
    
    while (1 == 1){
      /** Tell user what they can do next */
      
      System.out.println("These are the places you can go from here "+graph.adjacentNodes(currentLocation)+ ". Please type the names as shown.");
      System.out.println();
      /** Get user input on which location they want to go */
      String user_answer = sc.nextLine();

      if (user_answer.contains("jungle_entrance")){
        currentLocation = myHash.get("jungle_entrance");
        System.out.println(currentLocation.getRiddle());
        System.out.println();
        currentLocation = myHash.get("flyingSharks");
        System.out.println(currentLocation.getRiddle());
       /** Collect gifts at the flyng sharks' place*/
        pickObject(currentLocation.getPlaceInventory(), userInventory);

        System.out.println("This is what you have in your inventory "+userInventory);
        System.out.println();
        user_answer = sc.nextLine();
        while (!user_answer.equals("hop")){
          System.err.println("Please enter the word 'hop' to continue!");
          user_answer = sc.nextLine();
        }
        System.out.println();
        System.out.println("You fly to the lion's den and the flying shark drops you there. You immediatly encounter the lion");
        currentLocation = myHash.get("lion");
        System.out.println();
        System.out.println(currentLocation.getRiddle());
        System.out.println("This is what you have in your inventory "+userInventory);
        System.out.println();
        user_answer = sc.nextLine();
        if (user_answer.equals("coin")){
          /** Give the lion the gift*/
          dropObject(currentLocation.getPlaceInventory(), userInventory, currentLocation.getAnswer());
          System.out.println("This is what you have in your inventory "+userInventory);
        }
        else{
          System.out.println("How dare you disrespect me! That is not the right gift. I want you out of my sight now! Good luck on finding that key without my advice");
        }
        System.out.println("After having left lion, the shark looks at you and asks 'Where to next?'");
        System.out.println();
       
        System.out.println("These are the places you can go from here "+graph.adjacentNodes(currentLocation)); 
        System.out.println();
     
        user_answer = sc.nextLine();
        while (!user_answer.equals("bee")){
        if (user_answer.equals("zebra")){
          currentLocation = myHash.get("zebra");
          System.out.println();
          System.out.println(currentLocation.getRiddle());
          System.out.println("This is what you have in your inventory "+userInventory);
          System.out.println();
          user_answer = sc.nextLine();
          if (user_answer.contains("orange")){
            System.out.println(currentLocation.getKey());
            /** Give the zebra the gift*/
            dropObject(currentLocation.getPlaceInventory(), userInventory, currentLocation.getAnswer());
            System.out.println(userInventory);
            System.out.println("After having left zebra, the shark looks at you and asks 'Where to next?'");
      
            System.out.println("These are the places you can go from here"+graph.adjacentNodes(currentLocation)); 
            user_answer = sc.nextLine();
           
          }
          else{
            System.out.println("Hahaha that is not my gift. I can't give you that clue after all but good luck though!");
            System.out.println("After having left zebra, the shark looks at you and asks 'Where to next?'");
          
            System.out.println("These are the places you can go from here "+graph.adjacentNodes(currentLocation)); 
            user_answer = sc.nextLine();
           
          }
        }
        
        else if (user_answer.equals("elephant")){
          currentLocation = myHash.get("elephant");
          System.out.println();
          System.out.println(currentLocation.getRiddle());
          System.out.println("This is what you have in your inventory "+userInventory);
          user_answer = sc.nextLine();
          System.out.println();
          if (user_answer.contains("salt")){
            System.out.println(currentLocation.getKey());
            /** Give the elephant the gift*/
            dropObject(currentLocation.getPlaceInventory(), userInventory, currentLocation.getAnswer());
            System.out.println(userInventory);
            System.out.println("After having left elephant, the shark looks at you and asks 'Where to next?'");
         
            System.out.println("These are the places you can go from here"+graph.adjacentNodes(currentLocation)); 
            user_answer = sc.nextLine();
            
          }
          else{
            System.out.println("Well that's disappointing. That is not my gift. I can't give you that clue after all but good luck though!");
            System.out.println("After having left elephant, the shark looks at you and asks 'Where to next?'");
        
            System.out.println("These are the places you can go from here"+graph.adjacentNodes(currentLocation)); 
            user_answer = sc.nextLine();
          }
        }
        
        }
        if (user_answer.equals("bee")){
          currentLocation = myHash.get("bee");
          System.out.println(currentLocation.getRiddle());
          System.out.println("This is what you have in your inventory "+userInventory);
          user_answer = sc.nextLine();
          if (user_answer.contains("flying shark")){
            dropObject(currentLocation.getPlaceInventory(), userInventory, currentLocation.getAnswer());
            System.out.println("Congratulations! Yes that is my gift! You now have the jungle key! Be sure to keep it safe.I will be on my way now "); 
            pickObject(currentLocation.getPlaceInventory(), userInventory);
          
          System.out.println("This is what you have in your inventory "+userInventory);
          }
          else{
            System.out.println("Well that's disappointing. That is not my gift. I can't give you that key after all!" +"\n"+ "I am kicking you out of the jungle!");
          }
          currentLocation = myHash.get("hallWay");
          
        } 
        else {
          System.err.println("Invalid input. Please enter the correct name of place to go to as shown.");
          System.out.println("These are the places you can go from here"+graph.adjacentNodes(currentLocation)); 
      
        } 
    }
     
     if (user_answer.equals("witchesRoom")){
        
        currentLocation = myHash.get("witchesRoom");
        System.out.println(currentLocation.getDesc());
        System.out.println();
        int count1 = 0;
        int count2 = 0;
        int count3;
        String[] riddles = currentLocation.getRiddles();
        String[] answers = currentLocation.getAnswers();
        String[][] hint = currentLocation.getHints();
       /** Loop through the three riddles and evaluate the user's answers */
        for (int i=0; i < riddles.length; i++ ){
          int index1 = i+1;
          System.out.println("Here is riddle "+ index1 +": "+riddles[i]);
          System.out.println();
          user_answer = sc.nextLine().toLowerCase();
          count3 = 0;
          if (!user_answer.equals(answers[i])){
            for(int j = 0; j< 3; j++){
              int index2 = j+1;
              System.out.println("Here is a hint "+ index2 + ":");
              System.out.println(hint[i][j]);
              System.out.println();
              
              user_answer = sc.nextLine().toLowerCase();
            
              if (user_answer.equals(answers[i])){
                count2 ++;
                break;
              }
              else {
                count3++;
              }
            } 
            if (count3 == 3){
              System.out.println("You're out of hints. Now get out of my room and come back when you know better!");
              break;
            }
          } 
          else {
            count1 ++;
          }
        }
        if (count1 + count2 == 3){
          System.out.println("Here is your key: " + currentLocation.getKey().toString());
          pickObject(currentLocation.getPlaceInventory(), userInventory);
          
          System.out.println("This is what you have in your inventory "+userInventory);
          System.out.println("These are the places you can go from here "+graph.adjacentNodes(currentLocation).toString()+ " Please type the names as shown.");
          user_answer = sc.nextLine();
          System.out.println();
        }
      }
      
      if (user_answer.equals("hallWay")){
          currentLocation = myHash.get(user_answer);
          System.out.println();
          System.out.println(currentLocation.getRiddle());
          if (userInventory.toString().contains("Global Citizen") && userInventory.toString().contains("Jungle key")  && userInventory.toString().contains("Okoye Key")) {
            System.out.println("Oops, it seems like you have all the keys to exit the room. Congratulations! You are free to get back to your life. Bye!!!");
            
            break;
        }
      }
      if (user_answer.equals("okoyesRoom")){
      System.out.println("Welcome to Okoye house. You will learn and grow much in this journey as long as you remain cautious and attentive to her concealed and resistance stories. You are now free to enter the room or go back from where you come from.");
      currentLocation = myHash.get("okoyesRoom");
      System.out.println("After entering the room, you see Okoye lying on a table with giant letters written on the side of the table. Right across the door, you see a shelf and that’s where you will find all the reflections that Okoye has been saving throughout time. Each reflection revolves around a theme/topic that you will have to learn. Once you have found the ten words, you will take their initials and form a word out of them. You will then go to Okoye’s table and touch the letters sequentially forming you have found earlier. Now you can head to the shelf. The shelf has numbers on it, and each number corresponds to a riddle that is going to help you figure out the clue.");
      
      System.out.println(graph.adjacentNodes(currentLocation));
      String numInput = sc.nextLine();
        
      while (1==1){

        try{
          while(numInput.isEmpty() || !allNumbers.contains(Integer.valueOf(numInput))){
            System.out.println("Enter a number from the given list");
            numInput = sc.nextLine();
          }
          } catch (NumberFormatException e) {
            System.out.println("Your input is not a number and I only work woth numbers! Try again.");
            numInput = sc.nextLine();
            }
        
        currentLocation = myHash.get(numInput);
        System.out.println();
        System.out.println(currentLocation.getRiddle());
        System.out.println("What do you think the reflection is about?");
        System.out.println();
        String stringInput = sc.nextLine().toLowerCase();
        System.out.println();
        
        if (stringInput.equals(currentLocation.getAnswer())){
          System.out.println("You got it right!");
          
          numbers.add(currentLocation.getName());
          System.out.println("The numbers you visited: "+numbers);
          String word = currentLocation.getAnswer();
          lettersFound.add(word.substring(0,1));
          System.out.println("The letters stored: "+lettersFound);
          System.out.println();
        } else{
          
          System.out.println("You didn't get it! But I am willing to give you a hint. The letter you are looking for can be inferred from the last two digits of the number you chose" + "\n" + "Just want to check if you got my instructions right, what letter do you think I am talking about?");
          String letterInput = sc.nextLine();
          String word1 = currentLocation.getAnswer();
          if (letterInput.equals(word1.substring(0,1))){
            
            System.out.println("You got it right!" );
            lettersFound.add(word1.substring(0,1));
            System.out.println("The letters stored: "+lettersFound);
            numbers.add(currentLocation.getName());
            System.out.println("The numbers you visited: "+numbers);
            System.out.println();
          } else{
            System.out.println("Please try again!");
           
          }
        }
          stringInput = "okoyesRoom";
          
          currentLocation = myHash.get(stringInput);
          System.out.println(currentLocation.getRiddle());
          System.out.println(graph.adjacentNodes(currentLocation));
          numInput = sc.nextLine();
          
          try{
            while(numInput.isEmpty() || !allNumbers.contains(Integer.valueOf(numInput))){
              System.out.println("Enter a number from the given list");
              numInput = sc.nextLine();
            }
          } catch (NumberFormatException e) {
            System.out.println("Your input is not a number and I only work woth numbers! Try again.");
            numInput = sc.nextLine();
            } 
          
          
          if (!(lettersFound.size() == 10) && (numbers.contains(numInput))){
            System.out.println("You have already checked that number."+"\n"+"Pick another number.");
            numInput = sc.nextLine();
            System.out.println();
          }
       
          else if (lettersFound.size() == 10) {
            System.out.println("You have found all the ten letters now"+"\n"+"Here are your letters " + lettersFound +"\n"+ "Form a word out of those letters.");
            String cursebreaker = sc.nextLine();
            if (cursebreaker.toLowerCase().equals("stereotype")){
              System.out.println("Okoye is now awake!");
              System.out.println("Okoye: Thank you for breaking the curse. Here is part of the key that you will use to get out of this house" +"\n"+ "You can now go back to hallWay");
              pickObject(currentLocation.getPlaceInventory(), userInventory);
              
              System.out.println("This is what you have in your inventory "+userInventory);
              System.out.println();
              break;
            }
          } 
        } 
      } 
    }
  }
}