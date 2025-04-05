public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

      /*  if (fechaDeLanzamiento > 2022){
            System.out.println("La pelicula es nueva");
        } else {
            System.out.println("La pelicula es antigua");
        }*/

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su película");
        } else {
            System.out.println("Esta pelicula no esta incluida en su plan");
        }
    }
}
