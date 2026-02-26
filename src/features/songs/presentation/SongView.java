package features.songs.presentation;


import features.songs.data.SongDataRepository;
import features.songs.data.SongMemLocalDataSource;
import features.songs.domain.GetSongsUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {
    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance())
        );
        ArrayList<Song> songs = getSongsUseCase.execute();
        System.out.println(songs);
    }

    public static void saveAlbum(){

        Song newSong = new Song();
        SaveSongUseCase saveSongUseCase = new SaveSongUseCase(
                new SongDataRepository(SongMemLocalDataSource.newInstance())
        );
        saveSongUseCase.execute(newSong);


        printSongs();
    }

}
}
