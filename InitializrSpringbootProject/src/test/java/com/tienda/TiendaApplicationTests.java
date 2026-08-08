package com.tienda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "firebase.json.path=firebase", 
    "firebase.json.file=techshop-8c8f7-firebase-adminsdk-fbsvc-5cfbf2fb14.json"
})
class TiendaApplicationTests {

    @Test
    void contextLoads() {
    }
}