package com.example.hms.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hms.test.TestEntity;
import com.example.hms.test.TestRepository;

@RestController
public class WelcomeController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping("api/v1/welcome")
    public String welcome() {
        return "Welcome to HMS";
    }

    @GetMapping("api/v1/test")
    public String testConnection() {
        TestEntity testEntity = new TestEntity();
        testEntity.setTestColumn("Test Value");
        testRepository.save(testEntity);
        return "Test Connection Successful (ID = " + testEntity.getId() + ")";
    }

    @GetMapping("api/v1/test/all")
    public Iterable<TestEntity> getAllTestEntities() {
        return testRepository.findAll();
    }
    
}
