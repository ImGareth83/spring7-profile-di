package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaDataSourceService implements DataSourceService{
    public String getDataSource(){
        return "qa";
    }
}