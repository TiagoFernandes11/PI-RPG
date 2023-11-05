package senac.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personagem")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codpersonagem")
    private Long codPersonagem;

    @Column(name = "nome")
    private String nome;

    @Lob
    @Column(name = "foto")
    private byte[] foto;

    @Column(name = "classe")
    private String classe;

    @Column(name = "raca")
    private String raca;

    @Column(name = "antecedente")
    private String antecedente;

    @Column(name = "nivel")
    private Integer nivel;

    @Column(name = "xp")
    private Integer xp;

    @Column(name = "bonusproficiencia")
    private Integer bonusProficiencia;

    @Column(name = "inspiracao")
    private String inspiracao;

    @Column(name = "sabedoria_passiva")
    private String sabedoriaPassiva;

    @Column(name = "ca")
    private Integer ca;

    @Column(name = "iniciativa")
    private Integer iniciativa;

    @Column(name = "deslocamento")
    private Float deslocamento;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "hptemp")
    private Integer hpTemp;

    @Column(name = "tracospersonalidade", length = 200)
    private String tracosPersonalidade;

    @Column(name = "ideais", length = 200)
    private String ideais;

    @Column(name = "vinculos", length = 200)
    private String vinculos;

    @Column(name = "fraquezas", length = 200)
    private String fraquezas;

    @Column(name = "corolhos")
    private String corOlhos;

    @Column(name = "altura")
    private Float altura;

    @Column(name = "peso")
    private Float peso;

    @Column(name = "pele")
    private String pele;

    @Column(name = "cabelos")
    private String cabelos;

    @Column(name = "aparencia", length = 200)
    private String aparencia;

    @Column(name = "aliadosorg", length = 2000)
    private String aliadosOrg;

    @Column(name = "outrascarac", length = 1000)
    private String outrasCaracteristicas;

    @Column(name = "historia", length = 45)
    private String historia;

    @Column(name = "tesouro", length = 45)
    private String tesouro;

    private Moedas moedas;

    @ManyToOne
    @JoinColumn(name = "atributos_codatributo")
    private Atributos atributos;

    @ManyToOne
    @JoinColumn(name = "participante_codparticipante")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "pericias_codpericia")
    private Pericias pericias;
}
