import java.util.*;
/**
 *  Class to represent a place in the game
 *  @author Shalom Mhanda, Annie Karitonze, Karen Shokobishi
 *  @version Spring 2022
 */
public class Place{
  /* The description of each room*/
  private String description;
  /* The key to be found in each room*/
  private Item key;
  /* The riddles/questions the user is asked */
  private String[] riddles;
  /* The hints the user is given*/
  private String[][] hints;
  /* The answer that the user needs to guess*/
  private String[] answers;
  /*The region the room is in */
  private String region;
  /*The inventory of each place */
  private ArrayList<String> placeInventory;
  /* One riddles/question the user is asked in the Jungle and in Okoye's room */
  private String riddle;
  /* One hint the user is given in the Jungle and in Okoye's room */
  private String hint;
  /* One answer the user is needs to give in the Jungle and in Okoye's room */
  private String answer;
  /** The name of the place */
  private String name;
  
  
  /** Constructor for class Place */
  public Place(String description, Item key, String[] riddles, String[][] hints, String[] answers, String region, String name, ArrayList<String> placeInventory){
    this.description = description;
    this.key = key;
    this.riddles = riddles;
    this.hints = hints;
    this.answers = answers;
    this.region = region;
    this.name = name;
    this.placeInventory = placeInventory;
  }
  /** Constructor for class Place */
  public Place(Item key, String riddle, String answer, String region, String name, ArrayList<String> placeInventory){
    this.key = key;
    this.riddle = riddle;
    this.answer = answer;
    this.region = region;
    this.name = name;
    this.placeInventory = placeInventory;
  }
  /**
  *  decsription getter
  *  @return decsription
  */
  public String getDesc(){
    return this.description;
  }
  /**
  *  key getter
  *  @return key
  */
  public Item getKey(){
    return this.key;
  }
  /**
  *  riddles getter
  *  @return riddles
  */
  public String[] getRiddles(){
    return this.riddles;
  }
  /**
  *  riddle getter
  *  @return riddle
  */
  public String getRiddle(){
    return this.riddle;
  }
  /**
  *  hints getter
  *  @return hints
  */
  public String[][] getHints(){
    return this.hints;
  }
  /**
  *  answers getter
  *  @return answers
  */
  public String[] getAnswers(){
    return this.answers;
  }
  /**
  *  answer getter
  *  @return answer
  */
  public String getAnswer(){
    return this.answer;
  }
  /**
  *  placeInventory getter
  *  @return placeInventory
  */
  public ArrayList<String> getPlaceInventory(){
    return this.placeInventory;
  }
  /**
  *  placeInventory setter
  *  @param placeInventory
  */
  public void setPlaceInventory(ArrayList<String> placeInventory){
    this.placeInventory = placeInventory;
  }
  /**
  *  description setter
  *  @param desc
  */
  public void setDesc(String desc){
    this.description = desc;
  }
  /**
  *  key setter
  *  @param key
  */
  public void setKey(Item key){
    this.key = key;
  }
   /**
  *  riddles setter
  *  @param riddles
  */
  public void setRiddles(String[] riddles){
    this.riddles = riddles;
  }
  /**
  *  hints setter
  *  @param hints
  */
  public void setHints(String[][] hints){
    this.hints = hints;
  }
  /**
  *  answers setter
  *  @param answers
  */
  public void setAnswers(String[] answers){
    this.answers = answers;
  }
  /**
  *  name setter
  *  @param name
  */
  public void setName(String name){
    this.name = name;
  }
  /**
  *  name getter
  *  @return name
  */
  public String getName(){
    return this.name;
  }
  /** Gives the name of the place */
  public String toString(){
    return this.name;
  }
}
