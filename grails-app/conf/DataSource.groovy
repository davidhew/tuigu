dataSource {
    pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = org.hibernate.dialect.MySQL5Dialect
	properties {
		maxActive = 50
		maxIdle = 25
		minIdle = 5
		initialSize = 5
		minEvictableIdleTimeMillis = 60000
		timeBetweenEvictionRunsMillis = 60000
		maxWait = 10000
	validationQuery = "/* ping */"

	}
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            //dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			dbCreate = "create-drop"
			logSql = true
            url = "jdbc:mysql://localhost/tuigu"
            username = "root"
            password = "19971997"
        }
		
	
    }
    test {
        dataSource {
            dbCreate = "create-drop"
            logSql = true
            url = "jdbc:mysql://localhost/tuigu"
            username = "root"
            password = "ccclubs2013"
        }
    }
    localtest {
        dataSource {
            dbCreate = "create-drop"
            logSql = true
            url = "jdbc:mysql://localhost/tuigu"
            username = "root"
            password = "ccclubs2013"
        }
    }
	
	datadump {
		dataSource {
			dbCreate = "create-drop"
			logSql = true
			url = "jdbc:mysql://localhost/tuigu"
			username = "root"
			password = "ccclubs2013"
		}
		
		dataSource_existing {
				username = "adminsys"
				password = "admin@sys"
				url = "jdbc:sqlserver://60.191.57.34:36799;databaseName=EVnetCarSharing"
			
				driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
				dialect = "org.hibernate.dialect.SQLServerDialect"
			}
	}
	
    production {
        dataSource {
			dbCreate = "create-drop"
			url = "jdbc:mysql://42.120.21.126/tuigu"
            username = "root"
            password = "19971997"
		
//            dbCreate = "update"
//            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
//            pooled = true
//            properties {
//               maxActive = -1
//               minEvictableIdleTimeMillis=1800000
//               timeBetweenEvictionRunsMillis=1800000
//               numTestsPerEvictionRun=3
//               testOnBorrow=true
//               testWhileIdle=true
//               testOnReturn=true
//               validationQuery="SELECT 1"
        }
    }
}
