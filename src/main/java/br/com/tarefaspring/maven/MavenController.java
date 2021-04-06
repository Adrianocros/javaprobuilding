package br.com.tarefaspring.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MavenController {
    
    @GetMapping
    String home(){
           return "Hello Wold !";
       }
  
}
