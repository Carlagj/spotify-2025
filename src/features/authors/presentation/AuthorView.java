package features.authors.presentation;

import features.authors.data.AuthorApiLocalDataSource;
import features.authors.data.AuthorDataRepository;
import features.authors.data.AuthorMemLocalDataSource;
import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorView {
    public static void printAuthors() {
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(
                new AuthorDataRepository(
                        new AuthorMemLocalDataSource(),
                        new AuthorApiLocalDataSource()));


                        ArrayList<Author> authors = getAuthorsUseCase.execute();
                        System.out.println(authors);


    }
}
