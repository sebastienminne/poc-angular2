package repo;

/**
 * Created by sminne on 12/09/2016.
 */
import bo.TestTable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepo extends CrudRepository<TestTable, Long> {

  List<TestTable> findByLastName(String lastName);
}
