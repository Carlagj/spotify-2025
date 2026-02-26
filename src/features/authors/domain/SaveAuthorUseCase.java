package features.authors.domain;

public class SaveAuthorUseCase {
    private AuthorRepository authorRepository;

    public SaveAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public void execute(Author author){
        authorRepository.saveAuthor(author);
    }
}

