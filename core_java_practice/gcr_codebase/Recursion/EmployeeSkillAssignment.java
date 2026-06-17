import java.util.ArrayList;

public class EmployeeSkillAssignment {

    public static void findTeams(
            int[] skills,
            int index,
            int target,
            ArrayList<Integer> team) {

        if (target == 0) {
            System.out.println(team);
            return;
        }

        if (index == skills.length || target < 0) {
            return;
        }

        // Include current employee
        team.add(skills[index]);

        findTeams(
                skills,
                index + 1,
                target - skills[index],
                team);

        team.remove(team.size() - 1);

        // Exclude current employee
        findTeams(
                skills,
                index + 1,
                target,
                team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(
                skills,
                0,
                target,
                new ArrayList<>());
    }
}