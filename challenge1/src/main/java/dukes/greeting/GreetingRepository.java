package dukes.greeting;

import jakarta.enterprise.context.Dependent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;

import java.util.List;

@Dependent
public class GreetingRepository {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public List<Greeting> getAllGreetings() {

        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Greeting.class));
        return em.createQuery(cq).getResultList();
    }


}
