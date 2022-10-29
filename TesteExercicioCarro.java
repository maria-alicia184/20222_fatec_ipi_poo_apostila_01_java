public class TesteExercicioCarro {
    static public void main (String args []){
        //instancia veículo 1
        ExercicioCarro carro1 = new ExercicioCarro("Acelerando");
        //carro1.setAcelerarCarro("Acelerando");
        carro1.acelerandoCarro();

        //instancia veículo 2
        ExercicioCarro carro2;
        carro2 = new ExercicioCarro("Buzinando");
        //carro2.setBuzinarCarro("Buzinando");
        carro2.buzinandoCarro();
    }
}
