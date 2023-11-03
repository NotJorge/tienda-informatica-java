package dev.clownsinformatics.tiendajava.proveedores.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record ProveedorUpdateDto(
        @Length(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
        String nombre,
        @Min(value = 0, message = "El contacto no puede ser negativo")
        String contacto,
        @Length(min = 2, max = 50, message = "La dirección debe tener mas de 2 caracteres")
        String direccion
) {
}
