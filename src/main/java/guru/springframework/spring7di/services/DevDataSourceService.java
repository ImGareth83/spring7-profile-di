package guru.springframework.spring7di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service
public class DevDataSourceService implements DataSourceService{
    public String getDataSource(){
        return "dev";
    }
}