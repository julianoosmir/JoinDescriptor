import br.com.azi.hal.core.querydsl.descriptor.JoinDescriptor;
import com.querydsl.core.types.Predicate;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface JoinCapableRepository<T, I extends Serializable> extends JpaRepository<T, I>, QueryDslPredicateExecutor<T> {
    Page<T> findAll(Predicate var1, Pageable var2, JoinDescriptor... var3);

    List<T> findAll(Predicate var1);
}
