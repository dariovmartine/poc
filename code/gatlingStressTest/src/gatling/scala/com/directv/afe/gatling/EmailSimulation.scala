package com.directv.afe.gatling

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class EmailSimulation extends Simulation {
  
  val httpConf = http.baseURL("http://localhost:8080/sendEmail")

  val scn = scenario("Basic Simulation")
    .exec(http("request_1")
        
    .post("/")
      .body(StringBody("""{ "country" : "AR", "destination" : "dariovmartine@gmail.com" , "template" : "AR-FacturaElectronica-Welcome" , "attributes" : { "Nombre" : "Prueba" , "Apellido" : "Quique" , "Nro Cliente" : "123456789" , "url_link" : "http://www.google.com.ar" } }""")).asJSON
      
    .header("Content-Type", "application/json"));

  setUp(
    scn.inject(rampUsersPerSec(100) to 300 during(5 minutes))
      
  ).protocols(httpConf)

}