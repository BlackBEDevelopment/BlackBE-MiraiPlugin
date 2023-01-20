package work.blackbe.mirai.command

import work.blackbe.mirai.BlackBE
import work.blackbe.mirai.config.Config
import net.mamoe.mirai.console.command.CommandContext
import net.mamoe.mirai.console.command.CompositeCommand
import net.mamoe.mirai.console.command.ConsoleCommandSender
import net.mamoe.mirai.console.plugin.jvm.reloadPluginConfig
import work.blackbe.mirai.config.Global

object BlackBECommand : CompositeCommand(BlackBE.INSTANCE, "blackbe") {
    @SubCommand("reload")
    suspend fun reload(context: CommandContext) {
        if (context.sender is ConsoleCommandSender) {
            BlackBE.INSTANCE.reloadPluginConfig(Config)
            BlackBE.INSTANCE.logger.info("重载配置文件成功")
        }
    }

    @SubCommand("cache")
    suspend fun cache(context: CommandContext, arg: String) {
        if (context.sender is ConsoleCommandSender) {
            if (arg == "clear") {
                Global.RESPONSE_CACHE.clear()
                Global.REPOSITORIES_RESPONSE_CACHE.clear()
                BlackBE.INSTANCE.logger.info("清除缓存成功")
            }
        }
    }
}