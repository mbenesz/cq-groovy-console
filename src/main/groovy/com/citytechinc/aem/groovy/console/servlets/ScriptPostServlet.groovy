package com.citytechinc.aem.groovy.console.servlets

import com.citytechinc.aem.groovy.console.GroovyConsoleService
import com.citytechinc.aem.groovy.console.response.RunScriptResponse
import groovy.util.logging.Slf4j
import org.apache.felix.scr.annotations.Reference
import org.apache.felix.scr.annotations.sling.SlingServlet
import org.apache.sling.api.SlingHttpServletRequest

@SlingServlet(paths = "/bin/groovyconsole/post")
@Slf4j("LOG")
class ScriptPostServlet extends AbstractScriptPostServlet {

    @Reference
    GroovyConsoleService consoleService

    @Override
    protected RunScriptResponse runScript(SlingHttpServletRequest request) {
        consoleService.runScript(request)
    }
}
