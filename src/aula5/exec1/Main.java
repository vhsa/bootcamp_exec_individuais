package aula5.exec1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Victor", "01");
        Pessoa p2 = new Pessoa("Ana", "02");

        Celular c1 = new Celular(619825, "Claro");
        Celular c2 = new Celular(619933, "Vivo");
        Celular c3 = new Celular(1111, "Tim");

        Pessoa[] arrPessoas = {p1, p2};
        Celular[] arrCelulares = {c1, c2, c3};

        System.out.println(SortUtil.sort(arrPessoas));
        System.out.println(SortUtil.sort(arrCelulares));

    }
}
