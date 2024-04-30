import com.uriamp.models.Music;

public class Main {
  public static void main(String[] args) {
    Music music1 = new Music();

    music1.setArtist("Metallica");
    music1.setAlbum("Master of Puppets");
    music1.setTitle("Damage Inc.");
    music1.setGenre("Metal");

    System.out.println(music1.getAlbum());

  }
}
