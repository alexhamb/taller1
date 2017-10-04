package com.example.android.taller1;

/**
 * Created by alex6 on 03/10/2017.
 */

public class Metodos {


    public static double total(int genero, int tipo, int marca, int cantidad) {
        double precioTotal = 0.0;


        if (genero == 0) {
            if (tipo == 0) {
                if (marca == 0) {
                    precioTotal = 120000 * cantidad;
                } else {
                    if (marca == 1) {
                        precioTotal = 140000 * cantidad;
                    } else {
                        precioTotal = 130000 * cantidad;
                    }
                }

                            } else {
                                if (marca == 0) {
                                    precioTotal = 50000 * cantidad;
                                } else {
                                    if (marca == 1) {
                                        precioTotal = 80000 * cantidad;
                                    } else {
                                        precioTotal = 100000 * cantidad;
                                    }
                                }
                            }

                                            } else {
                                                if (tipo == 0) {
                                                    if (marca == 0) {
                                                        precioTotal = 100000 * cantidad;
                                                    } else {
                                                        if (marca == 1) {
                                                            precioTotal = 130000 * cantidad;
                                                        } else {
                                                            precioTotal = 110000 * cantidad;
                                                        }
                                                    }


                                                                } else {
                                                                    if (marca == 0) {
                                                                        precioTotal = 60000 * cantidad;
                                                                    } else {
                                                                        if (marca == 1) {
                                                                            precioTotal = 70000 * cantidad;
                                                                        } else {
                                                                            precioTotal = 120000 * cantidad;
                                                                        }
                                                                    }
            }
        }




        return precioTotal;

    }
}
