package gtm.formation.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gtm.formation.blog.domaine.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
