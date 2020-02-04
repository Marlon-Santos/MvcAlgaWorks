package br.com.gft.mvc.model;

public enum StatusEnum {
    PENDENTE("Pendente"),
    RECEBIDO("Recebido");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
