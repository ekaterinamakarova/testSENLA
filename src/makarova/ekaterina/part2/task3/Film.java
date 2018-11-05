package makarova.ekaterina.part2.task3;

import java.util.List;

public class Film {
    private String name;
    private List<Session> sessions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Session> getSession() {
        return sessions;
    }

    public void setSession(List<Session> session) {
        this.sessions = session;
    }

    public void getInformation()
    {
        for(int i=0; i<sessions.size(); i++)
        {
            Session session = sessions.get(i);
            System.out.println(this.getName()+ ":\n" +session.getTimeOfBegining() + "-" + session.getTimeOfEnding());
        }

    }
}
