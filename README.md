# Activiti BPM engine customization #

Customize Activiti BPM engine to match Kaltura SaaS and support multiple data-centers.

## Deployment instructions ##

Copy jars to `$CATALINA_BASE/webapps/activiti-explorer/WEB-INF/lib`:

- [java-uuid-generator-3.1.3.jar](https://repo1.maven.org/maven2/com/fasterxml/uuid/java-uuid-generator/3.1.3/java-uuid-generator-3.1.3.jar "java-uuid-generator-3.1.3.jar")
- [KalturaActivitiServer-1.0.0.jar](https://github.com/kaltura/activiti-server/releases/download/rel-1.0.0/KalturaActivitiServer-1.0.0.jar "KalturaActivitiServer-1.0.0.jar")

Edit `$CATALINA_BASE/webapps/activiti-explorer/WEB-INF/activiti-standalone-context.xml` and add under `processEngineConfiguration` bean:

    <property name="idGenerator">
      <bean class="com.kaltura.bpm.server.activiti.datacenters.IdGenerator">
	    <property name="dataCenter" value="1" />
	  </bean>
    </property>
