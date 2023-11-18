package Commom;

import web.WebPage;

import java.util.Random;

public class CommomMethods {

    public static String[] EscolhePerfil(String perfil){
        String[] array = new String[2];
        String matricula="", senha="";
        perfil = perfil.toLowerCase();
        switch (perfil){
            case "proprietario":
                matricula = "FC154341";
                senha = "furnas41" ;
                break;

            case "administrador":
                matricula = "FC334503";
                senha = "furnas33" ;
                break;

            case "projetista interno":
                matricula = "FC331371";
                senha = "furnas13" ;
                break;

            case "projetista externo":
                matricula = "FC333555";
                senha = "furnas09" ;
                break;

            case "gestor":
                matricula = "FC331370";
                senha = "furnas33" ;
                break;
        }
        array[0] = matricula; array[1]=senha;
        return  array;
    }

    public static String GeraTexto() {
        Random random = new Random();
        String string = "";
        char valor = (char) random.nextInt(65,127);
        for(int i = 0; i<20; i++){
            string += valor;
            valor = (char) random.nextInt(65,127);
        }
        return string;
    }

}
