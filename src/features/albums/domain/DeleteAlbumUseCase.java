package features.albums.domain;

public class DeleteAlbumUseCase {
    private final AlbumRepository albumRepository;

    public DeleteAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(String albumId) {
        this.albumRepository.delete(albumId);
    }
}
