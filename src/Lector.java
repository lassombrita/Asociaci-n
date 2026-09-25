public class Lector {
    private String nombre;
    private String cedula;
    private Libro libroActual;


public Lector(){
}

public Lector (String cedula, String nombre){
    this.cedula = cedula;
    this.nombre = nombre;
}
// getters
public String getNombre(){
    return nombre;
}


public String getCedula(){
    return cedula;
}

public Libro getLibroActual(){
    return libroActual;
}
// setters

public void setCedula(){
    this.cedula = cedula;
}

public void setNombre(){
    this.nombre = nombre;
}

public void setLibroNuevo(){
    this.libroActual = libroActual;
}

// metodos

public void tomarPrestado(Libro libro){
    if (libroActual != null){
        System.out.println(this.nombre + " ya tiene el libro\"" + this.libroActual.getTitulo() +
     "\". Deve devolverlo primero.");
        }
    else{
        if (libro.prestar())
            {libroActual = libro; }
        }
    }

    public void regresarLibre(){
        if(libroActual == null){
            System.out.println(this.nombre + " no tiene ningun libro.");
        }
        else{
            libroActual.devolver();
            libroActual = null;
        }
    }

    public void muestraEstado(){
        Srting estado =(libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + this.nombre + " | Libro: " + estado);
    }




}
