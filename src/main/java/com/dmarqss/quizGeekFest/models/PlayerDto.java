package com.dmarqss.quizGeekFest.models;

import jakarta.validation.constraints.NotNull;

public record PlayerDto(
        @NotNull
        String name,

        @NotNull
        int score
) {
}
