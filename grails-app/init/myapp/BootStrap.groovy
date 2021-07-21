package myapp

class BootStrap {

    def groovyPageRenderer

    def init = { servletContext ->
        groovyPageRenderer.render(view: '/email/test')
    }

    def destroy = {
    }
}
