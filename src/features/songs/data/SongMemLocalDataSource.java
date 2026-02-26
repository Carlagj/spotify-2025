package features.songs.data;

import features.songs.domain.Song;

import java.util.ArrayList;

public class SongMemLocalDataSource {
        private static SongMemLocalDataSource instance = null;

        private ArrayList<Song> storage = new ArrayList<>();

        private SongMemLocalDataSource() {
            initData();
        }

        private void initData(){
            Song song = new Song ();
            storage.add(song);
        }

        public ArrayList<Song> findAll(){
            return storage;
        }

        public void save(Song song){
            storage.add(song);
            System.out.println(song);
        }

        public static SongMemLocalDataSource newInstance(){
            if (instance == null){
                instance = new SongMemLocalDataSource();

            }

            return instance;
        }

}

