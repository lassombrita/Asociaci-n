public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    // CONSTRUCTORES
    public Libro() {
        disponible = true;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // SETTERS
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        }
        else {System.out.println("Error: el titulo esta vacío.");
        }
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }




        //METODOS
    public void mostrarInfo() {
        System.out.println("---- Libro ----");
        System.out.println("Título     : " + titulo);
        System.out.println("Autor      : " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
            return false;
        }
    }

    public void devolver(){
        disponible = true;
        System.out.println("El libro\"" + this.titulo + "\" fue devuelto");
    }
 } 

