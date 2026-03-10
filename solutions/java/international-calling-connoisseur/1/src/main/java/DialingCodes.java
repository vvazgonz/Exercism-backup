import java.util.*;

public class DialingCodes {
    private Map<Integer, String> map;
    public DialingCodes() {
        this.map = new HashMap<>();
    }
    
    public Map<Integer, String> getCodes() {
        return this.map;
    }

    public void setDialingCode(Integer code, String country) {
        this.map.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.map.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!(this.map.containsKey(code) || this.map.containsValue(country))) {
            this.setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        if (this.map.containsValue(country)) {
            for (Integer i : map.keySet()) {
                if (country == map.get(i)) {
                    return i;
                }
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (this.map.containsValue(country)) {
            map.remove(this.findDialingCode(country));
            map.put(code, country);
        }
    }
}
