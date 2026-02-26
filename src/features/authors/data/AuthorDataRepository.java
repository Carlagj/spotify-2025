package features.authors.data;

import features.albums.data.AlbumMemLocalDataSource;
import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorDataRepository {
    private AuthorMemLocalDataSource authorMemLocalDataSource;
    private AuthorApiLocalDataSource authorApiLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource,
                                AuthorApiLocalDataSource authorApiLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
        this.authorApiLocalDataSource = authorApiLocalDataSource;
    }


    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }

    @Override
    public void delete(String id) {
        AuthorMemLocalDataSource.delete(id);
    }
}
