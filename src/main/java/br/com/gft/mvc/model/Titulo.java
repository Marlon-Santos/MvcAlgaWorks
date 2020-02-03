package br.com.gft.mvc.model;

import javax.persistence.*;
import java.util.Date;

public class Titulo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date date;
    private Double value;
    private StatusEnum status;
}
