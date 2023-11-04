package senac.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pericias")
public class Pericia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "native", strategy = "native")
    private Integer codpericia;
    private String atletismo;
    private String acrobacia;
    private String furtividade;
    private String prestidigitacao;
    private String arcanismo;
    private String historia;
    private String investigacao;
    private String natureza;
    private String religiao;
    private String intuicao;
    private String lidarcomanimais;
    private String medicina;
    private String percepcao;
    private String sobrevivencia;
    private String atuacao;
    private String enganacao;
    private String intimidacao;
    private String persuasao;
}