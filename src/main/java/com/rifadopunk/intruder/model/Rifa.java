package com.rifadopunk.intruder.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.rifadopunk.intruder.enums.RifaStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "db_rifa")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rifa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String descricao;
    private BigDecimal valorUnitario;
    private Integer quantidadeTotal;
    private LocalDateTime dataSorteio;
    
    @Enumerated(EnumType.STRING)
    private RifaStatus status;

}
