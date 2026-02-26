package features.authors.presentation;

import features.authors.data.AuthorApiLocalDataSource;
import features.authors.data.AuthorDataRepository;
import features.authors.data.AuthorMemLocalDataSource;
import features.authors.domain.Author;
import features.authors.domain.GetAuthorUseCase;

import java.util.ArrayList;

public class AuthorView {
    public static void printAuthors() {

        GetAuthorUseCase getAuthorsUseCase = new GetAuthorUseCase(
                new AuthorDataRepository(AuthorMemLocalDataSource.newInstance())
        );
        ArrayList<Author> authors = getAuthorsUseCase.execute();
        System.out.println(authors);
    }

    public static void saveAuthor(){

        Author newAlbum = new Author("2" , "name2", "2000");
        SaveAuthorUseCase saveAuthorUseCase = new SaveAuthorUseCase(
                new AuthorDataRepository(AuthorMemLocalDataSource.newInstance())
        );
        saveAuthorUseCase.execute(newAlbum);


        printAuthors();
    }
}
