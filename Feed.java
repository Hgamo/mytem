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
  
  public void suchFunktionPerZeit (LocalDateTime gesucht) {
    gesucht = gesucht.this;
    Node current = head;
    while (current != null){ 
      if (current.time == gesucht) {
        return true;
        System.out.println("Es wurde ein Element mit der Zeit " gesucht " am Knoten " current " mit der ID " current.id " gefunden.");}
      else{
        current = current.next; }
      } 
      return false;
      System.out.println("Es wurde KEIN (weiteres) Element mit der Zeit " gesucht " in Liste gefunden");
  }
  
  public void suchFunktionPerID (int gesucht) {
    gesucht = gesucht.this;
    Node current = head;
    while (current != null){ 
      if (current.id == gesucht) {
        return true;
        System.out.println("Es wurde ein Element mit der ID " gesucht " am Knoten " current " in Liste gefunden");}
      else{
        current = current.next; }
      } 
      return false;
      System.out.println("Es wurde KEIN (weiteres) Element mit der ID " gesucht " in Liste gefunden");
  }

  
  public void weiteres() {
    
  }
  
  

}
