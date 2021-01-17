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
    while (hasAccess()) {
      System.out.println(getContent().toString());
      next();
    }
  }

  public void printOutputShort() {
    toFirst();
    while (hasAccess()) {
      System.out.println(getContent().toString());
      next();
    }
  }

  public void teilListe() {

  }

  public void suchFunktionPerZeit(LocalDateTime gesucht) {
    toFirst();
    while (hasAccess()) {
      if (getContent().isFromSameData(gesucht)) {
        System.out.println("Es wurde ein Element" + getContent().toString() + " gefunden.");
      }
      next();
    }
    System.out.println("Es wurde KEIN (weiteres) Element in Liste gefunden");
  }

  public void suchFunktionPerID(int gesucht) {
    toFirst();
    while (hasAccess()) {
      if (getContent().getId() == gesucht) {
        System.out.println("Es wurde ein Element " + getContent().toString() + " in der Liste gefunden");
      }
      next();

    }
    System.out.println("Es wurde KEIN (weiteres) Element in Liste gefunden");
  }

  public void weiteres() {

  }

}
