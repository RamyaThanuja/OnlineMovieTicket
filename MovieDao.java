package onlineticket;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Service
public interface MovieDao {
    public List <Movie> getShowMovie();
}