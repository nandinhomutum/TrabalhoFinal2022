
package br.com.ufes.dao;

import java.util.List;

public interface IDAO<T> {       

    public void update(T object);

    public void delete(T object);

    public List<T> getAll();
}
