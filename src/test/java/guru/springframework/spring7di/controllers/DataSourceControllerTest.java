package guru.springframework.spring7di.controllers;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import guru.springframework.spring7di.services.DataSourceService;

@WebMvcTest(DataSourceController.class)
public class DataSourceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    DataSourceService dataSourceService;

    @Test
    void getDataSourceReturnsMockedValue() throws Exception {
        given(dataSourceService.getDataSource()).willReturn("MOCK-DATA-SOURCE");

        mockMvc.perform(get("/datasource"))
            .andExpect(status().isOk())
            .andExpect(content().string("MOCK-DATA-SOURCE"));
    }

}
