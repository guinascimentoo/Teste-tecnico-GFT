public class Caminhao extends Automovel{

    public String Diesel;

    public Caminhao(){
        super();
    }

    public Caminhao(String combustivel) {
        super(combustivel);
    }

    public String getDiesel() {
        return Diesel;
    }

    public void setDiesel(String diesel) {
        Diesel = diesel;
    }
}