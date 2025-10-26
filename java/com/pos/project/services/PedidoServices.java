package com.pos.project.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.project.dtos.PedidoDto;
import com.pos.project.dtos.PratosPedidos;
import com.pos.project.model.Pedido;
import com.pos.project.model.Prato;
import com.pos.project.repository.PedidoRepository;
import com.pos.project.repository.PratoRepository;

@Service
public class PedidoServices {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private PratoRepository pratoRepository;

    public String newPedido(PedidoDto pedidoDto){

        try {
            Pedido pedido = new Pedido();
            Prato prato = new Prato();
            BeanUtils.copyProperties(pedidoDto, pedido);
            List<PratosPedidos> pratos_pedidos = new ArrayList<>();
            PratosPedidos pratosPedidos = new PratosPedidos();
            long preco_total = 0;

            for(int i = 0; i < pedidoDto.getPratos().size(); i++){
                prato = pratoRepository.findByNome(pedidoDto.getPratos().get(i));
                pratosPedidos.setPrato_id(prato.getId());
                pratosPedidos.setNome(prato.getNome());
                pratosPedidos.setPreco(prato.getPreco());
                preco_total = preco_total + prato.getPreco();
                pratos_pedidos.add(pratosPedidos);
            }
            pedido.setPratos_pedidos(pratos_pedidos);
            pedido.setValor_total(preco_total);
            pedidoRepository.save(pedido);
            
            return "Pedido cadastrado com sucesso!";
        } catch (Exception e) {
            // TODO: handle exception  
            System.out.println(e);
            return "Erro ao cadastrar pedido!";
        }
    } 

    public Iterable<Pedido> getPedidos(){
        return pedidoRepository.findAll();
    }
}
