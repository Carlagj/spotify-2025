package features.authors.data;
import features.authors.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {
        private static features.authors.data.AuthorMemLocalDataSource instance = null;

        private ArrayList<Author> storage = new ArrayList<>();

        private AuthorMemLocalDataSource() {
            initData();
        }

        private void initData(){
            Author author = new Author("1","MemExtremoduro", "01-01-1970", "Española");
            storage.add(author);
        }

        public ArrayList<Author> findAll(){
            return storage;
        }

        public void save(Author author){
            storage.add(author);
            System.out.println(author);
        }

        public static features.authors.data.AuthorMemLocalDataSource newInstance(){
            if (instance == null){
                instance = new features.authors.data.AuthorMemLocalDataSource();

            }

            return instance;
        }

}

