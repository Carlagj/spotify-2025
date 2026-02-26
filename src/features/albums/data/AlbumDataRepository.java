package features.albums.data;

import features.albums.domain.Album;

public class AlbumDataRepository {
    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }

    @Override
    public ArrayList<Album> getAlbums() {
        return albumMemLocalDataSource.findAll();
    }

    @Override
    public void saveAlbum(Album album) {
        albumMemLocalDataSource.save(album);
    }

    @Override
    public void delete(String id) {
        AlbumMemLocalDataSource.delete(id);
    }
}
