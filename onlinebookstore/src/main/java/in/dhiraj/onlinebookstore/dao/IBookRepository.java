package in.dhiraj.onlinebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dhiraj.onlinebookstore.pojos.Book;

//<Entity/pojo name=Book,primary key type=Long>
public interface IBookRepository extends JpaRepository<Book,Long>{

}
