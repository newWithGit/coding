package misc;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Java8ReadFile {

    static Set<String> offerId = new HashSet<>();
    static List<String> allOfferId = new ArrayList<>();
    //static String regex = "([0-9a-zA-z]{8}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{12} [0-9]{4})";
    //static String regex = "([0-9a-zA-z]{8}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{4}-[0-9a-zA-z]{12})";
    //static String regex = "(8aea88c4-d4c0-4c96-83ac-71619cb14126 [0-9]{1,4})";
    static String regex = "([0-9A-z]{32} [0-9]{4})";
    static Pattern pattern = Pattern.compile(regex);

    public static void main(String[] args) {
        //String fileLocation = "/Users/s0k02c9/Desktop/jars/StoreItem.csv";
        //String fileLocation = "/Users/s0k02c9/Desktop/jars/All_Cache_Miss.csv";
        String fileLocation = "/Users/s0k02c9/Desktop/jars/OfferSellerRegion.csv";
        //String fileLocation = "/Users/s0k02c9/Desktop/jars/OfferRegionCacheMiss_9_10_TO_9_13.csv";
        readFile(fileLocation);
        System.out.println(offerId.size());
        System.out.println(allOfferId.size());
        topOfferStore();

    }

    public static void readFile(String fileLoc) {
        try {
            Files.lines(Paths.get(fileLoc)).forEach(Java8ReadFile::offerIdStoreCombination);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void topOfferStore() {
        Map<String, Long> frequencyMap = allOfferId.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 50).forEach(stringLongEntry -> {
            System.out.println(String.format("offerStore %s, count %d", stringLongEntry.getKey(), stringLongEntry.getValue()));
        });

        //long count = allOfferId.stream().filter(offer -> offer.equals("8aea88c4-d4c0-4c96-83ac-71619cb14126")).count();
        //System.out.println(count);
    }

    private static void offerIdStoreCombination(String line) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            String offerStoreCombination = matcher.group();
            //String[] offer = offerStoreCombination.split(" ");
            offerId.add(offerStoreCombination);
            allOfferId.add(offerStoreCombination);
            //offerId.add(offer[0]);
            //allOfferId.add(offer[0]);
        }
    }

}
