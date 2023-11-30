package dev.clownsinformatics.tiendajava.rest.users.dto;

import dev.clownsinformatics.tiendajava.rest.users.models.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    @Schema(description = "User's id", example = "1")
    private Long id;
    @Schema(description = "User's name", example = "David")
    private String name;
    @Schema(description = "User's last name", example = "Jaraba")
    private String lastName;
    @Schema(description = "User's username", example = "davidjaraba")
    private String username;
    @Schema(description = "User´s email", example = "david@gmail.com")
    private String email;
    @Builder.Default
    @Schema(description = "User's roles", example = "[\"USER\"]")
    private Set<Role> roles = Set.of(Role.USER);
    @Builder.Default
    @Schema(description = "User's isDeleted", example = "false")
    private Boolean isDeleted = false;
}
