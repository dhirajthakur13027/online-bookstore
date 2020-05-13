package in.dhiraj.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import in.dhiraj.onlinebookstore.pojos.Book;
import in.dhiraj.onlinebookstore.pojos.BookCategory;

@Configuration // for exposing ids on weburl
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Autowired
	private EntityManager entitymanager;

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//	config.exposeIdsFor(Book.class);//manual exposing ids of entity to show in jason response it win show if we dont write this
//	config.exposeIdsFor(BookCategory.class);
		config.exposeIdsFor(
				entitymanager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));//for automatic exposing ids of all entity in json response
	}

}
