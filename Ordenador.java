public class Ordenador {
    private String marca;
    private int velocidadProcesador;
    private boolean funcionaCorrectamente;


    public Ordenador(String nombreMarca, int velocidad) {
        marca = nombreMarca;
        velocidadProcesador = velocidad;
        funcionaCorrectamente = true;
    }

    public String getMarca() {
        return marca; 
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public boolean getFuncionaCorrectamente() {
        return funcionaCorrectamente;
    }

    public void setMarca(String nombreMarca) {
        marca = nombreMarca;
    }

    public void aumentarVelocidad() {
        velocidadProcesador = velocidadProcesador + 10;
    }
    
    public void alterarFuncionamiento() {
        funcionaCorrectamente = !funcionaCorrectamente;
    }
    
    public void imprimeDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad del procesador: " + velocidadProcesador);
        System.out.println("Funciona correctamente: " + funcionaCorrectamente);
    }
    
    public String estadoOrdenador() {
        return marca + " " + velocidadProcesador + " " + funcionaCorrectamente;
    }
}