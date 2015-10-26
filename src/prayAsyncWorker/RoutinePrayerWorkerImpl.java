package prayAsyncWorker;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class RoutinePrayerWorkerImpl implements RoutinePrayerWorker {

    private static final Logger LOGGER = Logger
            .getLogger(RoutinePrayerWorkerImpl.class.getName());
    {

        try {
            FileHandler fileHandler = new FileHandler(
                    "/Users/SteveSun/Google Drive/Developer/MiscProjectsWorkspace/ReallyRandomProject/MyLogFile.log");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            LOGGER.info("Caught IOException and enters catch branch now, "
                    + "\nthe exception is: " + e + "\n" + e.getMessage() + "\n"
                    + e.getCause() + "\n" + e.getStackTrace());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    private String prayerName;

    public RoutinePrayerWorkerImpl(String prayerName) {
        LOGGER.info("Constructor is being called now, passing in " + prayerName
                + " as its prayerName");
        this.prayerName = prayerName;
    }

    @Override
    public void routinePray() {
        LOGGER.info("routinePray() method is invoked now, printing out this line:"
                + "I'm excited to pray every day! Before every meal!");
        System.out.println("I'm excited to pray every day! Before every meal!");
    }

    @Override
    public String routineReadBible() {
        LOGGER.info("routineReadBible() method is invoked now, returning this following string:"
                + "Great day, isn't it? Let's study the Bible now!");
        return "Great day, isn't it? Let's study the Bible now!";
    }

    public static void main(String[] args) {
        RoutinePrayerWorker routinePrayerWorkerA = new RoutinePrayerWorkerImpl(
                "Steve Sun");
        routinePrayerWorkerA.routinePray();
        System.out.println(routinePrayerWorkerA.routineReadBible());
        System.out.println("That's the end of it!");
    }
}
