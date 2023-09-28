package forum.alura.api.domain.topicos;

import java.time.LocalDateTime;

public record DadosListagemTopico(String titulo, String mensagem, LocalDateTime datacriacao,
                                  StatusTopico status, String autor, String curso) {

    public DadosListagemTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensagem(), topico.getDatacriacao(), topico.getStatus(), topico.getAutor(),
                topico.getCurso());
    }

}
