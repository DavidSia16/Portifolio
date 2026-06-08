package AgendamentoSolidario.demo.semaphore;

import org.springframework.stereotype.Component;

import java.util.concurrent.Semaphore;

@Component
public class ControleVagas {

    private final Semaphore semaphore =
            new Semaphore(5);

    public boolean tentarEntrar() {
        return semaphore.tryAcquire();
    }

    public void sair() {
        semaphore.release();
    }

    public int vagasDisponiveis() {
        return semaphore.availablePermits();
    }
}
