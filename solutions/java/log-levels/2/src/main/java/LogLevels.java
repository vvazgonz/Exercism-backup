public class LogLevels {
    
    public static String message(String logLine) {
        String log = logLine;
        // Divide the String in 2. 
        String[] str = log.split(": ", 2);
        // Trim for deleting blank spaces.
        return str[1].trim(); 
    }

    public static String logLevel(String logLine) {
        String log = logLine;
        // Divide the string.
        String[] str = log.split("]:", 2);
        // Selecting the first part of the String (after dividing).
        String sub = str[0];
        // To Lower Case
        String level = sub.substring(1).toLowerCase();
        //Deleting blank Spaces.
        return level.trim(); 

        
    }

    public static String reformat(String logLine) {
        // Calling methods.
        return message(logLine) + " (" + logLevel(logLine)+ ")";
    }
}
