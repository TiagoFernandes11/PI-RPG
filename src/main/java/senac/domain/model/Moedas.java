package senac.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moedas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codmoeda")
    private Long codMoeda;

    @Column(name = "po", length = 45, columnDefinition = "VARCHAR(45) COMMENT 'peças de ouro'")
    private String po;

    @Column(name = "pp", length = 45, columnDefinition = "VARCHAR(45) COMMENT 'peças de prata'")
    private String pp;

    @Column(name = "pc", length = 45, columnDefinition = "VARCHAR(45) COMMENT 'peças de cobre'")
    private String pc;

    @Column(name = "pl", columnDefinition = "INT COMMENT 'peças de platina'")
    private Integer pl;

    @Column(name = "da", length = 45, columnDefinition = "VARCHAR(45) COMMENT 'diamante astral'")
    private String da;

    @ManyToOne
    @JoinColumn(name = "personagem_codpersonagem")
    private Personagem personagem;

}
