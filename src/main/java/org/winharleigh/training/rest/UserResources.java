package org.winharleigh.training.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.winharleigh.training.mapper.UsersMapper;
import org.winharleigh.training.model.Users;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResources {
    private final UsersMapper usersMapper;

    public UserResources(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Operation(summary = "Get all Users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved all Users"),
            @ApiResponse(responseCode = "404", description = "Users not found", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorResponse.class)))})
    @GetMapping("/all")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }

    @Operation(summary = "Get User given the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved Users"),
            @ApiResponse(responseCode = "404", description = "User not found", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = ErrorResponse.class)))})
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable final String id) {
        return usersMapper.findById(id);
    }
}
