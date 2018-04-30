package gtm.formation.blog.presentation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gtm.formation.blog.domaine.Article;

@Controller
public class IndexController {

	// Injection dependances via des propriet�s
	@Autowired
	private Article article;

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	ModelAndView displayIndex() {
		ModelAndView mav = new ModelAndView("welcome");

		// modele
		final List<Article> articles = new ArrayList<Article>();
		
		// rajout article inject� � la liste
		articles.add(this.article);
		
		// rajout liste � la vue
		mav.getModel().put("articles",  articles);
		
		return mav;
	}

}
