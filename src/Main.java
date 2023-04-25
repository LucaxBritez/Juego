import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Dados
        /*Random rand = new Random();
        int numero1 = rand.nextInt(5) + 1;
        int numero2 = rand.nextInt(10) + 1;
        int numero3 = rand.nextInt(50) + 1;

        System.out.println("Numero random entre 1 y 5 : " + numero1);
        System.out.println("Numero random entre 1 y 10 : " + numero2);
        System.out.println("Numero random entre 1 y 50 : " + numero3);*/

        Jugador player = new Jugador();
        player.setVida(10);
        player.setAtaqueBase(2);

        Zombie enemigo = new Zombie();
        enemigo.setVida(10);
        enemigo.setAtaqueBase(1);

        //Atributos del jugador
        System.out.println("Puntos de vida del jugador: " + player.getVida());
        System.out.println("Puntos de ataque del jugador: " + player.getAtaqueBase());

        //Espacio
        System.out.println("");

        //Encuentro con enemigo
        System.out.println("Jugador se encuentra con un enemigo -Zombie-");

        //Espacio
        System.out.println("");

        //Atributos del zombie
        System.out.println("Puntos de vida del -Zombie- : " + enemigo.getVida());
        System.out.println("Puntos de ataque del -Zombie- : " + enemigo.getAtaqueBase());

        //Espacio
        System.out.println("");

        //Inicio de combate
        System.out.println("|¡Inicio de combate!|");

        //Espacio
        System.out.println("");


        //Bucle para llevar a cabo el combate.
        do{

            //Turno del jugador
            System.out.println("|Turno de jugador|");
            enemigo.setVida(enemigo.getVida() - player.getAtaqueBase());
            System.out.println("|El jugador hace " + player.getAtaqueBase() + " puntos de daño.|");
            System.out.println("|El -Zombie- tiene " + enemigo.getVida() + " puntos de vida.|");
            //Espacio entre turno de jugador y el del zombie.
            System.out.println("");

            /*Condicional que envia mensaje de victoria en caso de que el enemigo tenga 0 o menos puntos de vida,
                en caso contrario se lleva a cabo el turno del enemigo.*/
            if (enemigo.getVida() <= 0){

                System.out.println("|¡El enemigo ha sido derrotado!|");

            } else {
                /*Turno del zombie.*/
                System.out.println("|Turno de -Zombie-|");
                player.setVida(player.getVida() - enemigo.getAtaqueBase());
                System.out.println("|El -Zombie- hace " + enemigo.getAtaqueBase() + " puntos de daño.|");
                System.out.println("|El jugador tiene " + player.getVida() + " puntos de vida.|");

                //Espacio entre turno del zombie y el siguiente mensaje.
                System.out.println("");

                /*Condicional que envia mensaje de derrota en caso de que el jugador tenga 0 o menos puntos de vida,
                   en caso contrario se repite el turno de combate del jugador si la condicion del bucle Do-While aun
                    se cumple.*/
                if(player.getVida() <= 0){
                    System.out.println("|El jugador ha sido derrotado...|");
                }
            }


        }while(player.getVida() > 0 && enemigo.getVida() > 0);

    }
}