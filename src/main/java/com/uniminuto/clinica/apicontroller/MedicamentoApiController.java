package com.uniminuto.clinica.apicontroller;

import com.uniminuto.clinica.api.MedicamentoApi;
import com.uniminuto.clinica.entity.Medicamento;
import com.uniminuto.clinica.service.MedicamentoService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class MedicamentoApiController implements MedicamentoApi {

    private final MedicamentoService medicamentoService;

    private MedicamentoApiController(MedicamentoService medicamentoService){
        this.medicamentoService = medicamentoService;
    }

    @Override
    public ResponseEntity<List<Medicamento>> listarMedicamentos(){
        List<Medicamento> medicamentos = medicamentoService.ListarMedicamentos();
        return ResponseEntity.ok(medicamentos);
    }
}
