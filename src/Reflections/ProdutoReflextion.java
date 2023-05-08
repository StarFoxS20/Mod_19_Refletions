package Reflections;

import java.io.Serializable;

public class ProdutoReflextion implements Serializable {

    @ChavePrincipal("getCodigo")
    private Long codigo;
    private  String name;
    private Double valor;
    public ProdutoReflextion(){}
}

