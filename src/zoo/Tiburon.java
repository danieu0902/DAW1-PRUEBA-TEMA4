package zoo;

/**
 * La clase Tiburon representa a un tipo de pescado que pertenece al zoo.
 * Los tiburones tienen características específicas como su especie, si es peligroso y el numero de tiburones que hay en el zoo.
 */
public class Tiburon extends Pez {
    /** La especie del tiburon. */
    private String especie;
    /** Variable que te indica si es peligroso. */
    private boolean peligroso;
    /** Numero de tiburones que hay disponibles en el zoo. */
    private static int numTiburones = 0;
    /** 
     * Constructor de Gallina sin parámetros.
     * Crea una nueva instancia de Tiburon especificando los atributos.
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     *Constructor de Tiburon parametrizado
     * @param especie indica la especie del tiburon
     * @param peligroso indica si es peligroso o no.
     * @param velocidadMaxNatacion indica la velocidad maxima.
     * @param tipo indica el tipo de tiburon
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
     /**
     *Constructor de Tiburon parametrizado
     * @param especie indica la especie del tiburon
     * @param peligroso indica si es peligroso o no.
     * @param velocidadMaxNatacion indica la velocidad maxima.
     * @param tipo indica el tipo de tiburon
     * @param habitat indica el habitat del tiburon
     * @param comida indica la comida del tiburon
     * @param longevidad indica la longevidad del tiburon.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    /** 
     * Realiza el acto de desplazarse.
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    /** 
     * Realiza el acto de alimentarse.
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    /** 
     * esto lo que quiere indicar es que el tiburon esta muerto.
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
