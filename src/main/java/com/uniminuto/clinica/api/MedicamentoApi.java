package com.uniminuto.clinica.api;

import com.uniminuto.clinica.entity.Medicamento;
import com.uniminuto.clinica.model.MedicmentoRq;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/medicamentos")

public interface MedicamentoApi {

    @GetMapping


}
