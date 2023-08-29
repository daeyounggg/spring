package exam01;

import java.util.Optional;

public class ex08 {
    public static void main(String[] args) {
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        //Book book2 = opt.orElseThrow(); // get()
        Book book2 = opt.orElseThrow(BookNotFoundException::new);

    }
}
