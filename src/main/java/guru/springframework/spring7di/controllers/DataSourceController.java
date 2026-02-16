package guru.springframework.spring7di.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.spring7di.services.DataSourceService;

@RestController
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(DataSourceService dataSourceService){
        this.dataSourceService = dataSourceService;
    }

    @GetMapping("/datasource")
    public String getDataSource(){
        return this.dataSourceService.getDataSource();
    }

}
