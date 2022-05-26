package io.owl.zone;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class SettingTest {

    @Autowired
    MapperTest mapperTest;

    @Test
    public void test(){
        System.out.println("mapper test =>" + mapperTest.test());
    }

    @Test
    @DisplayName("매퍼 테스트")
    public void test2(){
        log.info("test => {}",mapperTest.test2());
    }

}
