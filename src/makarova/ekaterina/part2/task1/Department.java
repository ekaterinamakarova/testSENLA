package makarova.ekaterina.part2.task1;

import java.util.List;

public class Department {
    private List<Position> positions ;

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public List<Employee> getEmployees(Position position)
    {
        return position.getEmployees();
    }
}
