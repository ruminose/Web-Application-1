package web;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


class Start{
    public static void main(String [] data){
//        ApplicationContext context;
//        context = SpringApplication.run(Initialize.class);
    var context = SpringApplication.run(Initialize.class);
    }
}

@SpringBootApplication
class Initialize { }

@RestController
class Sample{
    @RequestMapping("/check")
    int m () { return 123; }
}
