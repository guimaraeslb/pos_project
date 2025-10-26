package com.pos.project.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.project.dtos.PratoDto;
import com.pos.project.model.Prato;
import com.pos.project.repository.PratoRepository;

@Service
public class PratoServices {

    @Autowired
    private PratoRepository pratoRepository;
    
    public String savePrato(PratoDto pratoDto){
        try {
            Prato prato = new Prato();
            BeanUtils.copyProperties(pratoDto, prato);
            pratoRepository.save(prato);
            return "Novo prato cadastrado com sucesso!";
        } catch (Exception e) {
            return "Erro ao cadastrar novo prato!";
        }
    }

    public Iterable<Prato> getPratos(){
        return pratoRepository.findAll();
    }
}
