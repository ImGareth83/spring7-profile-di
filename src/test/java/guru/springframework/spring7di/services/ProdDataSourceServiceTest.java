package guru.springframework.spring7di.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("prod")
@SpringBootTest
public class ProdDataSourceServiceTest {

    @Autowired
    private DataSourceService dataSourceService;

    @Test
    void returnProdDataSource(){
        assertEquals("prod", dataSourceService.getDataSource());
    }

}
