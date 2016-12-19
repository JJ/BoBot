#!/usr/bin/env scala

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._
import com.typesafe.scalalogging.Logger

object BoBot extends TelegramBot with Polling with Commands {
  def token = sys.env("BOBOT_TOKEN")
  val lines = scala.io.Source.fromFile("hitos.json").mkString
  on("/hola") { implicit msg => _ =>
    reply("Conseguí que funcionara")
    log.info("Hello")
  }
}


object BoBoBot extends App {
  println( "Working " )
  BoBot.run()
}
