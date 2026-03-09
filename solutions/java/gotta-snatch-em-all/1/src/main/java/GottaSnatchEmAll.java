import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<> (cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty()&&theirCollection.isEmpty())
            return false;
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();
        for (Set<String> cards : collections){
            for (String card : cards) {
                if (!map.containsKey(card)) {
                    map.put(card, 1);
                } else {
                    map.put(card, map.get(card) + 1);
                }
            }
        }
        for (String card : map.keySet()) {
            if (map.get(card) == collections.size()) {
                set.add(card);
            }
        }
        return set;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        for (Set<String> cards : collections){
            for (String card : cards) {
                set.add(card);
            }
        }
        return set;
    }
}
