package features.albums.data;

import features.albums.domain.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {
    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> storage = new ArrayList<>();

    private AlbumMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Album album = new Album("1","album1", "1999");
        storage.add(album);
    }

    public ArrayList<Album> findAll(){
        return storage;
    }

    public void save(Album album){
        storage.add(album);
        System.out.println(album);
    }

    public static AlbumMemLocalDataSource newInstance(){
        if (instance == null){
            instance = new AlbumMemLocalDataSource();

        }

        return instance;
    }

    public void delete(String id) {
        storage.removeIf(album -> album.getId().equals(id));
    }
}
