package info.jjmerelo.BoBot

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._

object BoBot extends TelegramBot with Polling with Commands {
  def token = sys.env("BOBOT_TOKEN")
  val lines = scala.io.Source.fromFile("hitos.json").mkString
  on("/hello") { implicit msg => _ =>
    reply("Conseguí que funcionara")
  }
}


