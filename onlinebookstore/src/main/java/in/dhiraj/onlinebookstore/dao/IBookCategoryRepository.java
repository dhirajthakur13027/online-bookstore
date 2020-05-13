package in.dhiraj.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.dhiraj.onlinebookstore.pojos.BookCategory;

/*we dont need to create controllerand we dont have to add @getmapping,@push or @put mapping.spring data rest will take care of everything.
it will create rest end points baseed on entity name*/

@RepositoryRestResource(collectionResourceRel = "bookcategory",path="book-category")//for naming url and its path
public interface IBookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
