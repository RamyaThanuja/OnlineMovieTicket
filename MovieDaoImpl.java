package onlineticket;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Transactional
@Repository
@Service
public class MovieDaoImpl implements MovieDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    
    private MovieDao MovieDAO;
    @SuppressWarnings("unchecked")
    @Override
    public List < Movie > getShowMovie() {
        System.out.println("inside MoviedaoImpl class inside list movie method ");
        Session session = sessionFactory.getCurrentSession();
        //Movie movie = Session.get(Movie.class,id);
        //List <Movie> movie = Session.get(Movie.class);
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Movie > cq = cb.createQuery(Movie.class);
        Root < Movie > root = cq.from(Movie.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        List <Movie> list=query.getResultList();
        return list;
    }
}