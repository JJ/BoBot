package info.jjmerelo.BoBot

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._
import com.typesafe.scalalogging.Logger
import scala.util.parsing.json._

object BoBot extends TelegramBot with Polling with Commands {
  def token = sys.env("BOBOT_TOKEN")
  val lines = scala.io.Source.fromFile("hitos.json").mkString
  val hitos = JSON.parseFull( lines )
  val solo_hitos = hitos.getOrElse( hitos )
  on("/hey") { implicit msg => _ =>
    reply("Conseguí que funcionara")
    log.info("Hello")
  }
}
