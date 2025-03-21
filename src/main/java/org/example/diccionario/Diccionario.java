package org.example.diccionario;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {

    private Map<String, String> diccionario;

    public Diccionario(){

        diccionario = new HashMap<>();

    }

    public void nuevoPar(String palabra_esp, String palabra_ing){

        diccionario.put(palabra_esp,palabra_ing);

    }

    public void traducir(String palabra_esp){

        System.out.println("Traducción de " + palabra_esp + ": " + diccionario.get(palabra_esp));

    }

}
