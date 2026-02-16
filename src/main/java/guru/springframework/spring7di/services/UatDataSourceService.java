package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatDataSourceService implements DataSourceService{
    public String getDataSource(){
        return "uat";
    }
}