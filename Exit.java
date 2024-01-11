import com.google.common.graph.*;
import java.util.*;
/**
 *  Class to implement connections between different places in the game
 *  @author Shalom Mhanda, Annie Karitonze, Karen Shokobishi
 *  @version Spring 2022
 */
public class Exit {
  
  public String numToString(String num){
    if (num.equals("019")){
      return "Starvation";
    } else if (num.equals("120")){
      return "Togo";
    } else if (num.equals("105")){
      return "Entertainment";
    } else if (num.equals("118")){
      return "Rhinoceros";
    } else if (num.equals("205")){
      return "Explorers";
    } else if (num.equals("315")){
      return "Okoye";
    } else if (num.equals("520")){
      return "Technology";
    } else if (num.equals("825")){
      return "Yoruba";
    } else if (num.equals("1316")){
      return "Philosophy";
    } else {
      return "Eating";
    }
  }
  /** Sets up the graph of places */
  public static ImmutableGraph<Place> setUp(){
 
    String witchesRegion = "witches"; 
    String witchesDesc = "Immediately after entering the room, your hair stands on its ends. Have you entered a haunted house? You master a bit of courage and take a peek of the room. You notice that almost everything is adorned in red and black cloth. A candle lights up, with no source of flame in sight. You notice skeletons staring at you and hear footsteps creaking on the floor. As you lift your head, your eyes meet those of a creature adorned in white and jewels. Before you can do anything, the creature cackles, and you realize it is a witch!!! 'Welcome to the home of ancients, the home of those who were, who are, and who will be! Many have visited in the quest to find the spell but as you have seen, they never made it. You have to answer three riddles. If you cannot answer any of them, I will hex you and you will be free to go. However, you cannot make it out of this house without the riddle so put on your thinking cap!'";

    String[] riddles = {"Discovered in Africa, I spread like a tide, to become a hot staple known the worldwide. A necessity to some, a treasure to many, I'm best enjoyed among the pleasant company. Some like me hot and some like me cold. Some prefer mild, others only bold. Some take me straight, while some like to savor my essence, which has added a flavor. So put down your cares and sit awhile with me; I'll send you back refreshed and full of energy. What am I?", "Take a look at the last ten years. You will see that consistency is key. Who would have known I would be worth $12.1 billion one day? After all, I only started with $3000 in the largest country in Africa. My branches reach ten countries in the African continent. Who am l?", "I am situated in the Southern part of the beloved central continent. No seriously, it is centrally located. The equator and the Greenwich meridian cross it at 0 degrees. I am the greenest of the 54 darling nations on this planet! I use nearly 100% green and sustainable energy most of which is hydroelectric power. What am l?"};

    String[] riddleAnswers = {"coffee", "aliko dangote", "mozambique"};

    String[][] riddleHints = {{"The most expensive of my kind can cost up to $600 per pound", "My heritage dates back to centuries ago when a goat herder discovered my potential in the forests on the Ethiopian Plateau.","Would it be surprising if I said that Ethiopia is my fifth-largest producer in the world?" }, {"I partnered with the Bill and Melinda Gates Foundation in 2013 to eradicate polio and strengthen routine immunization in the second largest continent, a goal we realized 100% in 2020.", "One of my most famous quotes is, 'I enjoy myself a lot but I derive more joy in working. I believe in hard work and one of my business secrets is hard work. It’s hard to see a youth that will go to bed by 2 am and wake up by 5 am, I won’t rest until I achieve something.'","Well, what can I say? They call me the richest black man in the world."}, {"I am the only one-word country that includes all five vowels in its name.", "I am home to some of the world’s best coral reefs. There are over 1,200 species of fish that have been identified in my coastal waters.", "I am one of the four countries who have flags that feature a firearm."}};
  
    String spell = "Global Citizen";
    Item key = new Item(spell);
    ArrayList<String> witchesInventory = new ArrayList<>();
    witchesInventory.add(key.getName());
    Place witchesRoom = new Place(witchesDesc, key, riddles, riddleHints, riddleAnswers, "witches", "witchesRoom", witchesInventory);

    String jungle_desc = "You enter a thick jungle and are immediately meet a flying shark ";

    String sharkDesc = "Hi there I'll be your transportation in this thick jungle. I am here to keep you safe. There are a lot of predators in this jungle. Rule number 1, never wander out of my sight! This key you are trying to find will not come to you easily and so I am willing to help you with that. I have 10 gifts for you. A seed, a coin, an orange, tea leaves, gold, salt, honey, an apple, a red dress, a goldfish, and a flying shark. Of course, I am also here for you as your resource. SO as you might have guessed you will need permission from the king so hop on and let's go to the lion (Type in hop) ";
    
    String orange = "orange";
    String salt = "salt";
    String redDress = "red dress";
    String flyingShark = "flying shark";
    String extraOne = "tea leaves";
    String extraTwo = "gold";
    String extraThree = "honey";
    String extraFour = "seed";
    String extraFive = "gold fish";
    String extraSix = "coin";
    
    ArrayList<String> flyingSharksInventory = new ArrayList<>();
    flyingSharksInventory.add(salt);
    flyingSharksInventory.add(orange);
    flyingSharksInventory.add(redDress);
    flyingSharksInventory.add(flyingShark);
    flyingSharksInventory.add(extraOne);
    flyingSharksInventory.add(extraTwo);
    flyingSharksInventory.add(extraThree);
    flyingSharksInventory.add(extraFour);
    flyingSharksInventory.add(extraFive);
    flyingSharksInventory.add(extraSix);
    
    Place flyingSharks = new Place(null, sharkDesc, null, null, "flyingSharks", flyingSharksInventory);
    
    String lionRiddle  = "Welcome to my jungle. Nobody is allowed to pass this point without my permission. As the King of this jungle, I must let you know that it will cost you to roam in my jungle. That key you are looking at was once dear to me before it was stolen from me. I will not disclose who stole it from you until I feel you deserve it. Now come on give Caesar what belongs to Caesar that has a head and a tail but no body." ;
    

 Item lionClue = new Item ("Alright I guess I must speak now. You know, she could've been my wife, but it seemed she had other motives. That is all I can say for now. It brings up way too many bitter memories.");
    
    String lionRegion = "Jungle";
    String lionGift= "coin";
    // Key is the clue you are trying to get

    ArrayList<String> lionInventory = new ArrayList<>();
    
    Place lion = new Place(lionClue, lionRiddle, lionGift, lionRegion, "lion", lionInventory);
    
    String zebraRiddle  = "Hahaha, you must take me for a thief because of my stripes, don’t you? Well, I hate to disappoint you. I am not the one with this sought-after key. But I do know who does have it though, if you do pay a good price I might let you in on the secret. I am endangered, did you know that? Quite sad, I know and so before I leave I would like to see this color.";

    Item zebraClue = new Item("I will tell you this though it has super vision");

    String zebraGift = "orange";
    String zebraRegion = "Jungle";

    ArrayList<String> zebraInventory = new ArrayList<>();
    
    Place zebra = new Place(zebraClue, zebraRiddle, zebraGift, zebraRegion, "zebra", zebraInventory);

    String elephantRiddle = "So you think I'm the thief? Never! But I do know who has the key. As you might have guessed it also comes at a price. Give me what I deserve. I mine for it in underground caves in Kenya. ";


   Item elephantClue = new Item ("I heard the thief has pretty good dance moves though!");

    String elephantGift = "salt";
    String elephantRegion = "Jungle";

    ArrayList<String> elephantInventory = new ArrayList<>();
    
    Place elephant = new Place(elephantClue, elephantRiddle, elephantGift, elephantRegion, "elephant", elephantInventory);

    String beeRiddle = "Ahh I see they have found me. Well, I will not give away this key for free. You will have to exchange it with me for something I am in desperate need of. They all want me dead. You need to get me out of here.";

    String beeGift = "flying shark";

    Item beeKey = new Item("Jungle key");

    String beeRegion = "Jungle";

    ArrayList<String> beeInventory = new ArrayList<>();
    beeInventory.add(beeKey.getName());
    
    Place bee = new Place(beeKey, beeRiddle, beeGift, beeRegion, "bee", beeInventory);

    String okoyeRegion = "okoye";

    String Okoye_desc = "Welcome to Okoye house. Before entering you should know the following. Okoye is one of the warriors who have shaped and influenced the African continent. She is also the guardian of the overlooked and deemed unimportant part of African history and African existence. You will learn and grow much in this journey as long as you remain cautious and attentive to her concealed and resistance stories. She can also heal wounds and diseases, and break any hex people might have. Okoye is right now sleeping on the big table in the center of the room. She was cursed for thousands of years by a witch, to be awakened by the first person who would be able to elucidate the mystery of her fate. To do that, you will find clues and hints that you will use to break her curse. She will then help you in return by giving you a part of the key you are looking for. You are now free to enter the room or go back from where you come from.";

    String okoyeSP = "You can pick a new number.";

    String curseBreaker = "Stereotype";

    Item Okoye_key = new Item("Okoye Key");

    String starvationHint = "In his famous article \"How to write about Africa\", Binyavanga Wainaina made these controversial statements: \"...The starving African, who wanders the refugee camp almost naked, awaits the benevolence of the West. His children have flies on their eyelids and pot bellies, and his breasts are flat and empty.\" Starvation is one of the things that Africa, like many other continents, is striving to diminish and eradicate. Unfortunately, for so many years, this inaccurate image of the starving African has survived and contributed to cases of marginalization and deprivation of dignity. So let us keep in mind that Africa is not synonymous with Starvation.";

    String togoHint = "Togo is located in West Africa. Its flag has three colors: red, green and yellow which are the Pan-African colors. Red represents the blood, struggle and common heritage of Africans during the struggle against the oppression of colonialism. Green symbolizes the nature of the continent, which has good land for agriculture, and Yellow represents the wealth of Africa. Many African countries also have these colors in their flag because of their common history of colonization. However, Africa is not a country. Togo is one of the 54 countries that make up Africa and all these countries have different cultures, traditions and languages.";

    String entertainmentHint = "In the entertainment world, Afrobeat is currently one of the most influential genres. With TikTok and Instagram, it's hard to go a day without seeing people singing or dancing to a song by Burna Boy, Tems, or other African Entertainers.";

    String rhinocerosHint = "The rhinoceros, one of those supreme animals that populate the African savannahs. And contrary to what some people believe, Africans do not ride rhinos for transportation.";

    String explorersHint = "David Livingstone, the Scottish explorer, is known to have \"discovered\" Mosi-oa-Tunya (\"The Smoke that Thunders\") and to have given it the name Victoria Falls. Mosi-oa-Tunya is a waterfall located on the border between Zambia and Zimbabwe and is one of the largest waterfalls in the world, with a width of 1,708 m (5,604 ft). If the discovery is attributed to European Explorers, what about the indigenous people who lived there before \"exploration\" began?";

    String okoyeHint = "Okoye is a fictional character who plays the role of T'Challa's bodyguard in Black Panther. She represents the courage and strength of those women who shake the world with their thoughts and actions. Wangari Maathai and Tererai Trent are the African Okoyes we want to highlight today.";

    String technologyHint = "African countries have access to modern technology. Most people do not climb mountains and shout to communicate, nor do they beat drums to send messages. Most people have cell phones, the internet exists as well as many other technological devices.";

    String yorubaHint = "Yoruba is one of the main languages of Nigeria and is spoken in some countries on the West African coast. Africa is home to about one-third of the world's languages.  There is no such thing as African language spoken throughout the continent. ";

    String philosophyHint = "The Ubuntu philosophy comes from the expression \"Umuntu ngumuntu ngabantu\" which means that a person is a person through other people. African philosophy, literature, theater, music, and dance have been greeted with virulent criticism by having their legitimacy called into question. Many African beliefs and traditions, at the time of colonization, were labeled \"inappropriate,\" \"exotic,\" \"irrational,\" \"animalistic\" and continue to be normalized and selectively used to establish and perpetuate oppressions. To counter this belief and reiterate the importance of African philosophy, let us pay tribute to these African philosophers and authors: Aimé Césaire, Léopold Sedhar Senghor, Kwame Nkrumah, Julius Nyerere, Steve Biko, Mariama Bâ, Chinua Achebe, Chimamanda Ngozi Adichie.";

    String eatingHint = "Africans do not eat each other. They eat varied kinds of food but certainly not people."; 

    ArrayList<String> okoyesInventory = new ArrayList<>();
    okoyesInventory.add(Okoye_key.getName());
    
    Place okoyesRoom = new Place (null, okoyeSP, null, okoyeRegion, "okoyesRoom", okoyesInventory);
    Place starvation = new Place (null, starvationHint, "starvation", okoyeRegion, "119", null);
    Place togo = new Place (null, togoHint, "togo", okoyeRegion, "120", null);
    Place entertainment = new Place (null, entertainmentHint, "entertainment", okoyeRegion, "205", null);    
    Place rhinoceros = new Place (null, rhinocerosHint, "rhinoceros", okoyeRegion, "318", null);
    Place explorers = new Place (null, explorersHint, "explorers", okoyeRegion, "505", null);
    Place okoye = new Place (null, okoyeHint, "okoye", okoyeRegion, "815", null);
    Place technology = new Place (null, technologyHint, "technology", okoyeRegion, "1320", null);
    Place yoruba = new Place (null, yorubaHint, "yoruba", okoyeRegion, "2125", null);
    Place philosophy = new Place (null, philosophyHint, "philosophy", okoyeRegion, "3416", null);
    Place eating = new Place (null, eatingHint, "eating", okoyeRegion, "5505", null);

    String hallWay_desc = ("You're now in the hallWay. Which room do you want to visit ?");
    Place hallWay = new Place (null, hallWay_desc, null, null, "hallWay", null);
    Place jungle_entrance = new Place (null, jungle_desc, null, "jungle", "jungle_entrance", null);
    
    ImmutableGraph<Place> graph =
    GraphBuilder.undirected()
    .<Place>immutable()
    .addNode(hallWay)
    .addNode(witchesRoom)
    .addNode(flyingSharks)
    .addNode(jungle_entrance)
    .addNode(lion)
    .addNode(zebra)
    .addNode(elephant)
    .addNode(bee)
    .addNode(starvation)
    .addNode(togo)
    .addNode(entertainment)
    .addNode(rhinoceros)
    .addNode(explorers)
    .addNode(okoye)
    .addNode(technology)
    .addNode(yoruba)
    .addNode(philosophy)
    .addNode(eating)
    .putEdge(hallWay,witchesRoom)
    .putEdge(hallWay,jungle_entrance)
    .putEdge(flyingSharks,jungle_entrance) 
    .putEdge(jungle_entrance,bee)
    .putEdge(flyingSharks,lion)
    .putEdge(lion,elephant)
    .putEdge(zebra,elephant)
    .putEdge(elephant,bee)
    .putEdge(zebra,bee)
    .putEdge(bee,lion)
    .putEdge(lion,zebra)
    .putEdge(hallWay, okoyesRoom)
    .putEdge(okoyesRoom,yoruba)
    //.putEdge(okoyesRoom,starvation)
    .putEdge(okoyesRoom,togo)
    .putEdge(okoyesRoom,okoye)
    .putEdge(okoyesRoom,entertainment)
    // .putEdge(okoyesRoom,rhinoceros)
    .putEdge(okoyesRoom,explorers)
    //.putEdge(okoyesRoom,okoye)
    .putEdge(okoyesRoom,starvation)
    .putEdge(okoyesRoom,technology)
    //.putEdge(okoyesRoom,yoruba)
    .putEdge(okoyesRoom,philosophy)
    .putEdge(okoyesRoom,rhinoceros)
    .putEdge(okoyesRoom,eating).build();
    
    return graph;
  }
}


