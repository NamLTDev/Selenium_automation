package Model;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ModelConfig {

    @Value

    public static List<PersonModel> getPersonModel (String fileLocation){
        return Poiji.fromExcel(new File(fileLocation), PersonModel.class);
    }
}
