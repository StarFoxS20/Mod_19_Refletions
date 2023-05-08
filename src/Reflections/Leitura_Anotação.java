package Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class Leitura_Anotação {

    private static void main(String[] args) {
        Class<impl_tabela>minhaTabelaClass= impl_tabela.class;
        Tabela tabelaAnnotation = impl_tabela.getAnnotation(Tabela.class);
        String nometabela = tabelaAnnotation.value();
        System.out.println("Nome da Tabela: " + nometabela);

    }
}
