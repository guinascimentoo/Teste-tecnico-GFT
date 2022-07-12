public class Esportivo extends Automovel{

    public String Gasolina;

    public Esportivo(){
        super();
    }

    public Esportivo(String combustivel) {
        super(combustivel);
    }

    public String getGasolina() {
        return Gasolina;
    }

    public void setGasolina(String gasolina) {
        Gasolina = gasolina;
    }
}