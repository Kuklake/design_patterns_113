package pl.sda.java.designPatterns.behavioral.mediator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Spouse {

    private String name;
    private Role role;

    public String sendMsg(String msg){
        return Mediator.accommodate(msg);
    }
}
