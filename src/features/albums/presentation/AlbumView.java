package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.domain.Album;
import features.albums.domain.GetAlbumsUseCase;
import features.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {
    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbum(){
        //Me creo un album ficticio y lo almaceno.
        Album newAlbum = new Album("2" , "name2", "2000");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        saveAlbumUseCase.execute(newAlbum);


        //Recupero la información y valido que está guardada.
        printAlbums();
    }
}
