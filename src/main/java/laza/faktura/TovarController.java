package laza.faktura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TovarController {

    @GetMapping(path = "")
    public String getTovar() {
        return "tovar";
    }
}
