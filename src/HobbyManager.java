import java.util.List;

public class HobbyManager {

    public List<String> hobbies;

    int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }
}
