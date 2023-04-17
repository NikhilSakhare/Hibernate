package many2many;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Mapping 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Sport sp1 = new Sport();
        sp1.setSportId(1);
        sp1.setSportName("Cricket");
        
        Sport sp2 = new Sport();
        sp2.setSportId(2);
        sp2.setSportName("Football");
        
        Sport sp3 = new Sport();
        sp3.setSportId(3);
        sp3.setSportName("Hockey");
        
        Player pl1 = new Player();
        pl1.setId(101);
        pl1.setPlayerName("Dhoni");
        pl1.setJersy(11);
        
        Player pl2 = new Player();
        pl2.setId(102);
        pl2.setPlayerName("Kohli");
        pl2.setJersy(33);
        
        Player pl3 = new Player();
        pl3.setId(103);
        pl3.setPlayerName("Rohit");
        pl3.setJersy(65);
        
        List<Sport> sportList = new ArrayList();
        sportList.add(sp1);
        sportList.add(sp2);
        sportList.add(sp3);
        
        List<Player> playerList = new ArrayList<Player>(Arrays.asList(pl1,pl2,pl3));
//        playerList.add(pl1);
//        playerList.add(pl2);
//        playerList.add(pl3);
        
        sp1.setPlayer(playerList);
        sp2.setPlayer(playerList);
        sp3.setPlayer(playerList);
        
        pl1.setSport(sportList);
        pl2.setSport(sportList);
        pl3.setSport(sportList);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(sp1);
        session.save(sp2);
        session.save(sp3);
        
        session.save(pl1);
        session.save(pl2);
        session.save(pl3);
        
        tx.commit();
        session.close();
        
    }
}

