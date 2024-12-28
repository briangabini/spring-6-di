package guru.springframework.spring6di.i18n;

import guru.springframework.spring6di.controllers.i18n.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
public class myi18NControllerTestsEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}
