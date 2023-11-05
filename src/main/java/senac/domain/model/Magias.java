package senac.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Magias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "codmagia")
    private Integer codMagia;

    @ManyToOne
    @JoinColumn(name = "personagem_codpersonagem", referencedColumnName = "codpersonagem",
            foreignKey = @ForeignKey(name = "fk_magias_personagem1"))
    private Personagem personagem;

    @Column(name = "material", length = 200)
    private String material;

    @Column(name = "tempoconjuracao", length = 30)
    private String tempoConjuracao;

    @Column(name = "alcance", length = 20)
    private String alcance;

    @Column(name = "componente", length = 300)
    private String componente;

    @Column(name = "duracao", length = 30)
    private String duracao;

    @Column(name = "descricao", length = 3000)
    private String descricao;

    @Column(name = "nvlmagia")
    private Integer nivelMagia;

    @Column(name = "tipomagia", length = 15)
    private String tipoMagia;

}
