package Model.Interface;

import java.util.List;

public interface CRUD<T> {

	void create(T object);
	List<T> read(Class<T> object);
	void update(T object);
	void delete(T object);
	
}
