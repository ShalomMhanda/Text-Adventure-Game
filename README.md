# Text-Adventure-Game

REFLECTION
Our group started off by mapping out what the game would look like to a player. After having decided on what we wanted it to look like we went on to outline our goals for the game. Our main goal for this game was to educate people about the continent of Africa.
Our next step was to then make all the backend decisions. We decided on the class structure and the data structure we needed for each element of our game. After having made the front-end and backend decisions we split up and allowed each group member to work on a certain room of the game. We then came back together to make the game work together and make sure all the rooms were working well together.

We learned how to implement graphs in this project. We all so learnt how to collaborate on a big project. We learned that in order to make everything work well we needed to communicate effectively, otherwise, we would need to change a lot. Additionally, we learned how to scope our project. We realized halfway through the project that we could not implement all the things we wanted due to time constraints.

We could have used an array for Okoye's room because this would have been easier than using a graph because using the graph complicated the implementation of Okoye's room. An array would have made it easy to access each riddle in the room.

We wish we could have additional rooms in the house. With more rooms, we could have our player explore more about the continent. We also wanted to allow our player to be able to continue playing the riddles in the witch's room even when they had got the one wrong but were unable to implement this due to time constraints. We also would have liked to include a help command which would allow the user to see what they could do at any point in the game. We would also have liked to have checked inventory so that the player could check the items they had at any point in the game. We would also have a hexed method where the player would have been hexed in the witch's room if they had gotten any of the riddles wrong and they would have had to go to Okoye's room to get healed

Some hints would have been to start early, even if you're not sure what exactly to do, you will figure it out as you go. Work on what you can first and then expand the game as you go on. Another hint would be to keep track of every decision as you go on because we ran into a lot of issues when we could have an error but were unsure why we had made some decisions before.


DESIGN JUSTIFICATION
In our witch's room we decided to use a 2D array because this made accessing riddles and hints very easy and we could connect each riddle to its hints. We could have used 3 linked lists for this. Each linked list has the riddle as the first node and hints as to the following nodes. This turned out to be quite expensive and complicated because we would have to have a method to go through each linked list recursively and be able to strategically recursively call the next linked list when the riddle was answered correctly. This also seems quite expensive because we did not need the capabilities of a linked list to insert and remove easily.

We decided to use a graph to connect all the rooms and hallway because this allowed so many connections to be made between all our places in the house. We could have used a tree but this would not have given us the flexibility to go back and forth between the rooms that we wanted.

We decided to use a graph in the jungle because this allowed us to have the player going from any animal to another. We could have also used a tree here but the inability of tres to allow us o go back and forth between nodes easily would have made this impossible.

We also used an Arraylist for the inventory because this allowed us to be able to easily add items and remove items. We could have used an Array with the maximum number of items the player could have had but this would have been a waste of storage.

We used a Hashmap to connect the user's input to the places in our game. We could have used a 2D array to make this connection but it would have made accessing the places difficult because we would have had to index throughout the array.

In Okoye's room, we used an ArrayList to check the riddles that had already been attempted. We could have used an array for this but it would not have allowed us to extend the array every time a riddle was attempted.
