package info.jjmerelo.BoBot

import com.bot4s.telegram.{api, methods, models, Implicits}
import com.bot4s.telegram.api.declarative.Commands
import com.bot4s.telegram.clients.{FutureSttpClient, ScalajHttpClient}
import com.bot4s.telegram.future.{Polling, TelegramBot}
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
