package br.com.meusistema.api.mapper;

import br.com.meusistema.api.dtos.EnderecoDTO;
import br.com.meusistema.api.dtos.FornecedorResponseDTO;
import br.com.meusistema.api.dtos.ProdutoRequestDTO;
import br.com.meusistema.api.dtos.ProdutoResponseDTO;
import br.com.meusistema.api.enums.TipoFornecedorEnum;
import br.com.meusistema.api.model.Endereco;
import br.com.meusistema.api.model.Fornecedor;
import br.com.meusistema.api.model.Produto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-12T22:21:44-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.16 (Amazon.com Inc.)"
)
@Component
public class ProdutoMapperImpl implements ProdutoMapper {

    @Override
    public Produto toEntity(ProdutoRequestDTO produtoRequestDTO) {
        if ( produtoRequestDTO == null ) {
            return null;
        }

        Produto produto = new Produto();

        produto.setNome( produtoRequestDTO.nome() );
        produto.setPreco( produtoRequestDTO.preco() );
        produto.setDescricao( produtoRequestDTO.descricao() );
        produto.setQuantidadeEstoque( produtoRequestDTO.quantidadeEstoque() );

        return produto;
    }

    @Override
    public ProdutoResponseDTO toDTO(Produto produto) {
        if ( produto == null ) {
            return null;
        }

        Long id = null;
        String nome = null;
        BigDecimal preco = null;
        String descricao = null;
        Integer quantidadeEstoque = null;
        FornecedorResponseDTO fornecedor = null;

        id = produto.getId();
        nome = produto.getNome();
        preco = produto.getPreco();
        descricao = produto.getDescricao();
        quantidadeEstoque = produto.getQuantidadeEstoque();
        fornecedor = fornecedorToFornecedorResponseDTO( produto.getFornecedor() );

        ProdutoResponseDTO produtoResponseDTO = new ProdutoResponseDTO( id, nome, preco, descricao, quantidadeEstoque, fornecedor );

        return produtoResponseDTO;
    }

    protected EnderecoDTO enderecoToEnderecoDTO(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        String logradouro = null;
        String numero = null;
        String complemento = null;
        String bairro = null;
        String cidade = null;
        String estado = null;
        String pais = null;
        String cep = null;

        logradouro = endereco.getLogradouro();
        numero = endereco.getNumero();
        complemento = endereco.getComplemento();
        bairro = endereco.getBairro();
        cidade = endereco.getCidade();
        estado = endereco.getEstado();
        pais = endereco.getPais();
        cep = endereco.getCep();

        EnderecoDTO enderecoDTO = new EnderecoDTO( logradouro, numero, complemento, bairro, cidade, estado, pais, cep );

        return enderecoDTO;
    }

    protected FornecedorResponseDTO fornecedorToFornecedorResponseDTO(Fornecedor fornecedor) {
        if ( fornecedor == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        String cnpj = null;
        EnderecoDTO endereco = null;

        id = fornecedor.getId();
        email = fornecedor.getEmail();
        cnpj = fornecedor.getCnpj();
        endereco = enderecoToEnderecoDTO( fornecedor.getEndereco() );

        String nome = null;
        TipoFornecedorEnum tipoFornecedorEnum = null;

        FornecedorResponseDTO fornecedorResponseDTO = new FornecedorResponseDTO( id, nome, email, cnpj, tipoFornecedorEnum, endereco );

        return fornecedorResponseDTO;
    }
}
