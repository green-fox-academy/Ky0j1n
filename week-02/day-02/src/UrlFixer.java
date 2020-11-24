// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!
public class UrlFixer {
    public static String  fix(String input){
        String get = input;
        String firstPart = get.substring(0,5) + ":/";
        String secondPart = get.substring(6);
        String together = firstPart + secondPart ;
        return together;
    }
 public static void  main(String[] args){
     String url = "https//www.reddit.com/r/nevertellmethebots";
     String url2 = url.replace("https//www.reddit.com/r/nevertellmethebots", "https//www.reddit.com/r/nevertellmetheodds")
     String odds = url.substring(0, 38) + "odds";
     System.out.println(fix(odds));
 }
}
