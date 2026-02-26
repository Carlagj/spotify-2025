package features.songs.domain;

public class DeleteSongUseCase {

        private final SongRepository songRepository;

        public DeleteSongUseCase(SongRepository songRepository) {
            this.songRepository = songRepository;
        }

        public void execute(String songId) {
            this.songRepository.delete(songId);
        }

}
