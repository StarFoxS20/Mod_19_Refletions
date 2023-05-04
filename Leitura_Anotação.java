package Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Leitura_Anotação {

    private static void executeLeituraAnotacao(){
        System.out.println("|*****|Annotations|*****|");
        ProdutoReflextion prod = new ProdutoReflextion();
        Annotation[] annotations = prod.getClass().getAnnotations();
        for (Annotation an : annotations){
            System.out.println("Annotation type: " + an.annotationType());
        }

        for (Field field : prod.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(ChavePrincipal.class)){
                ChavePrincipal ano = field.getAnnotation(ChavePrincipal.class);
                System.out.println("Nome Da Anotação: " + ano.toString());
                System.out.println("Valor Da Anotação: " + ano.value());
            }
        }
    }
}
