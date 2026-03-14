public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) 
    {
        return "You're a level " + String.valueOf(character.getLevel()) +
            " " + character.getCharacterClass() + " with " + 
            String.valueOf(character.getHitPoints()) + " hit points.";
    }
    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination dest) 
    {
        return "You've arrived at " + dest.getName() + ", which has " + 
            String.valueOf(dest.getInhabitants()) + " inhabitants.";   
    }
    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod tm) {
        switch (tm) {
            case TravelMethod.WALKING:
                return "You're traveling to your destination by walking.";
            case TravelMethod.HORSEBACK:
                return "You're traveling to your destination on horseback.";
            default:
                return "";
        }
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character)+ " " + describe(travelMethod) + " " + describe(destination);
    }
    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
