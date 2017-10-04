package com.example.android.taller1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void probarcombinacion1(){
        int genero=0;

        int tipo=0;

        int marca=0;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                 double ve = 240000.0;
                 assertEquals(ve,vr,0);


    }
    @Test
    public void probarCombinacion2(){
        int genero=0;

        int tipo=0;

        int marca=1;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                double ve = 280000.0;
                assertEquals(ve,vr,0);


    }
    @Test
    public void probarCombinacion3(){
        int genero=0;

        int tipo=0;

        int marca=2;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                 double ve = 260000.0;
                 assertEquals(vr,ve,0);


    }
    @Test
    public void probarCombinacion4(){
        int genero=0;

        int tipo=1;

        int marca=0;

        int cantidad=2;

                double vr= Metodos.total(genero,tipo,marca,cantidad);
                  double ve = 100000.0;
                     assertEquals(vr,ve,0);
    }
    @Test
    public void probarCombinacion5(){
        int genero=0;

        int tipo=1;

        int marca=1;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                double ve = 160000.0;
                     assertEquals(vr,ve,0);
    }
    @Test
    public void probarCombinacion6(){
        int genero=0;

        int tipo=1;

        int marca=2;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                 double ve = 200000.0;
                    assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion7(){
        int genero=1;

        int tipo=0;

        int marca=0;

        int cantidad=2;

             double vr= Metodos.total(genero,tipo,marca,cantidad);
                 double ve = 2000000.0;
                    assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion8(){
        int genero=1;

        int tipo=0;

        int marca=1;

        int cantidad=2;

                double vr= Metodos.total(genero,tipo,marca,cantidad);
                    double ve = 2600000.0;
                        assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion9(){
        int genero=1;

        int tipo=0;

        int marca=2;

        int cantidad=2;

                 double vr= Metodos.total(genero,tipo,marca,cantidad);
                    double ve = 220000.0;
                        assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion10(){
        int genero=1;

        int tipo=1;

        int marca=0;

        int cantidad=2;

                double vr= Metodos.total(genero,tipo,marca,cantidad);
                    double ve = 120000.0;
                        assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion11(){
        int genero=1;

        int tipo=1;

        int marca=1;

        int cantidad=2;

                double vr= Metodos.total(genero,tipo,marca,cantidad);
                    double ve = 140000.0;
                        assertEquals(vr,ve,0);
    }
    @Test
    public void probarcombinacion12(){
        int genero=1;

        int tipo=1;

        int marca=2;

        int cantidad=2;

                double vr= Metodos.total(genero,tipo,marca,cantidad);
                    double ve = 240000.0;
                        assertEquals(vr,ve,0);
    }
}
