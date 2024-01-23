package com.example.ciclo1.controllers;

import com.example.ciclo1.models.dto.PagosPersistenciaDTO;
import com.example.ciclo1.models.entity.Pagos;
import com.example.ciclo1.models.services.IPagosService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pagos")
public class PagosRestControllers {
    Map<String, Object> response = new HashMap<>();

    @Autowired
    private IPagosService pagosService;

    @GetMapping("")
    public ResponseEntity<?>todosPagos(){
        return new ResponseEntity<>(pagosService.mostrarPagos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>pagosPorId(@PathVariable Long id){
        return new ResponseEntity<>(pagosService.mostrarPagosPorID(id), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?>nuevoPago(@RequestBody PagosPersistenciaDTO pagos){
        try {
            Pagos newPago = pagosService.guardarNuevoPago(pagos);
            response.put("mensaje", "Se registro el nuevo pago");
            response.put("pagos", newPago);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch (DataAccessException e){
            throw new IllegalArgumentException("Error al realizar el registro del nuevo pago", e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>eliminarPago(@PathVariable Long id){
        try {
            pagosService.eliminarPago(id);
            response.put("mensaje", "Se elimino el pago");
            response.put("pagos", id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (DataAccessException e){
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/facturas")
    public ResponseEntity<?>validarEstadoFacturas(@RequestParam(required = false) boolean estado, @RequestParam(required = false) String diagnostico){
        try {
            return new ResponseEntity<>(pagosService.mostrarPagosQueRealziados(estado, diagnostico), HttpStatus.OK);
        }catch (DataAccessException e){
            throw new RuntimeException(e);
        }
    }


}
