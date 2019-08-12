package consul.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @Date 2019-08-07 07:46
 */
@RestController
public class DcController {
    @GetMapping("/dc")
    public String dc(){
        return "jerry";
    }
}
