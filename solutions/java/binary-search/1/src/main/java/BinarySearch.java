import java.util.List;

class BinarySearch {
    List<Integer> items;
    BinarySearch(List<Integer> items) {
        this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
        if (!items.contains(item) || items.size() < 1)
            throw new ValueNotFoundException("Value not in array");
        
        if (items.size() <2)
            return 0;
        
        int ini = 0;
        int fin = items.size()-1;
        int m = items.get(items.size()-1)/2;
        
        while (ini < fin) {
            m = (ini+fin)/2;
            if (items.get(m) == item)
                return m;
            else if (items.get(m) < item) {
                ini = m+1;
            }
            else {
                fin = m-1;
            }
        }
        if ((items.get(ini) != item && items.get(fin) != item))
            throw new ValueNotFoundException("Value not in array");
        else if (items.get(ini) == item)
            return ini;   
        else
            return fin;
    }
}
