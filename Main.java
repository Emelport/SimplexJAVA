import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de maximización:
        //x + y <= 4
        //2x + y <= 5
        //x + 2y <= 6


            //PROBLEMA DE LA GABY
            /* 
            Ingrese los coeficientes de la función objetivo:
            X1: 5
            X2: 4
            X3: 3
            Ingrese los coeficientes de la restricción 1:
            X1: 2
            X2: 1
            X3: 1
            Valor RHS de la restricción 1: 8
            Ingrese los coeficientes de la restricción 2:
            X1: 1
            X2: 3
            X3: 2
            Valor RHS de la restricción 2: 6
            Ingrese los coeficientes de la restricción 3:
            X1: 3
            X2: 2
            X3: 4
            Valor RHS de la restricción 3: 10
            */
     
        Double [][] restricciones = {
            {2.0, 1.0, 1.0, 8.0},
            {1.0, 3.0, 2.0, 6.0},
            {3.0, 2.0, 4.0, 10.0}
        };

        Double [] funcionObjetivo = {5.0, 4.0, 3.0};

        Simplex simplexMax = new Simplex(restricciones, funcionObjetivo, "Max");
        simplexMax.resolver();

        // Double[][] restricciones = {
        //         {1.0, 1.0,480.0},
        //         {2.0, 1.0, 800.0}
        // };

        // //Z = 3x + 2y
        // Double[] funcionObjetivo = {40.0, 30.0};

        // Simplex simplexMax = new Simplex(restricciones, funcionObjetivo, "Max");
        // simplexMax.resolver();

        // Double[][] AMin ={
        //         {1.0,1.0,4.0},
        //         {2.0,1.0,5.0},
        //         {1.0,2.0,6.0},
        // };  

        // Double[] z = {3.0, 2.0};
        // Simplex simplexMin = new Simplex(AMin, z, "Min");
        // simplexMin.resolver();

    };

}