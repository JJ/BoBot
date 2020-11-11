package info.jjmerelo.BoBot

import cats.instances.future._
import cats.syntax.functor._

import com.bot4s.telegram.api.RequestHandler
import com.bot4s.telegram.api.declarative.Commands
import com.bot4s.telegram.clients.{FutureSttpClient, ScalajHttpClient}
import com.bot4s.telegram.future.{Polling, TelegramBot}

import scala.util.Try
import scala.concurrent.Future

import com.typesafe.scalalogging.Logger
import scala.util.parsing.json._

object BoBot extends TelegramBot
    with Polling
    with Commands[Future] {

  val log = Logger("BoBot")
  def token = sys.env("BOBOT_TOKEN")
  val lines = scala.io.Source.fromFile("hitos.json").mkString
  val hitos = JSON.parseFull( lines )
  val solo_hitos = hitos.getOrElse( hitos )

  onCommand("hey") { implicit msg =>
    log.info("Hello")
    reply("Conseguí que funcionara").void
  }
}
