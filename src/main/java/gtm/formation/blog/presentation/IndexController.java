package gtm.formation.blog.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gtm.formation.blog.domaine.Article;
import gtm.formation.blog.repository.ArticleRepository;

@Controller
public class IndexController {

	// Injection dependances via des proprietes
	@Autowired
	private Article article;
	
	@Autowired
	private ArticleRepository articleRepository;

	/**
	 * Methode qui traite l'url '/welcome' (appelée dans la vue 'index.jsp') et affiche la vue 'welcome' 
	 * @return ModelAndView
	 */
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	ModelAndView displayIndex() {
		ModelAndView mav = new ModelAndView("welcome");

		// modele
		final List<Article> articles = new ArrayList<Article>();
		
		// rajout article inject� � la liste
		articles.add(this.article);
		
		// Equivalent DAO getAll()
		articles.addAll(this.articleRepository.findAll());
		
		// rajout liste � la vue
		mav.getModel().put("articles",  articles);
		
		return mav;
	}
	
	/**
	 * Methode qui traite l'url '/formulaire' (appelée dans la vue 'welcome.jsp')  et affiche la vue 'formulaire'
	 * @return ModelAndView
	 */

	@RequestMapping(path = "/formulaire")
	ModelAndView displayForm() {
		ModelAndView mav = new ModelAndView("formulaire");	
		return mav;
	}
	
	
	/**
	 * Methode qui traite la requête avec l'url '/formulaire' (appelée dans la vue 'formulaire.jsp') de type POST
	 * et sauvegarde l'article rentré dans le formulaire en BDD
	 * puis affiche la liste d'articles (vue 'welcome')
	 * Les paramètres d'entrée correspondent aux balises <input> dans le formulaire
	 * @return ModelAndView
	 */
	@RequestMapping(path = "/formulaire", method = RequestMethod.POST)
	ModelAndView validateForm(@RequestParam String title, @RequestParam String description) {
	
		// Sauvegarder l'article en BDD
		final Article newArticle = new Article (title, description);
		
		// Equivalent DAO create()
		this.articleRepository.save(newArticle);
		
		// Renvoyer vers la page welcome
		return this.displayIndex();
	}
	

}
