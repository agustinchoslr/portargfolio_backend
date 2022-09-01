//package tech.agustinchoslr.portfolio.util;
//
//import tech.agustinchoslr.portfolio.security.entity.Rol;
//import tech.agustinchoslr.portfolio.security.enums.RolNombre;
//import tech.agustinchoslr.portfolio.security.service.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//// Comentar o borrar clase despues del primer run de la aplicación
//@Component
//public class CreateRoles implements CommandLineRunner {
//
//    @Autowired
//    RolService rolService;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolNombre.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//    }
//}