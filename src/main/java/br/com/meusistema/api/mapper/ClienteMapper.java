package br.com.meusistema.api.mapper;

import br.com.meusistema.api.dtos.ClienteRequestDTO;
import br.com.meusistema.api.dtos.ClienteResponseDTO;
import br.com.meusistema.api.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente toEntity(ClienteRequestDTO clienteRequestDTO);

    ClienteResponseDTO toDTO(Cliente cliente);

}
