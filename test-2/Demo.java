public class Demo
{
    static void main() {
        Film film;
        
        film = new Film("Interstellar", 2014);
        film.rate(8);
        film.rate(9);
        film.display();
        
        film = new TVSeries("Game of Thrones", 2011, 7);
        film.rate(9);
        film.rate(10);
        film.display();
    }
    
    static void opg3() {
        Film film;
        film = new Film("Interstellar", 2014);
        try {
            film.display();
        } catch(RuntimeException e) {
            System.out.println("Der er opstået en hændelse:");
            System.out.println(e.getMessage());
        }
    }
    
    static void opg4() {
        Film film;
        film = new Film("Interstellar", 2014);
        try {
            film.checkedRate(100);
        } catch(InvalidValueException e) {
            System.out.println("Ulovlig bedømmelse: " + e.getValue());
            System.out.println(e.getMessage());
        }
    }
}