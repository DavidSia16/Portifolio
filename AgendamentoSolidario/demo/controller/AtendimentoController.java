package AgendamentoSolidario.demo.controller;

import AgendamentoSolidario.demo.model.Atendimento;
import AgendamentoSolidario.demo.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/atendimentos")
public class AtendimentoController {

    @Autowired
    private AtendimentoService service;

    @PostMapping
    public String criar(
            @RequestBody Atendimento atendimento)
            throws Exception {

        return service.solicitar(atendimento);
    }

}
