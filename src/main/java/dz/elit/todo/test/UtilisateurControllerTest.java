package dz.elit.todo.test;

import dz.elit.todo.config.AppConfig;
import dz.elit.todo.model.ToDoList;
import dz.elit.todo.model.Utilisateur;
import dz.elit.todo.service.IUtilisateurService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mh.chebihi on 19/10/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class UtilisateurControllerTest  {

    @Autowired
    private IUtilisateurService utilisateurService;

    private MockMvc mockMvc;

    private List<Utilisateur> listUtilisateur;
    private ToDoList mockedToDo ;

    @Before
    public void avantTest(){
        System.out.println("Avant test");
        listUtilisateur = new ArrayList<Utilisateur>();
    }

    @After
    public void apresTest(){
        System.out.println("Apres test");
    }


    @Test
    public void testChercherTousVide(){
        assertEquals(new ArrayList<Utilisateur>(),listUtilisateur);
    }
    @Test
    public void testChercherTousremplie(){

    }
    @Test
    public void testChercherTousUtilisateurSansTodo(){

    }

    @Test
    public void testChercherTousUtilisateurAvecTodo(){

    }

    @Test
    public void testAjouterSansTodo(){

    }

    @Test
    public void testAjouterAvecTodo(){

    }
}