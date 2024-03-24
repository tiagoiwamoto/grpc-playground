package br.com.kamehouse.sec01;

import br.com.kamehouse.models.sec01.PersonOuterClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {

        var person = PersonOuterClass.Person.newBuilder()
                .setName("sam")
                .setAge(12)
                .build();

        log.info("{}", person);

    }
}
