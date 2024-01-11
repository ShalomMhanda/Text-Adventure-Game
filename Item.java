/**
 *  Class to represent an item
 *  @author Shalom Mhanda, Annie Karitonze, Karen Shokobishi
 *  @version Spring 2022
 */
public class Item{
  /** The name of the item */
  private String name;
  
  /** Constructor for an item */
  public Item (String name){
    this.name = name;
  }
  /**
  * name getter
  * @return name
  */
  public String getName(){
    return this.name;
  }
  /**  Gives the name of the item*/
  public String toString(){
    return this.name;
  }
  
}