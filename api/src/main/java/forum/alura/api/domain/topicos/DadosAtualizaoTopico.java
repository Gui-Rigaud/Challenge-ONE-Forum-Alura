package forum.alura.api.domain.topicos;

public record DadosAtualizaoTopico(
        String titulo,
        String mensagem,
        String autor,
        String curso
) {
}
