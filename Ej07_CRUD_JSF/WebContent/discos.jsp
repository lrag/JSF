<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>    
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">
		Mantenimiento de discos
	</h2>

	<f:view>
	
		<h:form>
		
			<p align="center">
				<h:commandButton value="Vaciar" action="#{discosBB.vaciar}" immediate="true"/>			
				<h:commandButton value="Insertar" action="#{discosBB.insertarDisco}"/>			
				<h:commandButton value="Modificar" action="#{discosBB.modificarDisco}"/>			
				<h:commandButton value="Borrar" action="#{discosBB.borrarDisco}"/>			
			</p>

			<p align="center"> <!-- state of the art -->
				<h:inputHidden value="#{disco.idDisco}"/>
				<h:panelGrid columns="3">
					
					<h:outputLabel for="titulo" value="Título"/>
					<h:inputText id="titulo" value="#{disco.titulo}" required="true"/>
					<h:message for="titulo"/>
	
					<h:outputLabel for="fecha" value="Fecha"/>
					<h:inputText id="fecha" value="#{disco.fecha}">
						<f:convertDateTime pattern="dd/MM/yyyy"/>
					</h:inputText>
					<h:message for="fecha"/>
	
					<h:outputLabel for="grupo" value="Grupo"/>
					<h:inputText id="grupo" value="#{disco.grupo}" />
					<h:message for="grupo"/>
				
				</h:panelGrid>		
			</p>		

		</h:form>
				
		<h:form>		

			<h:dataTable value="#{discosBB.listaDiscos}" var="d" border="1">
			
				<h:column>
					<f:facet name="header">
						<h:outputText value="Título"/>
					</f:facet>
					<h:commandLink value="#{d.titulo}" action="#{discosBB.seleccionarDisco(d.idDisco)}">
						<%
						//<f:setPropertyActionListener value="#{d.idDisco}" target="#{discosBB.idDisco}"/>
						%>
					</h:commandLink>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Fecha"/>
					</f:facet>
					<h:outputText value="#{d.fecha}">
						<f:convertDateTime pattern="dd/MM/yyyy"/>
					</h:outputText>
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Grupo"/>
					</f:facet>
					<h:outputText value="#{d.grupo}"/>
				</h:column>
			
			</h:dataTable>	
						
	
		</h:form>	
	
	</f:view>

</body>
</html>