package be.g00glen00b.springbootgraphql;

import java.util.List;

import be.g00glen00b.springbootgraphql.alumne.Alumne;
import be.g00glen00b.springbootgraphql.alumne.AlumneRepository;
import be.g00glen00b.springbootgraphql.article.Article;
import be.g00glen00b.springbootgraphql.article.ArticleRepository;
import be.g00glen00b.springbootgraphql.comment.Comment;
import be.g00glen00b.springbootgraphql.comment.CommentRepository;
import be.g00glen00b.springbootgraphql.partida.Partida;
import be.g00glen00b.springbootgraphql.partida.PartidaRepository;
import be.g00glen00b.springbootgraphql.profile.Profile;
import be.g00glen00b.springbootgraphql.profile.ProfileRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class QueryResolver implements GraphQLQueryResolver {
    private ArticleRepository articleRepository;
    private CommentRepository commentRepository;
    private ProfileRepository profileRepository;
    private AlumneRepository alumneRepository;
    private PartidaRepository partidaRepository;

    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    public List<Comment> getComments() {
        return commentRepository.findAll();
    }

    public List<Profile> getProfiles() {
        return profileRepository.findAll();
    }

    public Article getArticle(Long id) {
        return articleRepository.findOne(id);
    }

    /*Les meves querys*/
    public List<Alumne> getLlistaAlumnes() {
        return alumneRepository.findAll();
    }

    public Alumne getAlumne(Long id) {
        return alumneRepository.findOne(id);
    }

    public List<Partida> getLlistaPartides() {
        return partidaRepository.findAll();
    }

    public Partida getPartida(Long id) {
        return partidaRepository.findOne(id);
    }
}
