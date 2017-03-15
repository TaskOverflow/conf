package conf


import grails.rest.*
import grails.converters.*

class FeatureFlippingController extends RestfulController {
    static responseFormats = ['json', 'xml']

    FeatureFlippingController() {
        super(String)
    }

    def index() {
        def featureState
        try {
            featureState = new File('data/'+(params?.id as String)).getText('UTF-8')
        } catch (Exception e) {
            featureState = "unknown"
        }
        respond status: featureState
    }
}
