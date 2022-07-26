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

    // método para retornar todos os carros;
    @Override
    public Iterable<Carro> buscarTodos() {
        return carroRepository.findAll();
    }

    // método para buscar um carro por id
    @Override
    public Carro buscarPorId(Long id) {
        Optional<Carro> carro = carroRepository.findById(id); // Optional caso o carro não exista
        if (carro.isPresent())
            return carro.get();

        else
            return null;
    }

    // método para cadastrar um carro
    @Override
    public void inserir(Carro carro) {
        carroRepository.save(carro);
    }

    // método para atualizar um carro
    @Override
    public void atualizar(Long id, Carro carro) {
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent())
            carroRepository.save(carro);
    }

    // não consegui fazer esse método funcionar
    @Override
    public void atualizarParcial(Long id, boolean status){
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent()) {
            Carro carro = carroBd.get();
            carro.setVendido(status);
            carroRepository.save(carro);
        }
    }

    // método para deletar um carro
    @Override
    public void deletar(Long id) {
        Optional<Carro> carroBd = carroRepository.findById(id);
        if (carroBd.isPresent())
            carroRepository.deleteById(id);
    }


    // métodos necessários que eu não soube implementar
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
