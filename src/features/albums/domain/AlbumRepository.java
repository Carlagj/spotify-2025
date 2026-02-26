package features.albums.domain;

import java.util.ArrayList;

public class AlbumRepository {
    ArrayList<Album> getAlbums();
    void saveAlbum(Album album);
}
