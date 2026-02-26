package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.domain.Album;
import features.albums.domain.GetAlbumsUseCase;
import features.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {
    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(AlbumDataRepository)
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbum(){
        Album newAlbum = new Album("2" , "name2", "2000");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(AlbumDataRepository)
        );
        saveAlbumUseCase.execute(newAlbum);



        printAlbums();
    }
}
