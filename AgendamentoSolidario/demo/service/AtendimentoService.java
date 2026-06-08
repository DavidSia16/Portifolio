package AgendamentoSolidario.demo.service;

import AgendamentoSolidario.demo.model.Atendimento;
import AgendamentoSolidario.demo.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository repository;

    public void salvar(Atendimento atendimento) {
        repository.save(atendimento);
    }

    public String solicitar(Atendimento atendimento) {
        return "Atendimento realizado";
    }
}
