package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDataSourceService implements DataSourceService{
    public String getDataSource(){
        return "prod";
    }
}