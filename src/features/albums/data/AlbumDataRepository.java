package features.albums.data;

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

}
