public class LogLevels {
    
    public static String message(String logLine) {
        String log = logLine;
        String[] str = log.split(": ", 2);
        return str[1].trim(); 
    }

    public static String logLevel(String logLine) {
        String log = logLine;
        String[] str = log.split("]:", 2);
        String sub = str[0];
        String level = sub.substring(1).toLowerCase();
        return level.trim(); 

        
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine)+ ")";
    }
}
