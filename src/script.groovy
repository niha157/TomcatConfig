def serverXmlPath = "C://Users/rohit/Downloads/apache-tomcat-10.1.28/conf/server.xml"
def keystorePath = "C:/Users/rohit/Downloads/keystore.jks"
def keystorePassword = "password"
keystore.jks
script.groovy
server.xml
def serverXmlFile = new File(serverXmlPath)
def serverXml = serverXmlFile.text

// Add SSL connector if not already present
if (!serverXml.contains("Connector port=\"8443\"")) {
    def sslConfig = """
    <Connector port="8443" protocol="org.apache.coyote.http11.Http11NioProtocol"
               maxThreads="150" SSLEnabled="true">
        <SSLHostConfig>
            <Certificate certificateKeystoreFile="${keystorePath}"
                         type="RSA" certificateKeystorePassword="${keystorePassword}"/>
        </SSLHostConfig>
    </Connector>
    """
    serverXml = serverXml.replace("</Service>", sslConfig + "</Service>")
    serverXmlFile.write(serverXml)
}

