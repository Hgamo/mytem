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

  public void teilListe() {

  }
/**
	* Suchfunktion über Zeit
	* 
	* @param gesucht Die gesuchte Zeit (Eegen des LocalDateTime Formats ist eine sehr genaue Angabe nötig, alternativ kann auch eine Zeitspanne für grobe Angaben implementiert werden)
	*
	* Die Funktion vergleicht den Inhalt bei jedem Knoten mit dem gesuchten Wert und schreitet bei fehlender Übereinstimmung die Knoten weiter ab. Die Funktion gibt aus, ob ein Ergebnis gefunden wurde oder nicht und verweist dabei auf den Inhalt bei dem Knoten.
	*
	* @author Vitus
	 */
  public void suchFunktionPerZeit(LocalDateTime gesucht) {
    toFirst();
    while (hasAccess()) {
      if (getContent().isFromSameData(gesucht)) {
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
	* Die Funktion vergleicht den Inhalt bei jedem Knoten mit dem gesuchten Wert und schreitet bei fehlender Übereinstimmung die Knoten weiter ab. Die Funktion gibt aus, ob ein Ergebnis gefunden wurde oder nicht und verweist dabei auf den Inhalt bei dem Knoten.
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
   * Der Verweis auf den ersten Knoten wird gelöscht. So wird eine Kettenreaktion losgetreten, die dazu führt, dass auf keinen weiteren Knoten mehr verwiesen wird und so der gesamte Inhalt gelöscht ist.
   *
   * @author Vitus
	 */
  public void allesLoeschen() {
    head = null;
  }

}
