package senac.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer partner_id;

    // pegar imagem padrão no do envio da foto ser nulo
    @Lob
    @Column(name = "image_campaign", nullable = true)
    private Byte[] image;

    @Column(nullable = false, unique = true, length = 100)
    private String nome;

    @Column(nullable = false, length = 30)
    private String funcao;

    @Column(nullable = false)
    private boolean Adm;


    //ver como ficaria a questão da foto
}
