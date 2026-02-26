package features.authors.domain;

public class DeleteAuthorUseCase {
    private final AuthorRepository authorRepository;

    public DeleteAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute(String authorId) {
        this.authorRepository.clone(authorId);
    }
}
