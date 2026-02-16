package guru.springframework.spring7di.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import guru.springframework.spring7di.services.DataSourceService;

@ActiveProfiles("dev")
@SpringBootTest
public class DevDataSourceServiceTest {

    @Autowired
    DataSourceService dataSourceService;

    @Test
    void returnDevDataSource(){
        assertEquals("dev", dataSourceService.getDataSource());
    }
}
