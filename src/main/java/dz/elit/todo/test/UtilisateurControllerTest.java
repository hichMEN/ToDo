//package dz.elit.todo.test;
//
//
//import dz.elit.todo.model.Utilisateur;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.mock.http.MockHttpOutputMessage;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
//
///**
// * Created by mh.chebihi on 19/10/2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration
//@WebAppConfiguration
//public class UtilisateurControllerTest  {
//
//    @Autowired
//    private WebApplicationContext AppConfig;
//
//
//    private MockMvc mockMvc;
//
//    private @Mock List<Utilisateur> listUsers;
//
//    @Before
//    public void avantTest(){
//        System.out.println("Avant test");
//        mockMvc = MockMvcBuilders.webAppContextSetup(AppConfig).build();
//        MockitoAnnotations.initMocks(this);
//
//    }
//
//    @After
//    public void apresTest(){
//        System.out.println("Apres test");
//    }
//
//
//
//    @Test
//    public void testChercherTous(){
//        mockMvc.perform(get("/user/list")).content(listUsers)
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
//
//    }
//    @Test
//    public void testChercherUtilisateurExist(){
//
//    }
//
//    @Test
//    public void testChercherUtilisateurNotExist(){
//
//    }
//
//    @Test
//    public void testAjouterSansTodo(){
//
//    }
//
//    @Test
//    public void testAjouterAvecTodo(){
//
//    }
//}