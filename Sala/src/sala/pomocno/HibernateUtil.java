package sala.pomocno;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session = null;

    protected HibernateUtil() {
        // Mora postojati da bi onemogućilo konstruiranje
    }

    public static Session getSession() {
        if (session == null) {
            try {
                session = new Configuration().configure().buildSessionFactory().openSession();
            } catch (Throwable ex) {
                System.err.println("Kreiranje Initial SessionFactory neuspjelo: " + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
        return session;
    }

}
