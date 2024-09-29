import java.util.EnumMap;

public class LevelAction {
        public static void main(String[] args) {
            EnumMap<Level, String> levelActions = new EnumMap<>(Level.class);

            levelActions.put(Level.LOW, "Low action");
            levelActions.put(Level.MEDIUM, "Medium action");
            levelActions.put(Level.HIGH, "High action");

            for (Level level : Level.values()) {
                System.out.println(level + ": " + levelActions.get(level));
            }
        }
    }
