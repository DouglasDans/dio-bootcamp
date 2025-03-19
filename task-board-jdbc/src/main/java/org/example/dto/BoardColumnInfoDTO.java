package org.example.dto;

import org.example.persistence.entity.BoardColumnKind;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKind kind) {
}
