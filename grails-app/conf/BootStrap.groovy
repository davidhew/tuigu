import com.tuigu.data.init.InitStockRecordHistory
import grails.util.Environment

class BootStrap {

	def init = { servletContext ->
		//		dropSchema()
		//		createSchema()
		switch (Environment.getCurrent()) {
			case Environment.DEVELOPMENT:
				initAll()

				break;

			case Environment.TEST:
				initAll()
				break;

			case Environment.PRODUCTION:
				break;


		}
	}
	def destroy = {
	}

	def initAll(){
		def initDataCollections
		initDataCollections = [
			new InitStockRecordHistory()//,
			//new InitProductPricing()
		]

		try {
			initDataCollections.each {it.populateData()}
		} catch (Throwable t) {
			log.error(t, t)
		}
	}
}
