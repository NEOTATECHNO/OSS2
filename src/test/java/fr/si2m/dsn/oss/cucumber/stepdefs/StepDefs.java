package fr.si2m.dsn.oss.cucumber.stepdefs;

import fr.si2m.dsn.oss.Oss2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Oss2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
