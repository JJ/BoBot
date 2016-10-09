package info.jjmerelo.BoBot

import info.mukel.telegrambot4s._, api._, methods._, models._, Implicits._

object BoBot extends TelegramBot with Polling with Commands {
  def token = sys.env("BOBOT_TOKEN")
  on("/hello") { implicit msg => _ =>
    reply("Conseguí que funcionara")
  }
}


