package senac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import senac.domain.model.Participante;
import senac.domain.model.Pericia;
import senac.domain.repository.ParticipanteRepository;
import senac.domain.repository.PericiaRepository;

import java.util.List;


@RestController
@CrossOrigin("*")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private PericiaRepository periciaRepository;
    @Autowired
    private ParticipanteRepository participanteRepository;


    @Bean
    @GetMapping("/participante")
    public List<Participante> getParticipante(){
        return participanteRepository.findAll();
    }

    @Bean
    @GetMapping("/pericia")
    public List<Pericia> getPericia(){
        return periciaRepository.findAll();
    }

    @Bean
    @GetMapping("/cadastro")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("template/cadastro.html");
        return modelAndView;
    }

}