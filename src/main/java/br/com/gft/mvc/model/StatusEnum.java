package br.com.gft.mvc.model;

public enum StatusEnum {
    PENDENTE("pendente"),
    RECEBIDO("recebido"),

    StatusEnum(String pendente , String recebido) {
        PENDENTE = pendente;
        RECEBIDO = recebido;
    }
}
