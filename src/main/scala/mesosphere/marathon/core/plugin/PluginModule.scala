package mesosphere.marathon.core.plugin

import mesosphere.marathon.MarathonConf
import mesosphere.marathon.core.plugin.impl.PluginManagerImpl

class PluginModule(config: MarathonConf) {

  lazy val pluginManager: PluginManager = PluginManagerImpl(config)

}
