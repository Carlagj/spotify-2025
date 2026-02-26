package features.songs.presentation;


public class SongView {
    public static void printSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(new SongDataRepository());
        ArrayList<Song> songsList = getSongsUseCase.execute();


        System.out.println(songsList);


    }
}
