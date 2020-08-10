import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class usersUI {

    private String coordinate = "Russian Federation";

    public String sendCoordinate(){
        return coordinate;
    }
    public void openSettings(){
        System.out.println("Settings lost");
    }

    public String toJson() throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this.sendCoordinate());
    }
}
