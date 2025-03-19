package org.example.dto;

import org.example.persistence.entity.BoardColumnKind;

public record BoardColumnDTO(Long id,
                             String name,
                             BoardColumnKind kind,
                             int cardsAmount) {
}
