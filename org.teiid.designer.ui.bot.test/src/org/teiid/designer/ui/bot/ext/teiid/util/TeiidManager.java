package org.teiid.designer.ui.bot.ext.teiid.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jboss.tools.ui.bot.ext.config.TestConfigurator;

public class TeiidManager {

	public static Connection getConnection(String vdb) throws SQLException {
		String path = TestConfigurator.currentConfig.getServer().runtimeHome;
		DriverManager.registerDriver(new TeiidDriver(path + "/client/teiid-client.jar"));
		return DriverManager.getConnection("jdbc:teiid:" + vdb + "@mm://localhost:31000", "user", "user");
	}
}
