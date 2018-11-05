package makarova.ekaterina.part2.task3;

import java.util.List;

public class Cinema {
    private List<String> adresses;
    private  List<Film> films;

    public List<String> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<String> adresses) {
        this.adresses = adresses;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void getInformation()
    {
        for(int i=0; i<films.size(); i++)
        {
            films.get(i).getInformation();
        }
    }
}
