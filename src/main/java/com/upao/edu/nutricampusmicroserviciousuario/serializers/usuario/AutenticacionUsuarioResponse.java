package com.upao.edu.nutricampusmicroserviciousuario.serializers.usuario;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutenticacionUsuarioResponse {
    String token;
}
