package br.com.meusistema.api.dtos;

public record ClienteResponseDTO(
        String nome,
        String cpf,
        String email,
        EnderecoDTO endereco
) {
}
