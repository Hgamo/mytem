import java.time.LocalDateTime;

public class Feed extends List<FeedItem> {
  Feed() {
  }

  void addFeedItem(LocalDateTime time, String imageSrc) {
    FeedItem feedItem = new FeedItem();
    feedItem.changeTime(time);
    feedItem.changeImageSrc(imageSrc);
    toLast();
    append(feedItem);
  }

  public void printOutputLong() {
    toFirst();
    while(hasAccess()){
      System.out.println(getContent().toString());
      next();
    }
  }
  
  public void printOutputShort() {
    toFirst();
    while(hasAccess()){
      System.out.println(getContent().toString());
      next();
    }
  }
  
  public void teilListe() {
    
  }
  
  public void sortierFunktion() {
    
  }
  
  public void weiteres() {
    
  }
  
  

}
