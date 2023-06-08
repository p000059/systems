package DAL.Interface;

import java.util.List;

public interface CRUD<T> {

	void create(T sourceObject);
	T read(int id);
	List<T> readAll();
	void update(T sourceObject);
	void delete(int id);
}
