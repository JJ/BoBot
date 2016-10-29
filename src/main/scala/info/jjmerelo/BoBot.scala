package info.jjmerelo.BoBot

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._
import com.typesafe.scalalogging.Logger

object BoBot extends TelegramBot with Polling with Commands {
  def token = sys.env("BOBOT_TOKEN")
  val this_log = Logger("BoBot")
  val lines = scala.io.Source.fromFile("hitos.json").mkString
  on("/hello") { implicit msg => _ =>
    reply("Conseguí que funcionara")
		this_log.info("Hello")
  }
}
