import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ColorController {

	@RequestMapping("/")
    @ResponseBody
	JsonColorResponse home() {
		return new JsonColorResponse("pink");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ColorController.class, args);
	}

}
