package tinnova.ex05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tinnova.ex05.model.Carro;
import tinnova.ex05.service.CarroService;

@RestController
@RequestMapping("carros")
public class CarroRestController {

    @Autowired
    private CarroService carroService;

    // Retorna todos os carros com um GET vazio
    @GetMapping
    public ResponseEntity<Iterable<Carro>> buscarTodos(){
        return ResponseEntity.ok(carroService.buscarTodos());
    }

    // Retorna o carro com determinado id
    @GetMapping("/{id}")
    public ResponseEntity<Carro> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(carroService.buscarPorId(id));
    }

    // Cadastrar um carro
    @PostMapping
    public ResponseEntity<Carro> inserir(@RequestBody Carro carro){
        carroService.inserir(carro);
        return ResponseEntity.ok(carro);
    }

    // Atualiza os dados de um veículo
    @PutMapping("/{id}")
    public ResponseEntity<Carro> atualizar(@PathVariable Long id, @RequestBody Carro carro){
        carroService.atualizar(id, carro);
        return ResponseEntity.ok(carro);
    }

    // Atualiza Parcial, apenas o status do carro
    @PatchMapping("/{id}")
    public ResponseEntity<Carro> atualizarParcial(@PathVariable Long id, @PathVariable boolean status){
        carroService.atualizarParcial(id, status);
        return ResponseEntity.ok(carroService.buscarPorId(id));
    }

    // Deletando um carro
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        carroService.deletar(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/naovendidos")
    public ResponseEntity<Iterable<Carro>> encontrarCarrosNaoVendidos(){
        return ResponseEntity.ok(carroService.encontrarCarrosNaoVendidos());
    }

}
