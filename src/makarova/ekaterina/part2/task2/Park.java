package makarova.ekaterina.part2.task2;

import java.util.List;

public class Park {
    private List<Attractions> attractions;

    public List<Attractions> getAttraction() {
        return attractions;
    }

    public void setAttraction(List<Attractions> attraction) {
        this.attractions = attraction;
    }

    public void getInformation()
    {
        for(int i=0; i<attractions.size();i++)
        {
            Attractions attraction = attractions.get(i);
            System.out.println(attraction.getName()+ "\n"+attraction.getTimeOfWork()+"\n"+attraction.getPrice());
        }
    }
}
