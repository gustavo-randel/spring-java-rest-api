//package br.com.randel.rest_api.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/v1/hello")
//public class HelloWorldController {
//// 1 endpoint por rota <-- da pra por outro endpoint se adicionar(somar) rota no seu getMapping
//// regra não se aplica a metodos
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public String get() {
//        return "Hello, World GET!";
//    }
//    // end point de localhost:6769/v1/hello?name={caracteres} vai resultar em Hello, {caracteres} na requisição, ta recebendo um query param
//    // falta do param = erro 400 (erro do usuario)
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public String getParam(@RequestParam(value= "name", required = true) String name) {
//        return "Hello, World" + name;
//    }
//
//    // end point de localhost:6769/v1/hello/{caracteres} vai resultar em Hello, {caracteres} na requisição
//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.CREATED)
//    public String idGet(@PathVariable("id") String idd) {
//        return "Hello, " + idd;
//    }
//
//    // auto explicativo, vai requerir do body o parametro
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public String post(@RequestBody String name) {
//        return "Hello, World " + name;
//    }
////    @GetMapping
////    public ResponseEntity<String> helloWorld() {
////        return ResponseEntity.ok("Hello, World!");
////    }
//
////    @GetMapping
////    public ResponseEntity<String> helloWorld() {
////        return new ResponseEntity<>("Hello, World!", HttpStatus.OK);
////    }
//}
