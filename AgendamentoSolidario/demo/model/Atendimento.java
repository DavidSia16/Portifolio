package AgendamentoSolidario.demo.model;

import jakarta.persistence.*;

@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    // getters e setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
}
