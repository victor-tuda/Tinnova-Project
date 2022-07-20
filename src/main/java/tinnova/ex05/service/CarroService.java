package tinnova.ex05.service;

import org.springframework.data.jpa.repository.Query;
import tinnova.ex05.model.Carro;

import java.util.List;

public interface CarroService {
    Iterable<Carro> buscarTodos();
    Carro buscarPorId(Long id);

    void inserir(Carro carro);

    void atualizar(Long id, Carro carro);

    void atualizarParcial(Long id, boolean status);

    void deletar(Long id);

    //@Query("SELECT * FROM Carros") // Tentei utilizar uma tag de query como possível solução, mas não consegui implementar
    List<Carro> encontrarCarrosNaoVendidos();

    List<Carro> carrosPorDecada(int decada);

    List<Carro> carrosPorFabricante(String fabricante);

    Iterable<Carro> carrosRegistradosUltimaSemana();
}
