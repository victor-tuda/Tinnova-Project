package tinnova.ex05.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tinnova.ex05.model.Carro;
import tinnova.ex05.model.CarroRepository;
import tinnova.ex05.service.CarroService;

import java.util.List;
import java.util.Optional;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository carroRepository;

    // Criando o método de retornar todos os carros;
    @Override
    public Iterable<Carro> buscarTodos() {
        return carroRepository.findAll();
    }

    @Override
    public Carro buscarPorId(Long id) {
        Optional<Carro> carro = carroRepository.findById(id); // Optional caso o carro não exista
        if (carro.isPresent())
            return carro.get();

        else
            return null;
    }

    @Override
    public void inserir(Carro carro) {
        carroRepository.save(carro);
    }

    @Override
    public void atualizar(Long id, Carro carro) {
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent())
            carroRepository.save(carro);
    }

    @Override
    public void atualizarParcial(Long id, boolean status){
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent()) {
            Carro carro = carroBd.get();
            carro.setVendido(status);
            carroRepository.save(carro);
        }
    }

    @Override
    public void deletar(Long id) {
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent())
            carroRepository.deleteById(id);
    }


    @Override
    public List<Carro> encontrarCarrosNaoVendidos() {
        return null;
    }

    @Override
    public List<Carro> carrosPorDecada(int decada) {
        return null;
    }

    @Override
    public List<Carro> carrosPorFabricante(String fabricante) {
        return null;
    }

    @Override
    public Iterable<Carro> carrosRegistradosUltimaSemana() {
        return null;
    }
}
