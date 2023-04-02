package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    
    @NotNull
    Long id,
    String telefone,
    DadosEndereco endereco,
    String nome
    ) {

}
