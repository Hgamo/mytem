
/**
 * Die Klasse Feed ist die Listklasse und enthält die FeedItems.
 * 
 * @author Vitus und Fabian
 * @version 17.01.2021
 */
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

  public Feed alleFeedItemsVonEinemTag(LocalDateTime day) {
    Feed newFeed = new Feed();
    toFirst();
    while (hasAccess()) {
      if (getContent().isFromSameDay(day)) {
        newFeed.append(getContent());
      }
      next();
    }
    return newFeed;
  }

  /**
   * Suchfunktion über Zeit
   * 
   * @param gesucht Die gesuchte Zeit (Eegen des LocalDateTime Formats ist eine
   *                sehr genaue Angabe nötig, alternativ kann auch eine Zeitspanne
   *                für grobe Angaben implementiert werden)
   *
   *                Die Funktion vergleicht den Inhalt bei jedem Knoten mit dem
   *                gesuchten Wert und schreitet bei fehlender Übereinstimmung die
   *                Knoten weiter ab. Die Funktion gibt aus, ob ein Ergebnis
   *                gefunden wurde oder nicht und verweist dabei auf den Inhalt
   *                bei dem Knoten.
   *
   * @author Vitus
   */
  public void suchFunktionPerZeit(LocalDateTime gesucht) {
    toFirst();
    while (hasAccess()) {
      if (getContent().isFromSameDay(gesucht)) {
        System.out.println("Es wurde ein Item" + getContent().toString() + " Im Feed gefunden.");
      }
      next();
    }
    System.out.println("Es wurde KEIN (weiteres) Item im Feed gefunden");
  }

  /**
   * Suchfunktion über ID
   * 
   * @param gesucht Die gesuchte ID
   *
   *                Die Funktion vergleicht den Inhalt bei jedem Knoten mit dem
   *                gesuchten Wert und schreitet bei fehlender Übereinstimmung die
   *                Knoten weiter ab. Die Funktion gibt aus, ob ein Ergebnis
   *                gefunden wurde oder nicht und verweist dabei auf den Inhalt
   *                bei dem Knoten.
   *
   * @author Vitus
   */
  public void suchFunktionPerID(int gesucht) {
    toFirst();
    while (hasAccess()) {
      if (getContent().getId() == gesucht) {
        System.out.println("Es wurde ein Item " + getContent().toString() + " im Feed gefunden");
      }
      next();

    }
    System.out.println("Es wurde KEIN (weiteres) Item in im Feed gefunden");
  }

  /**
   * Lösche die gesamte Liste
   * 
   * Das ist unsere weitere selbstgewählte nicht triviale Fähigkeit.
   *
   * Die Funktion entfernt einen Knoten nach dem anderen. Damit werden alle
   * Inhalte gelöscht. Eine andere Möglichkeit wäre, durch das Löschen des ersten
   * Knotens eine Kettenreaktion wegen fehlender Verweise aufeinander
   * loszutreteten.
   *
   * @author Vitus
   */
  public void allesLoeschen() {
    while (hasAccess()) {
      remove();
    }
  }

}
