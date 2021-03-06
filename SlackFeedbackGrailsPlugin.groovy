class SlackFeedbackGrailsPlugin {
    // the plugin version
    def version = "2.1.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.3 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp",
        "grails-app/views/test/*",
        "grails-app/views/layouts/semantic.gsp",
		"grails-app/conf/BootStrap.groovy",
		"grails-app/domain/com/theconnman/feedback/User.groovy",
		"grails-app/controllers/com/theconnman/feedback/TestController.groovy",
		"grails-app/services/com/theconnman/feedback/SpringSecurityService.groovy"
    ]

    // TODO Fill in these fields
    def title = "Slack Feedback Plugin" // Headline display name of the plugin
    def author = "TheConnMan"
    def authorEmail = "brian@theconnman.com"
    def description = 'Chat box for quick app feedback sent to a Slack channel from a Grails project. Optionally the plugin can be configured to allow responses from Slack back to the application users.'

    // URL to the plugin's documentation
    def documentation = "https://github.com/TheConnMan/Slack-Feedback"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "MIT"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/TheConnMan/Slack-Feedback/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/TheConnMan/Slack-Feedback" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { ctx ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
