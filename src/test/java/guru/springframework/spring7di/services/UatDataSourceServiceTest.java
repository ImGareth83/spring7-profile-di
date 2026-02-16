package guru.springframework.spring7di.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import guru.springframework.spring7di.services.DataSourceService;

@ActiveProfiles("uat")
@SpringBootTest
public class UatDataSourceServiceTest {

    @Autowired
    private DataSourceService dataSourceService;

    @Test
    void returnUatDataSource(){
        assertEquals("uat", dataSourceService.getDataSource());
    }

}
