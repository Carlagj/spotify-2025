package features.authors.domain;

import java.util.ArrayList;

public class GetAuthorUseCase {

    private AuthorRepository authorRepository;

    public GetAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public ArrayList<Author> execute(){
        return authorRepository.getAuthors();
    }
}
