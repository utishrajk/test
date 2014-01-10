package controllers

import play.api._
import play.api.mvc._
import models.Product

object Application extends Controller {
  
  def index = Action {
    
    request =>
      //Ok("Got request[" + request + "]")
      Redirect("/products")
    
  }
  
  def list = Action {
    
    implicit request =>
      val products = Product.findAll
      
      Ok(views.html.list(products))
    
  }
  
}