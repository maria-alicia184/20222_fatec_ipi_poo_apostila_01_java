public class ExercicioCarro{

    //atributos
    private String acelerarCarro;
    private String buzinarCarro;

    public ExercicioCarro (String n){
        setAcelerarCarro(n);
        setBuzinarCarro(n);
    }
    //setter
    public void setAcelerarCarro (String n){
        acelerarCarro = n;
    }
    public void setBuzinarCarro (String n){
        buzinarCarro = n;
    }
    //getter
    public String getAcelerarCarro(){
        return acelerarCarro;
    }
    public String getBuzinarCarro(){
        return buzinarCarro;
    }

    //métodos
    //acelerar
    public void acelerandoCarro(){
        System.out.printf ("O carro esta %s \n", acelerarCarro);
    }
    //buzinar
    public void buzinandoCarro(){
        System.out.printf ("O carro esta %s \n", buzinarCarro);
    }
}