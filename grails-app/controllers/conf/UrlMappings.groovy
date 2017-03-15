package conf

class UrlMappings {

    static mappings = {
        get "/$id(.$format)?"(controller: "featureFlipping", action:"index")

        "/"(controller: 'featureFlipping', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
