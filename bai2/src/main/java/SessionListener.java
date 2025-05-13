
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.logging.Logger;

@WebListener
public class SessionListener implements HttpSessionListener {
    private static final Logger logger = Logger.getLogger(SessionListener.class.getName());

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("Session created: " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("Session destroyed: " + se.getSession().getId());
    }
}
